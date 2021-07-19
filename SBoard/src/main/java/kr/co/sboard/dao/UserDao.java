package kr.co.sboard.dao;

import java.util.List;

import kr.co.sboard.vo.MemberVO;

public interface UserDao {

	public void insertUser(MemberVO vo);
	public List<MemberVO> selectUsers();
	public MemberVO selectUser(MemberVO vo);
	public void updateUser();
	public void deleteUser();
	
}
