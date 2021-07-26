package kr.co.kmarket.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;
import kr.co.kmarket.vo.ProductVo;

@Repository
public interface AdminProductDao {

	public void insertProduct(ProductVo vo);
	public ProductVo selectProduct();
	public List<ProductVo> selectProducts();
	public void updateProduct(ProductVo vo);
	public void deleteProduct(ProductVo vo);
	
	// 1차 카테고리 가져오기
	public List<Cate1Vo> selectCate1();
	
	// 2차 카테고리 가져오기
	public List<Cate2Vo> selectCate2(int cate1);
	
}
