import java.util.Scanner;
public class GradeTracker {
    public static double calculateAverage(double [] studentScores){
        double sum = 0;
        for (double score : studentScores) {
            sum += score;
        }
        return sum / studentScores.length;
    }
    public static int findTopStudent(double[][] allGrades){
        double highestAverage = calculateAverage(allGrades[0]);
        int topStudentIndex = 0;
        for(int i = 1; i < allGrades.length ; i++){
            double avg = calculateAverage(allGrades[i]);
            if(avg>highestAverage){
                highestAverage = avg;
                topStudentIndex = i;
            }
        }
        return topStudentIndex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][]  allGrades = new double[3][3];
        double value;
        double[] studentScores = new double[3];
        for ( int i=0; i < allGrades.length; i++){
            System.out.println("Enter grades for Student "+ (i+1) +":");
            for(int j = 0 ; j< allGrades[i].length ; j++){
                while(true){
                    System.out.print("   Test "+ (j+1) + ":");
                    if(!sc.hasNextDouble()){
                        System.out.println("Please enter a valid number.");
                        sc.next();
                        continue;
                    }
                
                    value = sc.nextDouble();

                    if(value < 0 || value > 100){
                        System.out.println("Enter marks between 0 and 100.");
                    } else{
                        allGrades[i][j] = value;
                        break;
                    }
                }
                
            }
            studentScores[i] = calculateAverage(allGrades[i]);
            
        }

        for(int i=0; i<allGrades.length; i++){
            System.out.printf("Average for Student %d : %.2f\n", (i+1), studentScores[i]);
        }
        int first = findTopStudent(allGrades);
        System.out.printf("The Student with Highest average is Student %d with the average of : %.2f",(first + 1), calculateAverage(allGrades[first]));

        sc.close();
    }  
}

