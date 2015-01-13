package step02;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAPI2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1-"+request.getContextPath());
		System.out.println("2-"+request.getServerName());
		System.out.println("3-"+request.getServletPath());//DD �ΰ��� ���εȰͿ� ���� ���̾�
		System.out.println("4-"+request.getMethod());
		System.out.println("5-"+getServletName());
		
		//ServletContext �֤� �����ڿ� Ȱ���ϱ�
		ServletContext context = getServletContext();
		System.out.println("6-"+context.getAttribute("data1"));
	}
}
/*
  
1-/Step02_ServletAPI......... ������Ʈ�� path�� �˾ƺ��°��̾� �̰� �� �߿��� 
2-localhost �̰� �������ּ�
3-/api2  url ����
4-GET  ����� �˾ƺ��� �ִ�
5-test   ó�� �±� ���ٶ��� ���� �˾� ���°��̴�.

*/