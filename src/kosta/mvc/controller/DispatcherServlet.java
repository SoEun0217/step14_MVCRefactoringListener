package kosta.mvc.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 사용자 요청을 중앙집중적으로 관리해 줄
 * FrontController
 *  : 사용자 요청을 받아서 그에 해당하는 Controller를
 *   찾아서 호출하고 그결과(ModelAndView)를 받아서 
 *   해당하는 뷰페이지로 이동시킨다.
 * 
 * */
@WebServlet(urlPatterns = "/front" , loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	
	private Map<String,Controller> map ;
	
	@Override
	public void init() throws ServletException {
		System.out.println("init call...");
		map = (Map<String,Controller>)super.getServletContext().getAttribute("map");
	}
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청됨..");
		String key = request.getParameter("key");
		System.out.println("key"+key);

		ModelAndView mv = map.get(key).handleRequset(request, response);
		
		if(mv.isRedirect()) {
			response.sendRedirect(mv.getViewName());
		}else {
			request.getRequestDispatcher(mv.getViewName()).forward(request, response);
		}
	}
	
}
