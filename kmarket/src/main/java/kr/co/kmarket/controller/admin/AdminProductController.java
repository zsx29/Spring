package kr.co.kmarket.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.kmarket.service.admin.AdminProductService;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;
import kr.co.kmarket.vo.ProductVo;

@Controller
public class AdminProductController {
	
	@Autowired
	private AdminProductService service;
	
	@GetMapping("/admin/product/list")
	public String list() {
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
	@PostMapping("/admin/product/register")
	public String register(ProductVo vo, HttpServletRequest req) {
		
		String ip = req.getRemoteAddr();
		vo.setIp(ip);
		
		// 첨부파일 업로드
		ProductVo pvo = service.uploadThumb(vo);
		// 상품정보 테이블 저장
		service.insertProduct(pvo);
		
		return "redirect:/admin/product/register";
	}
	
	// 1차 카테고리
	@ResponseBody
	@GetMapping("/admin/product/getCate1")
	public List<Cate1Vo> getCate1() {
		List<Cate1Vo> cate1s = service.selectCate1();
		return cate1s;
	}
	
	// 2차 카테고리
	@ResponseBody
	@GetMapping("/admin/product/getCate2")
	public List<Cate2Vo> getCate2(int cate1) {
		List<Cate2Vo> cate2s = service.selectCate2(cate1);
		return cate2s;
	}
	
}




