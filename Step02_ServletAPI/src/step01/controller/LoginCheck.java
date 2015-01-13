package step01.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck extends HttpServlet {
	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginCheck doGet()");
		
		process(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginCheck doPost()");
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginCheck process()");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		/*
		 * 
		 * success 서블ㄹ릿으로 실행이동
		 * 		1,get 방식이냐 post방식이냐
		 * 			-
		 * 		2.servlet간의 소스 즉 싱행이동은 어떤 방식으로 이동
		 * 			- 지금까지의 기본 자바 문법과 달리 단순 메소드 호출 의미하는게 아니고  
		 * 			== 완전 중요~~~~~~~~~~!!!
		 * 				소스실행 이동 = page이동으로 간조
		 * 				page이동 api 학습 - servletapi
		 * 3. 이동된 servlet으로 새로운 데이터 전송
		 * 
		 */
		if(id.equals("tester")&&pw.equals("11")){
			// 성공메제지 출력 화면으로 이동
			
			//요청객체에 새오룽 데이터 저장해거 succ로 전송
			request.setAttribute("msg",	"난 client가 입력한 데이터가 아닌 서버에서 새로 저장한 데이터야");
			
			//servlet API를 활용한 소스 실행 이동
			RequestDispatcher pageMoveAPI = request.getRequestDispatcher("succ");// 이동 하는곳 제공
			
			pageMoveAPI.forward(request, response);// 실제 이동 수행
			
		}else{
			// 실패 메세지 공간\
			// 이동된 servlet 지정 & 실제 이동 수행 두개 같이 동시에 수행된다
			// http://ip:port/step02 _ faw이렇게 get방식으로 되는거야 객체 새성 ㄴㄴ해서 그냥 곧장가는거임
			response.sendRedirect("fa");
			
		}
	}
}
