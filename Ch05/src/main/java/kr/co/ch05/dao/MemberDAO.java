package kr.co.ch05.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	private SqlSessionTemplate mybatis;

	public void insertMember(MemberVO vo) {
		mybatis.insert("mapper.member.INSERT_MEMBER", vo);
	}
	
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("mapper.member.SELECT_MEMBER", uid);
	}
	
	public List<MemberVO> selectMembers() {
		return mybatis.selectList("mapper.member.SELECT_MEMBERS");
	}
	
	public void updateMember(MemberVO vo) {
		mybatis.update("mapper.member.UPDATE_MEMBER", vo);
	}	
	
	public void deleteMember(String uid) {
		mybatis.delete("mapper.member.DELETE_MEMBER", uid);
	}
	
	
}