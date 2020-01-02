package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// 注释下，再注释下
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
}
