package kr.co.ch05.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.UserDAO;
import kr.co.ch05.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;

	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	
	public void selectUser() {}
	
	public void selectUsers() {}
	
	public void updateUser() {}
	
	public void deleteUser() {}
	
}
