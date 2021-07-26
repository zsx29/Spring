package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.MainDao;
import kr.co.kmarket.vo.CategoriesVo;
import kr.co.kmarket.vo.ProductVo;

@Service
public class MainService {

	@Autowired
	private MainDao dao;
	
	public List<CategoriesVo> selectCategories(){
		return dao.selectCategories();
	}
	
	public List<ProductVo> selectHitProduct(){
		return dao.selectHitProduct();
	}
	
	public List<ProductVo> selectRecommendProduct(){
		return dao.selectRecommendProduct();
	}
	
	public List<ProductVo> selectLatestProduct(){
		return dao.selectLatestProduct();
	}
	public List<ProductVo> selectDiscountProduct(){
		return dao.selectDiscountProduct();
	}
}