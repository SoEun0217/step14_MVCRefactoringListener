package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UpdateController �Դϴ�....");
		request.setAttribute("message", "���� �Ϸ�Ǿ����ϴ�.");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateResult.jsp");
		return mv;
	}

}
