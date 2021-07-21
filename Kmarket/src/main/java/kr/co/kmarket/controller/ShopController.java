package kr.co.kmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
	@GetMapping("/shop/list")
	public String list() {
		return "/shop/list";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@GetMapping("/shop/order-complete")
	public String orderComplete() {
		return "/shop/order-complete";
	}
	
	@GetMapping("/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@GetMapping("/shop/view")
	public String view() {
		return "/shop/view";
	}
	
}
