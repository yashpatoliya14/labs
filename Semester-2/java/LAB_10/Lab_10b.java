import java.io.*;
public class Lab_10b{
	public static void main(String[] args) {
		try{


		BufferedReader b1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter b2 = new BufferedWriter(new FileWriter("xyz.txt"));

		String word1 = "harsh";
		String word2 = "Tank";

		String line = b1.readLine();

		String s[] = line.split(" ");

		for(int i=0; i<s.length; i++ ) {
			if(s[i].equals(word1)){
				b2.write(word2 + " ");
			}else{
				b2.write(s[i] + " ");
			}
		}
		b1.close();
		b2.close();
	}catch(Exception e){

	}
	}
}