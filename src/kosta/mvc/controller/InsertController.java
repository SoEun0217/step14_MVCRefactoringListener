package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("InsertController 입니다...");
		//서비스호출 -> dao 호출
		
		//등록이 성공했으니 redirect 방식으로 select요청 한다.
		//키 전달 필수 
		ModelAndView mv = new ModelAndView("front?key=select",true);
		
		return mv;
	}

}
