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
		 * success ���������� �����̵�
		 * 		1,get ����̳� post����̳�
		 * 			-
		 * 		2.servlet���� �ҽ� �� �����̵��� � ������� �̵�
		 * 			- ���ݱ����� �⺻ �ڹ� ������ �޸� �ܼ� �޼ҵ� ȣ�� �ǹ��ϴ°� �ƴϰ�  
		 * 			== ���� �߿�~~~~~~~~~~!!!
		 * 				�ҽ����� �̵� = page�̵����� ����
		 * 				page�̵� api �н� - servletapi
		 * 3. �̵��� servlet���� ���ο� ������ ����
		 * 
		 */
		if(id.equals("tester")&&pw.equals("11")){
			// ���������� ��� ȭ������ �̵�
			
			//��û��ü�� ������ ������ �����ذ� succ�� ����
			request.setAttribute("msg",	"�� client�� �Է��� �����Ͱ� �ƴ� �������� ���� ������ �����;�");
			
			//servlet API�� Ȱ���� �ҽ� ���� �̵�
			RequestDispatcher pageMoveAPI = request.getRequestDispatcher("succ");// �̵� �ϴ°� ����
			
			pageMoveAPI.forward(request, response);// ���� �̵� ����
			
		}else{
			// ���� �޼��� ����\
			// �̵��� servlet ���� & ���� �̵� ���� �ΰ� ���� ���ÿ� ����ȴ�
			// http://ip:port/step02 _ faw�̷��� get������� �Ǵ°ž� ��ü ���� �����ؼ� �׳� ���尡�°���
			response.sendRedirect("fa");
			
		}
	}
}
