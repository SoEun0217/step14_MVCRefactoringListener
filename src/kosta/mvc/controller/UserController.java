package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 회원관리 관련된 Controller
 * */
public class UserController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("DeleteController 입니다...");
		ModelAndView mv = new ModelAndView("index.jsp",true);
		return mv;
	}

	/**
	 * 로그인하기
	 * */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserController의 login 입니다...");
		return new ModelAndView("index.jsp",true);
	}
	
	
	/**
	 * 회원가입
	 * */
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserController의 register 입니다...");
		return  new ModelAndView("index.jsp",true);
	}
}
