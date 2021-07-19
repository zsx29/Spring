package kr.co.ch08.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.dao.UserDao;
import kr.co.ch08.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	
	public List<UserVO> selectUsers(){
		return dao.selectUsers();
	}
	
	public void delete(String uid) {
		dao.deleteUser(uid);
	}

	public void updateUser(UserVO vo) {
		dao.updateUser(vo);
		
	}

	public UserVO selectUser(String uid) {
		return dao.selectUser(uid);
	}
}
