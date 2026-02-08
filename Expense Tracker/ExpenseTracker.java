import java.util.Scanner;
public class ExpenseTracker {

    public static double calculateTotal(double[] expense){
        double total=0.0;
        for(double i : expense){
            total+=i; 
        }

        return total;
    }

    public static double calculateAverage(double total){
        return (total/7) ;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] expense = new double[7];

        for (int i = 0; i < 7; i++) {
            while (true) {
                System.out.print("Enter expense of Day " + (i + 1) + ": ");

                if (!sc.hasNextDouble()) {
                    System.out.println("Error: Please enter a amount.");
                    sc.next(); 
                    continue;
                }

                double value = sc.nextDouble();

                if (value < 0 ) {
                    System.out.println("Invalid number. Enter a positive number.");
                    
                } else {
                    expense[i] = value;
                    break;
                }

                
            }

        }
        double total = calculateTotal(expense);
        System.out.println("Total Expense: " + total);
        double Avg = calculateAverage(total);
        System.out.println("Average Expense: " + Avg);

    }
}
