package step02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletAPI extends HttpServlet {
	//최초 접속한 client 실횅기에만 단 한번만 실행
   
    public ServletAPI() {
      System.out.println("ServletAPI()");
    }
    // 모든 client가 공유하는 자원이 있을 경우 재정의 권자 ㅇ- 서블릿 객체 생석후 단합번만 실행
    public void init(){
    	System.out.println("init()");
    }
    //get방식 처리 Client:doget의 수는 1:1 이다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet()"+"겁나 겁남");
	}

	//post 방식 Client : dopost는 1: 다수 이다
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
	
	//서블릿 객체가 메모리ㅔ서 작데 도는 서버 다운 직전에 자동 호출
	// 자원반완으로 개발 권장
	public void destroy(){
		System.out.println("destroy()");
		
	}

}
