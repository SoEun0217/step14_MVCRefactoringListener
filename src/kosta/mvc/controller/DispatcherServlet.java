package kosta.mvc.controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 사용자 요청을 중앙집중적으로 관리해 줄 FrontController : 사용자 요청을 받아서 그에 해당하는 Controller를 찾아서
 * 호출하고 그결과(ModelAndView)를 받아서 해당하는 뷰페이지로 이동시킨다.
 * 
 */
@WebServlet(urlPatterns = "/front", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {

	private Map<String, Controller> map;
	private Map<String, Class<?>> clzMap;

	@Override
	public void init() throws ServletException {
		System.out.println("init call...");
		map = (Map<String, Controller>) super.getServletContext().getAttribute("map");
		clzMap = (Map<String, Class<?>>) super.getServletContext().getAttribute("clzMap");
	}

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("요청됨..");
		String key = request.getParameter("key");
		String methodName = request.getParameter("methodName");
		System.out.println("key" + key);

		Controller con = map.get(key);
		Class<?> cls = clzMap.get(key);
		try {
			Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			ModelAndView mv = (ModelAndView) method.invoke(con, request, response);

			if (mv.isRedirect()) {
				response.sendRedirect(mv.getViewName());
			} else {
				request.getRequestDispatcher(mv.getViewName()).forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
