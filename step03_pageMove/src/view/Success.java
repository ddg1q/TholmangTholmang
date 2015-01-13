package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.People;


public class Success extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Success doGet()");
		
		process(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Success doPost()");
		
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");// web 쿼리 테이러 탁출 메소드
		String msg = (String)request.getAttribute("msg");// 저장한 데이터에 한새서만 반환 1:1 로 반환
		String msg1 = (String)request.getAttribute("msg");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		String no = request.getParameter("no");
		
		
		
		
		if(no.equals("1")){
			out.print((String)request.getAttribute("msg"));
		}else if(no.equals("2")){
			out.print(request.getAttribute("msg1").toString());
		}else{
			out.print("실패입니다.");
		}
		
		
		
		out.print("<b>"+id+"<b>");
		out.print("안녕하세요<br>");
		out.print(msg);
		out.print(msg1);
		out.print("<br><a href='login.html'>return</a>");
		 
		Object all = (Object)request.getAttribute("msg");
		
		out.print((String)request.getAttribute("msg"));
		
		out.close();
	}


}
