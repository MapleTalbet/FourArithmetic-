package chapter1;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
/**
 * 描述：一个自动生成四则运算的程序，包含真分数
 * 部分功未实现
 * @author meng.pc
 *@version:第二版 
 */
public class Arithmetic {
	private	int grade=0;  //计分
	char[] oper = new char[100];
	 Stack<Character> stack = new Stack<Character>(); // 创建堆栈对象 
	
  //得到操作符
public int getChar(int number){//生成运算符号
	  int randnumber;
	  int j=0 ,i=0;
	  for(;i<number;i++){
		  randnumber = new Random().nextInt(4);
		  switch(randnumber){
		  case 0: oper[j]='+';System.out.print(oper[j]);break;
		  case 1: oper[j]='-';System.out.print(oper[j]);break;
		  case 2:  if(j>0) {
			  if((oper[j-1]=='-')||(oper[j-1]=='-'))
			  if(new Random().nextInt(3)==0){
				  oper[j]=oper[j-1];
				  oper[j-1]='(';
				  oper[j+1]=')';
				  j+=2;
			  }
			  }
		  oper[j]='*'; System.out.print(oper[j]);break;
		  case 3: if(j>0) {
			  if((oper[j-1]=='-')||(oper[j-1]=='+'))
			  if(new Random().nextInt(3)==0){
				  oper[j]=oper[j-1];
				  oper[j-1]='(';
				  oper[j+1]=')';
				  j+=2;
			  }
			}
		  
		  oper[j]='/';System.out.print(oper[j]); break;
		  default: break;
		  }
		  j++;
	  }
	  oper[j]='=';
	  System.out.println();
	  return j-i;
	  }

public void printNumber(){
	int randNumber;
	Numbers num = new Numbers();
	randNumber =new Random().nextInt(3);
	if(randNumber == 0){
		num.inte=0;
		num.numerator=(int)(10*Math.random()+2);
		num.denominator=(num.denominator%num.numerator)+1;
		System.out.print(num.numerator+"/"+num.denominator);
		stack.push((char) (num.numerator/num.denominator)); //
		System.out.print(" ");
	}else{
		num.inte=(int)(99*Math.random()+1);
		num.numerator=0;
		num.denominator=1;
		stack.push((char) num.inte);
		System.out.print(num.inte);
	}
}
public void GeneratingOperation(int number){//生成算式
    int operCount=0;
    int rev=getChar(number);
   while(operCount<=(number+rev)){
    	if(oper[operCount]=='('){
    		System.out.print(oper[operCount]);
    		stack.push(oper[operCount]);
    		operCount++;
    	}
    		printNumber();
    		System.out.print(oper[operCount]);
    		stack.push(oper[operCount]);
    		operCount++;
    		 if(oper[operCount]==')'){//若有右括号则显示括号
    	           System.out.print(oper[operCount]);
    	           stack.push(oper[operCount]);
    	           operCount++;
    	        }
    	}
    }
	

@SuppressWarnings("resource")
public int Judge(double result){
	  Scanner scan = new Scanner(System.in);
	  float read = scan.nextFloat();
	 // scan.close();
	 if(read == result){
		 System.out.print("正确");
		 grade++;
	 }
	 else{
		 System.out.print("错误");
	 }
	 System.out.print(result);
	 return grade;
 }
}
	
