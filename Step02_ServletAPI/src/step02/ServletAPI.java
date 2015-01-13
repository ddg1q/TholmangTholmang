package step02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletAPI extends HttpServlet {
	//���� ������ client ��ȷ�⿡�� �� �ѹ��� ����
   
    public ServletAPI() {
      System.out.println("ServletAPI()");
    }
    // ��� client�� �����ϴ� �ڿ��� ���� ��� ������ ���� ��- ���� ��ü ������ ���չ��� ����
    public void init(){
    	System.out.println("init()");
    }
    //get��� ó�� Client:doget�� ���� 1:1 �̴�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet()"+"�̳� �̳�");
	}

	//post ��� Client : dopost�� 1: �ټ� �̴�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
	
	//���� ��ü�� �޸𸮤ļ� �۵� ���� ���� �ٿ� ������ �ڵ� ȣ��
	// �ڿ��ݿ����� ���� ����
	public void destroy(){
		System.out.println("destroy()");
		
	}

}
