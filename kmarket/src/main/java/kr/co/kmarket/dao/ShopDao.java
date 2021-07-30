package kr.co.kmarket.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CartVo;
import kr.co.kmarket.vo.OrderVo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface ShopDao {


	public List<ProductVo> selectProducts(int cate1, int cate2, String sort);
	public void insertProducts(ProductVo vo);
	public ProductVo selectProduct(int code);
	public ProductVo selectTitles(int cate1, int cate2);
	public void updateProducts(int code);
	public void deleteProducts(int code);
	
	// 장바구니 추가
	public void insertCart(CartVo vo);
	
	// 장바구니 중복
	public int selectCountCart(int code, String uid);
	
	// 장바구니 삭제
	public void deleteCart(String uid, int codes);
	
	// 장바구니
	public List<CartVo> selectCart(String uid); 
	
	// 주문하기
	public void insertOrder(OrderVo vo);
	
	// 상세주문하기
	public void insertOrderDetail(int orderId, int code);
	
	//
	public List<OrderVo> selectOrders(int orderId);
	
	// 최종주문
	public int updateOrder(OrderVo vo);
}
