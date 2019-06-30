package com.xmustang.lspringboot2;

import com.xmustang.lspringboot2.properties.PropertiesBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@SpringBootApplication包含@EnableAutoConfiguration
//@EnableAutoConfiguration告诉SpringBoot基于已经添加的jar依赖项，“猜”我们将如何想配置Spring。
//自动配置被设计用来和“Starters”一起更好的工作,但这两个概念并不直接相关。可以自由挑选starter依赖项以外的jar包，springboot仍将尽力自动配置应用程序。
@PropertySource("classpath:app.properties")
//@ImportResource用于引入xml文件
@EnableConfigurationProperties(PropertiesBean.class)
public class LSpringboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(LSpringboot2Application.class, args);
	}

}
