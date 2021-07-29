package kr.co.kmarket.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.kmarket.service.MemberService;
import kr.co.kmarket.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/member/join")
	public String join() {
		return "/member/join";
	}
	
	@GetMapping("/member/logout")
	public String logout(HttpSession sess) {

		
		sess.invalidate();
		return "redirect:/index";
		
	}
	
	@GetMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@PostMapping("/member/login")
	public String login(HttpSession sess, String uid, String pass) {

		
		MemberVo memberVo = service.selectMember(uid, pass);
		
		if(memberVo != null) {
			// 로그인 성공
			sess.setAttribute("sessMember", memberVo);
			return "redirect:/index";
			
		}else {
			// 로그인 실패
			return "redirect:/member/login?success=0";
		}
	}
	
	@GetMapping("/member/register")
	public String register() {
		return "/member/register";
	}
	
	@PostMapping("/member/register")
	public String register(MemberVo vo) {

		service.insertMember(vo);
		
		return "redirect:/member/login";
		
	}
	
	@GetMapping("/member/register-seller")
	public String registerSeller() {
		return "/member/register-seller";
	}
	
	@GetMapping("/member/terms")
	public String terms(MemberVo vo, Model model) {

		
		MemberVo terms = service.selectTerms(vo);
		model.addAttribute("terms", terms);

		return "/member/terms";
	}
	
}
