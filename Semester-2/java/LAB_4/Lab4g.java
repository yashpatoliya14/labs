

public class Lab4g {
    public static void main(String []args){
        String str = new String("stream");
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println("");
        }
    }
}
