package kr.co.ch07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.vo.UserVO;

@Controller
public class MainController {

	@GetMapping(value= {"/", "/index"})
	public String index(Model model) {
		
		String title = "스프링부터 타임리프 연습하기";
		String hello = "hello thymeleaf";
		
		
		UserVO user= new UserVO();
		user.setUid("a101");
		user.setName("홍길동");
		user.setHp("010-1234-0000");
		user.setAge(21);
		
		List<UserVO> users = new ArrayList<UserVO>();
		users.add(new UserVO("a101", "김유신", "010-1511-1212", 21));
		users.add(new UserVO("a102", "홍길동", "010-1811-1212", 22));
		users.add(new UserVO("a103", "강감찬", "010-1611-1212", 23));
		users.add(new UserVO("a104", "이순신", "010-1411-1212", 24));
		users.add(new UserVO("a105", "박재형", "010-1211-1212", 25));
		
		
		//======================================
		model.addAttribute("title", title);
		model.addAttribute("hello", hello);
		model.addAttribute("user", user);
		model.addAttribute("users", users);
		
		
		return "/index";
			
	}
	
	@GetMapping("/include")
	public String include() {
		return "/include";
	}
	
	
	
	
	
	
	
	
}



















