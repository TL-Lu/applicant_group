package com.lutenglong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test")
	public String test(Model m) {			//跳转页面
		m.addAttribute("a", "test");
		return "test";
		// a修改了文件
		//A第二次修改文件
	}
}
