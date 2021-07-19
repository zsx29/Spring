package kr.co.sboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.sboard.dao.UserDao;
import kr.co.sboard.vo.MemberVO;

@Service
public class UserService {

	private UserDao dao;
	
	public void insertUser(MemberVO vo) {
		
	};
	public List<MemberVO> selectUsers(){
		return dao.selectUsers();
	};
	public MemberVO selectUser(MemberVO vo) {
		return dao.selectUser(vo);
	};
	public void updateUser() {
		
	};
	public void deleteUser() {
		
	};
}
