import java.util.Scanner;
public class StockAnalyzer {
    public static double findMin(double[] prices){
        double min = prices[0];
        for(int i=1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
        }

        return min;
    }
    public static double findMax(double[] prices){
        double max = prices[0];
        for(int i=1; i < prices.length; i++){
            if(prices[i] > max){
                max = prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hours;
        while(true){
            System.out.print("How many hours of data?");
            if (!sc.hasNextInt()){
                System.out.println("ERROR: invalid number of hours. Please try again.");
                sc.next();
                continue;
            }
            hours = sc.nextInt();
            if(hours<=0){
                System.out.println("ERROR: Enter positive number of hours");
            }else{
                break;
            }   
        }
        double[] prices = new double[hours];
        double value;
        for(int i=0; i<hours; i++){
            while(true){
                System.out.print("Enter prize for "+ (i+1) +" hour: ");
                if(!sc.hasNextDouble()){
                    System.out.println("Enter a valid number.");
                    sc.next();
                    continue;
                }
                value = sc.nextDouble();
                if(value<0){
                    System.out.println("ERROR: Enter positive number.");
                    
                }else{
                    prices[i] = value;
                    break;
                }
            }   
        }

        double max = findMax(prices);
        double min = findMin(prices);
        double range = max - min;

        System.out.println("Highest Price: "+ max);
        System.out.println("Lowest Price: "+ min);
        System.out.println("Range: "+ range);

        sc.close();
    }
}
