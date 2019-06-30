package com.xmustang.lspringboot2.controller;

import com.xmustang.lspringboot2.properties.PropertiesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: PropertiesController
 * @description:
 */
@RestController
public class PropertiesController {
	@Autowired
	private PropertiesBean propertiesBean;

	@RequestMapping("/property")
	public String property() {
		return propertiesBean.getA() + propertiesBean.getB() + propertiesBean.getC();
	}
}
