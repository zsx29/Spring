package kr.co.ch04;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class MainController {

	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting";
	}
}
