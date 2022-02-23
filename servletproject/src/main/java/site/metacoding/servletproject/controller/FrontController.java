package site.metacoding.servletproject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http 최초 프로토콜 버전 (GET)
// http 1.0 프로토콜 버전(GET, POST)
// http 1.1 프로토콜 버전(GET, POST, PUT, DELETE)
// GET -> 브라우저에서 주소로 요청 , POST -> 폼태그,  DELETE,PUT -> 자바스크립트 

//http://localhost:80/front
@WebServlet("/front")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		// 한번 밖에 나오지 않는다. 왜냐 서블릿은 한번만 떠서 계속 사용하기 때문에
		System.out.println("나 메모리에 떴어 : FrontController");

		// 공통된 로직 처리 가능

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("front 컨트롤러로 요청들어옴");

		// 1. 라우터 만들기
		String path = request.getParameter("path");
		System.out.println("path : " + path);

		if (path.equals("login")) {
			// 로그인페이지를 응답
			response.sendRedirect("/login.jsp");
//			PrintWriter out = response.getWriter();
//
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("	</head>");
//			out.println("<body>");
//			out.println("<h1>LoginPage</h1>");
//			out.println("</body>");
//			out.println("	</html>");

		} else if (path.equals("join")) {
			// 조인페이지를 응답
			response.sendRedirect("/join.jsp");
//			PrintWriter out = response.getWriter();
//
//			out.println("<!DOCTYPE html>");
//			out.println("<html>");
//			out.println("<head>");
//			out.println("<meta charset=\"UTF-8\">");
//			out.println("<title>Insert title here</title>");
//			out.println("	</head>");
//			out.println("<body>");
//			out.println("<h1>LoginPage</h1>");
//			out.println("</body>");
//			out.println("	</html>");
		}
	}

}
