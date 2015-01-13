/*1. ServletContextListener �������̽� ����
 * 2.�޼ҵ� ������ �ʼ�
 * 3.�ֿ뵵
 * 		- ������ ���� ����� client�� ��û������ �����ϰ� ������ �ʱ�� �ϰ����ϴ� �����ڿ��� ���� ��� ���Ǵ�api
 * 		-ServletContext
 * 			1.server�� ��ϵ� wev project�� ������ �ϳ��� ��������
 * 			2.ServletContext ��ü�� ���� ������ ����
 * 			3.servlet���� Servlet ���� ȹ���ؼ� ����� ������ ��ȯ�ؼ� ���
 * 			4.��� servlet�� �ϳ��� Servlet���� ���� ��������
 * 4.�ֿ� API
 * 		= ������  >  contextInitialized() :>>>> ������  >>>>> �����ٿ� ����>>>>>>>contextDestroyed()
 * 5.web.xml
 * 		-- sun���� ������ tag
 * 		-- �뵵 : servletContextListener�� ������ Ŭ������ �ѷ��� �������۽� �ڵ� ����ǰ� ����
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
     // ��� servlet�� ��� �� �� �ִ� ���� �ڿ� ����
     ServletContext sc = arg0.getServletContext();
     // ������ ����
     sc.setAttribute("data1", "���� 2��");
     sc.setAttribute("data1", "�ʵ� 28�̴�");
    }

	
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("contextDestroyed()-------------------");
    }
	
}
