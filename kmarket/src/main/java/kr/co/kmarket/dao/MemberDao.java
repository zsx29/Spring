package kr.co.kmarket.dao;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.MemberVo;

@Repository
public interface MemberDao {

	public MemberVo selectMember(String uid, String pass);
	
}
