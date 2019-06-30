package com.xmustang.lspringboot2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: HelloController
 * @description:
 */
@RestController
//@RestController = @ResponseBody ＋ @Controller
public class HelloController {
	@Value("${greetingWords}")
	private String name;

	@RequestMapping("/greet")
	public String greet() {
		return "hello SpringBoot2";
	}

	@RequestMapping("/greet2")
	public String greet2() {
		return name;
	}

}
