package kr.co.kmarket.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import kr.co.kmarket.service.MemberService;
import kr.co.kmarket.service.ShopService;
import kr.co.kmarket.vo.CartVo;
import kr.co.kmarket.vo.MemberVo;
import kr.co.kmarket.vo.OrderVo;
import kr.co.kmarket.vo.ProductVo;

@Controller
public class ShopController {

	@Autowired
	private ShopService service;
	@Autowired
	private MemberService Memberservice;

	@GetMapping("/shop/cart")
	public String cart(HttpSession sess, Model model) {

		MemberVo memberVo = (MemberVo) sess.getAttribute("sessMember");
		if (memberVo != null) {
			
			String uid = memberVo.getUid();		
			List<CartVo> products = service.selectCart(uid);
			model.addAttribute("products", products);
			return "/shop/cart";
			
		} else {
			
			return "redirect:/member/login?success=103";

		}
		
	}
	
	// 장바구니 추가
	@ResponseBody
	@PostMapping("/shop/cart")
	public String cart(CartVo vo, HttpSession sess) {

		MemberVo memberVo = (MemberVo) sess.getAttribute("sessMember");
		
		int result = 0;
		
		if (memberVo != null) {
			// 로그인 했을 경우...
			
			String uid = memberVo.getUid();
			int code = vo.getCode();
			vo.setUid(uid);
			
			
			int count = service.selectCountCart(code, uid);
			
			if (count < 1) {
				// 장바구니에 상품이 없으면...
				service.insertCart(vo);
				result = 1;
				
			} else {
				// 장바구니에 이미 상품이 있으면...
				result = 3;
			}
			
		}else {
			// 로그인 안했을 경우...
			
			result = 2;

		}
		
		JsonObject json = new JsonObject();
		json.addProperty("result", result);
		
		return new Gson().toJson(json);
		
	}
		
	// 장바구니 삭제
	@ResponseBody
	@PostMapping("/shop/del")
	public String delCart(String uid, int[] codes) {

		int size = codes.length;
		
		for(int i = 0; i < size; i++) {
			service.deleteCart(uid, codes[i]);
		}
		
		JsonObject json = new JsonObject();
		json.addProperty("uid", 1);
		
		return new Gson().toJson(json);
	}
	
	@GetMapping("/shop/order")
	public String order(int orderId, Model model, HttpSession sess) {
		
		
		MemberVo memberVo = (MemberVo) sess.getAttribute("sessMember");
		if (memberVo == null) {
			// 로그인 안했으면...
			return "redirect:/member/login?success=105";
			
		}else {
			// 로그인 했으면...
			List<OrderVo> orders = service.selectOrders(orderId);
			model.addAttribute("orders", orders);          // 주문상품 뿌리기
			model.addAttribute("memberVo", memberVo);	   // 배송정보에 사용자 정보 뿌리기
			model.addAttribute("infoData", orders.get(0)); // 최정결제 정보 뿌리기
			
			return "/shop/order";
		}
		
	}

	@ResponseBody
	@PostMapping("/shop/order")
	public String order(OrderVo vo) {

		
		service.insertOrder(vo);
		
		// 방금 insert한 데이터 orderId
		int orderId = vo.getOrderId();
		
		for(int code : vo.getCodes()) {			
			
			service.insertOrderDetail(orderId, code);
			
		}
		
		JsonObject json = new JsonObject();
		json.addProperty("orderId", orderId);
		
		return new Gson().toJson(json);
	}

	@GetMapping("/shop/order-complete")
	public String orderComplete(HttpSession sess, int orderId, Model model) {

		MemberVo memberVo = (MemberVo) sess.getAttribute("sessMember");
		if (memberVo == null) {
			// 로그인 안했으면...
			return "redirect:/member/login?success=105";
		}else {
			// 로그인 했으면...
			List<OrderVo> orders = service.selectOrders(orderId);
			model.addAttribute("orders", orders);
		}
		
		
		return "/shop/order-complete";
	}
	
	// 주문 최종완료 page
	@ResponseBody
	@PostMapping("/shop/order-complete")
	public String orderComplete(OrderVo vo) {

		int result = service.updateOrder(vo);

		//memberService.updatePoint();
		
		JsonObject json = new JsonObject();
		json.addProperty("result", result);
		
		return new Gson().toJson(json);
	}
	
	@GetMapping("/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@GetMapping("/shop/view")
	public String view(Model model, int code) {

		
		ProductVo product = service.selectProduct(code);
		model.addAttribute("product", product);
		
		return "/shop/view";
		
	}
	
	@GetMapping("/shop/list")
	public String list(Model model, int cate1, int cate2, String sort) {

		ProductVo titles = service.selectTitles(cate1, cate2);
		List<ProductVo> products = service.selectProducts(cate1, cate2, sort);
		
		
		model.addAttribute("products", products);
		model.addAttribute("titles", titles);
		model.addAttribute("cate1", cate1);
		model.addAttribute("cate2", cate2);
		
		
		return "/shop/list";
		
	}
	
}

























