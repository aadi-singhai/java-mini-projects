class BankAccount{
    private String accNumber;
    private double balance;
    private String accHolderName;
    
    public BankAccount(String accNum, double bal, String name){
        this.accNumber = accNum;
        this.balance = bal;
        this.accHolderName = name;

        System.out.println("Account opening for "+ accHolderName +", Acc No. is "+ accNumber + " and balance is: "+ balance+"...");
    }   

    public void deposit(double amount){
        System.out.println(accHolderName+" deposits "+amount);
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("ERROR: low balance for "+accHolderName);
        }else{
            System.out.println(accHolderName+" withdraws "+amount);
            balance -= amount;
        }
    }

    void getDetails(){
        System.out.println("Account Number: "+ accNumber +" and balance is: "+balance);
    }

}
public class BankSystem {
    public static void main(String [] args){
        BankAccount obj1, obj2;

        obj1 = new BankAccount("1234", 2000, "Alice");
        obj2 = new BankAccount("2345", 500, "Maya");
        System.out.println();
        obj1.deposit(400);
        obj2.withdraw(700);
        System.out.println();
        obj1.getDetails();
        obj2.getDetails();
    }
}
