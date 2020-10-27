package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UpdateController 입니다....");
		request.setAttribute("message", "수정 완료되었습니다.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateResult.jsp");
		return mv;
	}

}
