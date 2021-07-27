package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.ShopDao;
import kr.co.kmarket.vo.CartVo;
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
	
	// 장바구니
	public void insertCart(CartVo vo){
		dao.insertCart(vo);
	};
	
	// 장바구니 중복
	public int selectCountCart(int code, String uid){
		return dao.selectCountCart(code, uid);
	};

	
}
