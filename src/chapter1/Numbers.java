package chapter1;

import java.util.Stack;

public class Numbers {
  public int inte;
  public int numerator;   //分子
  public int denominator; //分母
  
Stack<Object> stack =new Stack<Object>();
@SuppressWarnings("rawtypes")
Stack stack1 =new Stack();
@SuppressWarnings("rawtypes")
Stack stack2 =new Stack();
    
 
 public char Precede(char c1,char c2){
	 char array[][] = {
			  { '>', '>', '<', '<', '<', '>', '>' },
				{ '>', '>', '<', '<', '<', '>', '>' },
				{ '>', '>', '>', '>', '<', '>', '>' },
				{ '>', '>', '>', '>', '<', '>', '>' },
				{ '<', '<', '<', '<', '<', '=', '!' },
				{ '>', '>', '>', '>', '!', '>', '>' },
				{ '<', '<', '<', '<', '<', '!', '=' }
				};
		char []choice=new char[2];
		for (int i = 0; i < 2;i++)
			switch (choice[i]){
			case '+': choice[i] = 0; break;
			case '-': choice[i] = 0; break;
			case '*': choice[i] = 0; break;
			case '/': choice[i] = 0; break;
			case '(': choice[i] = 0; break;
			case ')': choice[i] = 0; break;
			case '#': choice[i] = 0; break;
			default:
				break;
		}
		return  array[choice[0]][choice[1]];
	}

	/*运算操作*/
public	int operate(int a, char theta, int b)
	{
		switch (theta)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return 0;
		}
	}
	/*运算表达式*/
//public	int Expression(){    
//		char c;
//		int popnum,a,b;
//		while (stack.peek()!= "#"){
//			/*不是运算符则进数据栈*/
//			if ((c != '+' || c != '-' || c != '*' || c != '/' || c != '(' || c != ')' || c != '#')){
//				Push(c, list2, p2);
//				c = getchar();
//			}
//			else
//				/*判断运算符优先级*/
//				switch (Precede(Gettop(list1), c)){
//				case'<': //栈顶元素优先权低
//					Push('#', list1, p1);
//
//					c = getchar();
//					break;
//				case'='://脱括号并接收下一字符
//					Pop(list1,popnum);
//					c = getchar();
//					break;
//				case'>'://退栈并将运算结果入栈
//					Pop(list1,popnum);  //将将要执行的运算符退栈
//					Pop(list2, b); //退出数据
//					Pop(list2, a); //退出数据
//					Push(operate(a, popnum, b), list2, p2);  //将运算结果入栈
//					break;
//				} //switch
//		}  //while
//		return Gettop(list2);
//	}    
}
