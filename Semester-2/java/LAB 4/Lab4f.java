
public class Lab4f {

    public static void main(String []args){
        char ch;
        int s;
        for(int i=0; i<args.length; i++){ 
            ch = args[i].charAt(0);
            s = (int)ch;
            if(65<s && s<90){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
