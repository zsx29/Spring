package kr.co.sboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.sboard.service.UserService;
import kr.co.sboard.vo.MemberVO;

@Controller
public class UserController {

	private UserService service;
	
	@GetMapping(value = {"/", "/index"})
	public String index(HttpSession sess) {
		
		MemberVO member = (MemberVO) sess.getAttribute("sessMember");
		
		if(member == null) {
			// 로그인 안했으면
			return "forward:/user/login";
		}else {
			// 로그인 했으면
			return "forward:/list";
		}
		
	}
	
	@GetMapping("/user/login")
	public String login() {
		return "/user/login";
	}
	
	
	@GetMapping("/user/logout")
	public String logout(HttpSession sess) {
		
		sess.invalidate();
		
		return "redirect:/user/login";
	}
	
	@PostMapping("/user/login")
	public String login(HttpSession sess, MemberVO vo) {
		
		MemberVO member = service.selectUser(vo);
		
		if(member != null) {
			
			sess.setAttribute("sessMember", member);
			return "redirect:/list";
			
		}else {
			
			return "redirect:/user/login?sucsess=101";
		}
		
		
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@GetMapping("/user/terms")
	public String terms() {
		return "/user/terms";
	}
}
