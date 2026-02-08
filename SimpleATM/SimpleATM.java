import java.util.Scanner;

class SimpleATM
{   
    public static double withdraw(double current_balance, double amount){
        if(current_balance < amount){
            System.out.println("Insuffient funds!");
            return current_balance;
        }
        return current_balance - amount;
        

    }

    public static void checkBalance(double current_balance){
        System.out.printf("Your current balance is: %.2f\n", current_balance);
    }

    public static void main(String[] args) {
        double current_balance= 1000;
        int opt;

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Welcome to Simple ATM!!");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose Options: ");

            opt = sc.nextInt();

            if(opt == 1){
                checkBalance(current_balance);
            }
            else if(opt == 2){
                System.out.print("Enter amount to withdraw: ");
                if(!sc.hasNextDouble()){
                    System.out.println("ERROR: Enter valid input!");
                    sc.next();
                    continue;
                }
                double amount = sc.nextDouble();

                if(amount<=0){
                    System.out.println("ERROR: Amount Entered should be above 0!");
                    continue;
                }
                
               current_balance = withdraw(current_balance, amount);
               
            }
            else if(opt == 3){
                System.out.println("Existing the ATM");
            }
        } while(opt!=3);
        sc.close();
    }
}