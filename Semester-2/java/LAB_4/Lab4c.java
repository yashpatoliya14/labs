package java;
class Lab4c{
    public static void main(String[] args) {
        
        int arr[]= new int[4];
        float sum=0;
        for(int i=0 ; i< arr.length; i++)
        {
            sum+= Integer.parseInt(args[i]);    
        }
        System.out.println(sum/arr.length);
    }
}