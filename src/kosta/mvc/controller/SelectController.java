package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("SelectController �Դϴ�...");
		//����ȣ��->daoȣ���ϰ� ->�� ��� �޾Ƽ� �ʿ��� ���� ����
		request.setAttribute("message", "�˻� ��� �����߾��!!!");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult.jsp");//${message}
		return mv;
	}

}
