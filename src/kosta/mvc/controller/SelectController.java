package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SelectController 입니다...");
		//서비스호출->dao호출하고 ->그 결과 받아서 필요한 정보 저장
		request.setAttribute("message", "검색 결과 성공했어요!!!");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult.jsp");//${message}
		return mv;
	}

}
