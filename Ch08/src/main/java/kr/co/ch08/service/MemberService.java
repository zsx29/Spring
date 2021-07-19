package kr.co.ch08.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch08.dao.MemberDao;
import kr.co.ch08.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;

	public void insertMember(MemberVO vo) {
		dao.insertUser(vo);
		
	}
}
