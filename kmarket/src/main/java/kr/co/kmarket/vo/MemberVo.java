package kr.co.kmarket.vo;

import lombok.Data;

@Data
public class MemberVo {

	private String uid;
	private String pass;
	private String name;
	private int gender;
	private String hp;
	private String email;
	private int type;
	private int point;
	private int grade;
	private String zip;
	private String addr1;
	private String addr2;
	private String company;
	private String ceo;
	private String bizRegNum;
	private String commRepNum;
	private String tel;
	private String manager;
	private String managerHp;
	private String fax;
	private String ip;
	private String leaveDate;
	private String rdate;
	private int etc1;
	private int etc2;
	private String etc3;
	private String etc4;
	private String etc5;

	// 이용약관 추가필드
	private String terms;
	private String privacy;
	private String location;
	private String finance;
	private String tax;
}
