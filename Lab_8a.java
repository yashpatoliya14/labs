import java.util.*;

class Revpol{
	public int ipf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 1;
		}else if(symbols=='*' || symbols=='/' ){
			return 3;
		}else if(symbols=='+' || symbols=='-' ){
			return 6;
		}else if(symbols>='a' || symbols<='z'){
			return 7;
		}else if(symbols=='('){
			return 9;
		}else if(symbols==')'){
			return 0;
		}
		return -2;
	}
	public int spf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 2;
		}else if(symbols=='*' || symbols=='/' ){
			return 4;
		}else if(symbols=='^' || symbols=='-' ){
			return 5;
		}else if(symbols>='a' || symbols<='z'){
			return 8;
		}else if(symbols=='('){
			return 0;
		}
		return -2;

	}
	public int rank(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return -1;
		}else if(symbols=='*' || symbols=='/' ){
			return -1;
		}else if(symbols=='^' || symbols=='-' ){
			return -1;
		}else if((symbols>='a' && symbols<='z') || (symbols>='A' && symbols<='Z')){
			return 1;
		}
		return -2;

	}


	public void revpol(){
		//input the expression
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		exp+=')';
		//create a Stack
		Stack<Character> stack= new Stack<>();
		
		//inialize a top
		stack.push('(');
		
		//create polish String
		String polish="";
		
		int r=0;

		int i=0;
		char nextChar= exp.charAt(i);
		for(i=1; i<exp.length(); i++){
			// if(stack.isEmpty()){
			// 	System.out.println("Invalid! ");
			// 	return;
			// }

			while(ipf(stack.peek())>spf(nextChar))
			{
				char temp = stack.pop();
				polish += temp;
				r += rank(temp);
				if(r<1){
					System.out.println("Invalid ! ");
					return;
				}
			}

			if(ipf(stack.peek()) != spf(nextChar))
			{
				stack.push(nextChar);
			}else{
				stack.pop();
			}
			// nextChar=exp.charAt(i);
			// i++;
		} 

		if(!stack.isEmpty() || r!=1){
			System.out.println("Invalid ccccccccccccc");
		}else{
			System.out.println("Valid");
		}


	} 
}

public class Lab_8a  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}