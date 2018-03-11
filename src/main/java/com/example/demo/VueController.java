package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class VueController {

	@Value("${cloud.sample.msg:World}")
	String msg;

	@RequestMapping("/index")
	public String index() {
		System.out.println(msg);
		return msg;
	}
}
