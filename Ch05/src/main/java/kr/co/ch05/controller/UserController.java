package kr.co.ch05.controller;

import java.util.List;


import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.UserService;
import kr.co.ch05.vo.UserVO;

@Controller
public class UserController {
	
	@Inject
	private UserService service;

	@GetMapping("/user/list")
	public String list(Model model) {


		List<UserVO> users = service.selectUsers();
		
		model.addAttribute("users", users);
		
		return "/user/list";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "/user/register";
	}
	
	@PostMapping("/user/register")
	public String register(UserVO vo) {
		
		service.insertUser(vo);
		
		return "/user/register";
	}
	
	@GetMapping("/user/modify")
	public String modify(String uid, Model model) {
		
		UserVO user = service.selectUser(uid);
		
		model.addAttribute("user", user);
		
		return "/user/modify";
	}
	
	@PostMapping("/user/modify")
	public String modify(UserVO vo) {
		
		service.updateUser(vo);
		
		return "redirect:/user/list";
	}
	
	@GetMapping("/user/delete")
	public String delete(String uid) {

		
		service.deleteUser(uid);
		
		return "redirect:/user/list";
	}
	
	
	
}









