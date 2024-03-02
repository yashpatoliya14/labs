import java.util.Scanner;
class BankAccount{
    long accountNo;
    String userName;
    String email;
    String accountType;
    float accountBalance; 
    BankAccount(){
        this.accountNo = 1010101;
        this.userName = "<NAME>";
        this.email = "<EMAIL>";
        this.accountType = "Savings"; 
        this.accountBalance = 10000;  
        displayAccountDetails(); 
    }
    BankAccount(long accountNo,String userName,String email,String accountType,float accountBalance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;  
        this.accountBalance = accountBalance;
        displayAccountDetails();    
    }
    public void getAccountDetails()
    {
        Scanner sc = new Scanner(System.in);
        this.accountNo = sc.nextInt();
        this.userName = sc.next();
        this.email = sc.next();
        this.accountType = sc.next();  
        this.accountBalance = sc.nextInt();
    }
    public void displayAccountDetails(){
        System.out.println("Account No: "+this.accountNo);
        System.out.println("User Name: "+this.userName);
        System.out.println("Email: "+this.email);
        System.out.println("Account Type: "+this.accountType);
        System.out.println("Account Balance: "+this.accountBalance);
    }
}
class Lab5d{

    public static void main(String[] args) 
    {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1010101010,"Yash Patel","yashpatoliya@gmail.com","current",10000);
        account1.getAccountDetails();
        account1.displayAccountDetails();

    }
}