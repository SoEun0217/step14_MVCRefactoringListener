package kosta.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequset(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("InsertController �Դϴ�...");
		//����ȣ�� -> dao ȣ��
		
		//����� ���������� redirect ������� select��û �Ѵ�.
		//Ű ���� �ʼ� 
		ModelAndView mv = new ModelAndView("front?key=select",true);
		
		return mv;
	}

}
