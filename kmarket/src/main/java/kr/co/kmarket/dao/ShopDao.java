package kr.co.kmarket.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CartVo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface ShopDao {


	public List<ProductVo> selectProducts(int cate1, int cate2, String sort);
	public void insertProducts(ProductVo vo);
	public ProductVo selectProduct(int code);
	public ProductVo selectTitles(int cate1, int cate2);
	public void updateProducts(int code);
	public void deleteProducts(int code);
	
	// 장바구니
	public void insertCart(CartVo vo);
	
	// 장바구니 중복
	public int selectCountCart(int code, String uid);
	
	
}
