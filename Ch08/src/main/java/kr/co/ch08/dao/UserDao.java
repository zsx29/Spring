package kr.co.ch08.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVO;

@Repository
public interface UserDao {

	public void insertUser(UserVO vo);

	public List<UserVO> selectUsers();

	public void deleteUser(String uid);

	public UserVO selectUser(String uid);

	public void updateUser(UserVO vo);

}
