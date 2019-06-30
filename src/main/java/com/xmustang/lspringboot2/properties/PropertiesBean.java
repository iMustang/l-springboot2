package com.xmustang.lspringboot2.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @title: PropertiesBean
 * @description: 当自定义属性过多时，可以将属性绑定到一个Bean上
 */
// 同时需要在入口类中指定@EnableConfigurationProperties
@ConfigurationProperties(prefix = "com.xmustang")
public class PropertiesBean {
	private String a;
	private String b;
	private String c;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
}
