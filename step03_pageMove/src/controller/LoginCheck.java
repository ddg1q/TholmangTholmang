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
				request.setAttribute("msg",	"�� client�� �Է��� �����Ͱ� �ƴ� �������� ���� ������ �����;�");
			
				request.setAttribute("msg1", Data.allData(id, pw).toString());
			
			
			}else if(no.equals("2")){
				request.setAttribute("msg", Data.getMapDatas().toString());
				request.setAttribute("msg1", Data.getMapDatas());
			}else{
				request.setAttribute("msg", "�����Ͱ� �����ϴ�.");
			}
			
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
