package kr.co.kmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.MemberDao;
import kr.co.kmarket.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	// 로그인
	public MemberVo selectMember(String uid, String pass){
		return dao.selectMember(uid, pass);
	};
	
	// 이용약관
	public MemberVo selectTerms(MemberVo vo){
		return dao.selectTerms(vo);
	};
	
	// 회원가입
	public void insertMember(MemberVo vo){
		dao.insertMember(vo);
	};
}
