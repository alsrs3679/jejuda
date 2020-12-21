package com.jejuda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
	
	@GetMapping(value="/")
	public String mvindex() {
		return "/index";
	}
	
	@GetMapping(value="/shoppingcart")
	public String shoppingcart() {
		return "/shoppingcart";
	}
	
	@GetMapping(value="/delivery")
	public String delivery() {
		return "/delivery";
	}
	
	@GetMapping(value="/seaproduct")
	public String seaproduct() {
		return "/shop-grid";
	}
	
	@GetMapping(value="/fruit")
	public String fruit() {
		return "/shop-grid";
	}
	
	@GetMapping(value="/pig")
	public String pig() {
		return "/shop-grid";
	}
	
	@GetMapping(value="/order")
	public String order() {
		return "/checkout";
	}
	
	@GetMapping(value="/board")
	public String board() {
		return "/board";
	}
	
	@GetMapping(value="/qna")
	public String qna() {
		return "/board";
	}
	
	@GetMapping(value="/contact")
	public String contact() {
		return "/contact";
	}
	
	@GetMapping(value="/seaproduct/fish/1")
	public String fish_detail() {
		return "/shop-details";
	}
	
	//test//

	
	
	

}
