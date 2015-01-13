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
		System.out.println("3-"+request.getServletPath());//DD 인곳의 맵핑된것에 대한 것이얌
		System.out.println("4-"+request.getMethod());
		System.out.println("5-"+getServletName());
		
		//ServletContext 애ㅔ 공유자원 활용하기
		ServletContext context = getServletContext();
		System.out.println("6-"+context.getAttribute("data1"));
	}
}
/*
  
1-/Step02_ServletAPI......... 프로젝트의 path를 알아보는것이양 이게 젤 중요함 
2-localhost 이건 아이피주소
3-/api2  url 패턴
4-GET  방식을 알아볼수 있다
5-test   처음 태그 해줄때의 값을 알아 오는것이다.

*/