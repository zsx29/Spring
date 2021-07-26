package kr.co.kmarket.service.admin;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.kmarket.dao.admin.AdminProductDao;
import kr.co.kmarket.vo.Cate1Vo;
import kr.co.kmarket.vo.Cate2Vo;
import kr.co.kmarket.vo.ProductVo;

@Service
public class AdminProductService {

	@Autowired
	private AdminProductDao dao;
	
	
	//===================================================
	public void insertProduct(ProductVo vo) {};
	
	public ProductVo selectProduct() {
		return null;
	};
	
	public List<ProductVo> selectProducts(){
		return null;
	};
	
	public void updateProduct(ProductVo vo) {};
	
	public void deleteProduct(ProductVo vo) {};
	
	
	// ================1차 카테고리 가져오기===================
	public List<Cate1Vo> selectCate1(){
		return dao.selectCate1();
		
	};
	
	// ================2차 카테고리 가져오기===================
	public List<Cate2Vo> selectCate2(int cate1){
		return dao.selectCate2(cate1);
	}

	// ================상품이미지 업로드===================
	public ProductVo uploadThumb(ProductVo vo) {
		
		File file = new File("src/main/resources/static/thumb/");
		String path = file.getAbsolutePath();
		
		MultipartFile[] files = {
								vo.getFile1(),
								vo.getFile2(),
								vo.getFile3(),
								vo.getFile4()
							   };
		
		for(int i = 0; i < files.length; i++) {
			
			MultipartFile mf = files[i];
			
			if (!mf.isEmpty()) {
				// 파일을 첨부했을 경우
				String name = mf.getOriginalFilename();
				String ext = name.substring(name.lastIndexOf("."));
				String uName = UUID.randomUUID().toString() + ext;
				String fullPath = path + "/" + vo.getCate1() + "/" + vo.getCate2() + "/";
				
				try {
					
					Path root = Paths.get(fullPath);
					Files.createDirectories(root);
					
					mf.transferTo(new File(fullPath+uName));
					
					if(i == 0) vo.setThumb1(uName);
					if(i == 1) vo.setThumb2(uName);
					if(i == 2) vo.setThumb3(uName);
					if(i == 3) vo.setDetail(uName);
					
				}catch(Exception e) {
					
					e.printStackTrace();
					
				}
				
			}
			
		}
		
		return vo;
	} // uploadThumb-end...
	
	
	
}



























