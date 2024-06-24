public class Lab_1l {

    public static boolean isArmstrong(int n , int d){
        int ans = 0;
        int temp = n;
        while(temp > 0){
            ans += Math.pow(temp % 10, d);
            temp /= 10;
        }

        if(ans == n) return true;
        return false;
    }
    public static void main(String[] args) {
        for(int i = 1 ; i <= 1000 ; i++){
            if(i < 10 && isArmstrong(i, 1)){
                System.out.print(i + " ");
            }
            else if(i < 100 && isArmstrong(i, 2)){
                System.out.print(i + " ");
            }
            else if(i < 1000 && isArmstrong(i, 3)){
                System.out.print(i + " ");
            }
            else{
                if(isArmstrong(i, 4)){
                    System.out.println(i + " ");
                }
            }
        }
    }
}