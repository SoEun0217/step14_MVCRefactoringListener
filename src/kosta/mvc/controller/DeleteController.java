package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("DeleteController ¿‘¥œ¥Ÿ...");
		ModelAndView mv = new ModelAndView("index.jsp",true);
		return mv;
	}

}
