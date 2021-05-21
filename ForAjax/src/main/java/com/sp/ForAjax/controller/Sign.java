package com.sp.ForAjax.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

@Controller
public class Sign {

//	@Autowired
//	private SignService signService;

	@RequestMapping("/sign") // 進sign頁
	public ModelAndView entry() {
		System.out.println("entry method");
		ModelAndView mv = new ModelAndView("sign.j");
		return mv;
	}
	
	// 註冊
	@RequestMapping("/signUp") 
	public ModelAndView signUp(
			@RequestParam("sup_username") String username,
			@RequestParam("sup_password") String password,
			@RequestParam("sup_sex") String sex,
			@RequestParam("sup_email") String email) {
		System.out.println("CTL signUP method");
		System.out.println(username);
		ModelAndView mv = new ModelAndView("sign.j");
//		mv.addObject("message", result);
		return mv;
	}
	
	//檢查帳號重覆
	@RequestMapping("/checkName")
	@ResponseBody
	public String checkName(
			@RequestParam("strUsername") String username) {
		System.out.println("收到字串"+username);
		String res = "要回傳的字串";
		System.out.println(res);
		
		return res;
	}
	
	//檢查重覆by Map
	@RequestMapping("/checkNameByMap")
	@ResponseBody
	public Map<String,String> checkNameByMap(
			@RequestParam("strUsername") String username) {
		System.out.println("by map進DB檢查是否重覆");
		System.out.println(username);
		Map<String,String> resultMap = new HashMap<String, String>();
		resultMap.put("str", "要回傳的字串");
		System.out.println(resultMap);
		
		return resultMap;
	}
	
}
