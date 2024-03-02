
public class Lab4h {
    public static void main(String []args){
        int num = Integer.parseInt(args[0]) ;
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=num-1; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}    

