package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 게시판에 관련된 Controller
 * */
public class BoardController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}
	/**
	 * 전체보기
	 * */
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardController의 list호출힙니다.");
		return new ModelAndView("index.jsp",true);
	}
	
	/**
	 * 상세보기
	 * */
	public ModelAndView read (HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BoardController의 read호출힙니다.");
		return new ModelAndView("index.jsp",true);
	}
}
