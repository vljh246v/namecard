package com.jaehyun.namecard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orders")
public class OrderController {

	@GetMapping("")
	@ResponseBody
	public String getAllOrders() {
		return "get order list";
	}

	@PostMapping("")
	@ResponseBody
	public String createOrder() {
		return "post order";
	}
	
	
	@GetMapping("/{orderId}}")
	@ResponseBody
	public String getOrderListByOrderId(@PathVariable String orderId) {
		return "/orders/" + orderId;
	}
	
	@GetMapping("/{orderId}/seq/{orderSeq}")
	@ResponseBody
	public String getOrderBySeq(@PathVariable String orderId, @PathVariable String orderSeq) {
		return "/orders/" + orderId + "/seq/" + orderSeq;
	}
}
