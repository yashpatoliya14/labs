import java.io.*;

public class Lab_10a{
	public static void main(String[] args) {
		int countLine=0;
		int countChar=0;
		int countWord=0;
		try{

		BufferedReader b1 = new BufferedReader(new FileReader("abc.txt"));

		
		int c =0;
		c= b1.read();
		while(c!=-1){
			if(c == '\n'){
				countLine++;
			}
			else if(c == ' '){
				countWord++;
			}else{

				countChar++;

			}
				c= b1.read();	
			

		}
		// while(l!=null){
		// 	countLine++;
		// 	l= b1.readLine();
		// }		
		}catch(Exception e){

		}
		System.out.println(countChar+1);
		System.out.println(countLine+1);
		System.out.println(countWord+1);
	}
}