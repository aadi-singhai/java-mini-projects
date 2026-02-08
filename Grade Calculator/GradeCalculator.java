import java.util.Scanner;

class GradeCalculator
{       
    public static char calculateGrade(double score) {

        char letterGrade;
    
        if (score >= 90.0) {
            letterGrade = 'A';
        } else if (score >= 80.0) {
            letterGrade = 'B';
        } else if (score >= 70.0) {
            letterGrade = 'C';
        } else if (score >= 60.0) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
    
        return letterGrade;
    }
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            double score;
            String name;

        

        while(true){
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            if(name == null || name.trim().isEmpty()){
                System.out.println("Name cannot be empty or just spaces");
            } else{
                break;
            }
        }

        while(true){
            System.out.print("Enter Score: ");
            

            if (!sc.hasNextDouble()) {
                System.out.println("Error: Score must be a number.");
                sc.close();
                return;
            }
            
            score = sc.nextDouble();

            
            if(score < 0 || score > 100){
                System.out.println("Please enter a value between 0 and 100.");
            } else {
                break;
            }
        }
        char grade = calculateGrade(score);
       

        System.out.println("Name = " + name.toUpperCase());
        System.out.println("Score = "+ score);
        System.out.println("Grade = "+ grade); 

        sc.close();
            
    }
}