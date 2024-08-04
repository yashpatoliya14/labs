import java.util.*;
// Write a program for evaluation of prefix Expression using Stack.

class Revpol{
    public void revpol(){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        StringBuilder str = new StringBuilder();
        str.append(exp);
        str.reverse();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(Character.getNumericValue(ch));
            }else{
                int o1=stack.pop();
                int o2=stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(o1+o2);
                        break;
                    case '-':
                        stack.push(o1-o2);
                        break;
                        case '/':
                        stack.push(o1/o2);
                        break;
                    case '*':
                        stack.push(o1*o2);
                        break;
                    case '^':
                        stack.push(o1^o2);
                }
            }
        }

        System.out.println(stack.pop());
    }
}

public class Lab_8e  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}