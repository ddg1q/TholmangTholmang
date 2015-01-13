package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Data;

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
		
		
		
		if(id.equals(Data.getId())&&pw.equals(Data.getPw())){
			
			String no = request.getParameter("no");
			
			if(no.equals("1")){
				request.setAttribute("msg",	"난 client가 입력한 데이터가 아닌 서버에서 새로 저장한 데이터야");
			
				request.setAttribute("msg1", Data.allData(id, pw).toString());
			
			
			}else if(no.equals("2")){
				request.setAttribute("msg", Data.getMapDatas().toString());
				request.setAttribute("msg1", Data.getMapDatas());
			}else{
				request.setAttribute("msg", "데이터가 없습니다.");
			}
			
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
