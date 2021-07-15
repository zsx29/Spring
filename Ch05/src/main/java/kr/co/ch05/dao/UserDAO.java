package kr.co.ch05.dao;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class UserDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(UserVO vo) {

		mybatis.insert("mapper.user.INSERT_USER", vo);
	}

	public UserVO selectUser(String uid) {
		return mybatis.selectOne("mapper.user.SELECT_USER", uid);
	}
	
	public List<UserVO> selectUsers() {

		return mybatis.selectList("mapper.user.SELECT_USERS");
	}
	
	public void updateUser(UserVO vo) {
		mybatis.update("mapper.user.UPDATE_USER", vo);
	}
	
	public void deleteUser(String uid) {

		mybatis.delete("mapper.user.DELETE_USER", uid);
	}
}


