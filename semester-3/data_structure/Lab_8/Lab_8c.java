import java.util.*;

class Revpol{
	public int ipf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 2;
		}else if(symbols=='*' || symbols=='/' ){
			return 4;
		}else if(symbols=='^' ){
			return 5;
		}else if(symbols=='('){
			return 9;
		}else if(symbols==')'){
			return 0;
		}
		else
		{
		    return 7;
		}
		
	}
	public int spf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 1;
		}else if(symbols=='*' || symbols=='/' ){
			return 3;
		}else if(symbols=='^'){
			return 6;
		}else if(symbols=='('){
			return 0;
		}
		else
		{
		    return 8;
		}
		

	}
	public int rank(char symbols){
		if(symbols=='+' || symbols=='-' || symbols=='*' || symbols=='/' || symbols=='^'){
			return -1;
		}else {
			return 1;
		}
	

	}


	public void revpol(){
		//input the expression
		Scanner sc = new Scanner(System.in);
		String oldexp = sc.nextLine();
        String exp="";
		for (int i = oldexp.length()-1; i >=0 ; i--) {
            if(oldexp.charAt(i)=='('){
                exp+=")";
            }else if(oldexp.charAt(i)==')'){
                exp+="(";
            }
            else{
                exp+=oldexp.charAt(i);
            }
        }
        exp+=')';
        
        int i;
		//create a Stack
		Stack<Character> s= new Stack<>();
		
		//inialize a top
		s.push('(');
		
		//create polish String
		String polish="";
		
		int r=0;

		char nextChar;
		for(i=0; i<exp.length(); i++){
			// if(stack.isEmpty()){
			// 	System.out.println("Invalid! ");
			// 	return;
			// }
            nextChar=exp.charAt(i);
			while(spf(s.peek())>ipf(nextChar))
			{
				char temp = s.pop();
				polish += temp;
				r += rank(temp);
				if(r<1){
					System.out.println("Invalid ! ");
					return;
				}
			}

			if(spf(s.peek()) != ipf(nextChar))
			{
				s.push(nextChar);
			}else{
				s.pop();
			}
			// nextChar=exp.charAt(i);
			// i++;
		} 
        String ans="";
        for (int j = polish.length()-1; j >=0 ; j--) {
            if(polish.charAt(j)=='('){
                ans+=")";
            }else if(polish.charAt(j)==')'){
                ans+="(";
            }
            else{
                ans+=polish.charAt(j);
            }
        }
		
        if(!s.isEmpty() || r!=1){
			System.out.println("Invalid");
		}else{
			System.out.println(ans);
		}


	} 
}

public class Lab_8c  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}