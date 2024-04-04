
class InSufficientFundException extends Exception {

    InSufficientFundException(String str){
        super(str);
    }
}
class BankAccount{
    int balance;
    int withdraw;

    BankAccount(int balance , int withdraw){
        this.balance = balance;
        this.withdraw = withdraw;
    }
    
    void exchange(){
        try{
        if(balance<withdraw){
                throw new InSufficientFundException("balance is insufficient");
            }else {
            balance = balance - withdraw;
            
            }
        }
        catch(InSufficientFundException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("your balance : " + balance);
        }
    }
}


public class Lab_8c {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10000, 11000);
        b1.exchange();
    }
}
