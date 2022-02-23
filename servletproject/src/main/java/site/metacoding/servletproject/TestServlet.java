package site.metacoding.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:80/index.jsp (URL)
//http://localhost:80/hello(URI) 식별자 요청
@WebServlet("/test")
public class TestServlet extends HttpServlet {

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	// 사용자에게 받은 http body, http header 정보를 HttpSeerveletRequest req에 담고
	// 그 친구한테 응답될 빈 객체 HttpServletResponse resp 를 만들어
	// 아파치 톰캣이 doGet(req, reqsp); 담아서 호출해준다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get 요청됨");

		PrintWriter out = resp.getWriter();

		String name = "Babo";

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello EveryOne " + name + "</h1>");
		out.println("</body>");
		out.println("</html>");

		// 같은 것
		// PrintWriter pw = new PrintWriter(resp.getOutputStream());

		// 같은 것
//		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(resp.getOutputStream()));
//		writer.write("");
//		writer.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
