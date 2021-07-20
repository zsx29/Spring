package kr.co.kmarket.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMainController {

	@GetMapping(value = {"/", "/admin/index"})
	public String index() {
		return "/admin/index";
	}
	
}
