package kr.co.ch08.dao;

import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.MemberVO;


@Repository
public interface MemberDao {

	public void insertUser(MemberVO vo);
}
