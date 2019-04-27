package com.jaehyun.namecard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;

@Controller
@Api(value = "DepartmentContorller",  description = "부서 관련 API",basePath = "/dept")
@RequestMapping("/depts")
public class DepartmentContorller {
	
	@GetMapping("")
	@ResponseBody
	public String getDepts() {
		return "depts";
	}
	

}
