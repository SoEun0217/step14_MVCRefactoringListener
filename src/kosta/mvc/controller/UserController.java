package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ȸ������ ���õ� Controller
 * */
public class UserController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("DeleteController �Դϴ�...");
		ModelAndView mv = new ModelAndView("index.jsp",true);
		return mv;
	}

	/**
	 * �α����ϱ�
	 * */
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserController�� login �Դϴ�...");
		return new ModelAndView("index.jsp",true);
	}
	
	
	/**
	 * ȸ������
	 * */
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserController�� register �Դϴ�...");
		return  new ModelAndView("index.jsp",true);
	}
}
