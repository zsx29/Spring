package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.ShopDao;
import kr.co.kmarket.vo.CartVo;
import kr.co.kmarket.vo.OrderVo;
import kr.co.kmarket.vo.ProductVo;

@Service
public class ShopService {

	@Autowired
	public ShopDao dao;
	
	
	public List<ProductVo> selectProducts(int cate1, int cate2, String sort){
		return dao.selectProducts(cate1, cate2, sort);
	};
	
	public ProductVo selectTitles(int cate1, int cate2) {
		return dao.selectTitles(cate1, cate2);
	};
	
	public void insertProducts(ProductVo vo){
		
	};
	
	public ProductVo selectProduct(int code){
		return dao.selectProduct(code);
	};
	
	public void updateProducts(int code) {
		
	};
	
	public void deleteProducts(int code) {
		
	};
	
	// 장바구니 추가
	public void insertCart(CartVo vo){
		dao.insertCart(vo);
	};
	
	// 장바구니 중복
	public int selectCountCart(int code, String uid){
		return dao.selectCountCart(code, uid);
	};
	
	// 장바구니 
	public List<CartVo> selectCart(String uid){
		return dao.selectCart(uid);
	};
	
	// 주문하기
	public void insertOrder(OrderVo vo){
		dao.insertOrder(vo);
	};
	
	// 상세주문하기
	public void insertOrderDetail(int orderId, int code){
		dao.insertOrderDetail(orderId, code);
	};
	
	//
	public List<OrderVo> selectOrders(int orderId){
		return dao.selectOrders(orderId);
	};
	
	// 최종주문
	public int updateOrder(OrderVo vo){
		return dao.updateOrder(vo);
	};
	
	

	
}









