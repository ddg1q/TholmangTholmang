/*1. ServletContextListener 인터페이스 구현
 * 2.메소드 재정의 필수
 * 3.주용도
 * 		- 서버가 정상 실행기 client긔 요청유무에 무관하게 무조건 초기와 하고자하는 공유자원이 있을 경우 사용되는api
 * 		-ServletContext
 * 			1.server에 등록된 wev project당 무조건 하나씩 생성해줌
 * 			2.ServletContext 객체에 공유 데이터 저장
 * 			3.servlet에서 Servlet 에서 획득해서 저장됭 데이터 반환해서 사용
 * 			4.모든 servlet은 하나의 Servlet으로 부터 공유가능
 * 4.주요 API
 * 		= 생성자  >  contextInitialized() :>>>> 서버스  >>>>> 서버다운 직전>>>>>>>contextDestroyed()
 * 5.web.xml
 * 		-- sun에서 제시한 tag
 * 		-- 용도 : servletContextListener를 구현한 클래스에 한래서 서버시작시 자동 실행되게 설정
 */
package util;
/*
 *  <listener>
    	<listener-class>util.DataPublic</listener-class>
  	</listener>
 * 
 * 
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class DataPublic implements ServletContextListener {

   
    public DataPublic() {
       System.out.println("DataPublic()----------");
    }

	
    public void contextInitialized(ServletContextEvent arg0) {
     System.out.println("contextInitialized()----------------");
     // 모든 servlet이 사용 할 수 있는 공유 자원 저장
     ServletContext sc = arg0.getServletContext();
     // 데이터 저장
     sc.setAttribute("data1", "지현 2인");
     sc.setAttribute("data1", "너도 28이다");
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("contextDestroyed()-------------------");
    }
	
}
