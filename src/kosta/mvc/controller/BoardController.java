package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * �Խ��ǿ� ���õ� Controller
 * */
public class BoardController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	/**
	 * ��ü����
	 * */
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardController�� listȣ�����ϴ�.");
		return new ModelAndView("index.jsp",true);
	}
	
	/**
	 * �󼼺���
	 * */
	public ModelAndView read (HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardController�� readȣ�����ϴ�.");
		return new ModelAndView("index.jsp",true);
	}
}
