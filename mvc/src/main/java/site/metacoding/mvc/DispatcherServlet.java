package site.metacoding.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import site.metacoding.mvc.web.MyUserController;

// http://localhost:8000/
// http://localhost:8000/hello도 들어오게 된다. /만 있으면 다 여기로 연결되는 것
// http://localhost:8000/myuser 분기하기
// http://localhost:8000/mypost 분기하기
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String domain1 = request.getRequestURI();

		if (domain1.equals("/myuser")) {
			MyUserController controller = new MyUserController(request, response);
			System.out.println(domain1);

			String idStr = request.getParameter("id"); // 없으면 null

			if (idStr == null) {
				controller.getAll();
			} else {
				int id = Integer.parseInt(idStr);
				controller.getOne(id);
			}
		}

	} // 스레드 종료
		// 1. 클라이언트에게 연결된 response 선 짤림)
		// 2. request 메모리영역 삭제
		// 3. connection 반납

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
