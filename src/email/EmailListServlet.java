package email;

import nhom12.business.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/emailList", "/email/*"})

public class EmailListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/index.html";
		// get current action
		String action = request.getParameter("action");
		if (action == null) {
			action = "join"; // d
		}
		if (action.equals("join")) {
			url = "/index.html";
		} else if (action.equals("add")) {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");

			User user = new User(firstName, lastName, email);

			request.setAttribute("user", user);
			url = "/thanks.jsp";
			
			System.out.print(user.getFirstName() + user.getLastName());
		}

		getServletContext().getRequestDispatcher(url).forward(request, response);
		//Khi chuyển trang sang url thì vẫn giữ nguyên đối tượng request và response để nó không chết đi và ta có thể lấy dữ liệu của nó thông qua user thay vì xuống database để lấy dữ liệu.
		
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
