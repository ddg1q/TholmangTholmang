package model;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.People;

public class Data {
	private static String id="tester";
	private static String pw="11";
	
	static ArrayList al = new ArrayList();
	
	public static ArrayList allData(String id, String pw){
		
		People p =new People(id, pw);
		al.add(p);
		return al;
	}
	public static String getId(){
		
		return id;
		
		
	}
	public static String getPw(){
		
		return pw;
			
	}
	
	public static HashMap<String,String> getMapDatas(){
		HashMap<String,String> datas = new HashMap<String,String>();
		datas.put("m1", "영석");
		datas.put("m2", "진선");
		return datas;
		
	}
}
