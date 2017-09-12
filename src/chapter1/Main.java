package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Arithmetic text = new Arithmetic();
		int grade=0;
		 BufferedReader reader=null;
	        InputStreamReader inputStreamReader=null;
	        try{
	            System.out.println("输入  # 结束运算:");
	           
	           String str;
	            do{
	            	text.GeneratingOperation((new Random().nextInt(3))+2);
//	        	    grade=text.Judge(result);
	        	    inputStreamReader=new InputStreamReader(System.in);
		            reader=new BufferedReader(inputStreamReader);
		            str=reader.readLine();
	            }while(!str.equals("#"));
	            System.out.println("获得"+grade+"分,测试结束");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        if(reader!=null){
	            try {
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }	
	}
}

