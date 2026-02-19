class Employee{
    private String name;
    private int id;
    private static int employeeCount = 0;

    public Employee(String name ){
        System.out.println("Hiring "+name+"....");
        this.name = name;
        this.id = ++employeeCount;
    }
    public void getDetails(){
        
        System.out.println("ID = "+this.id+" | Name: "+this.name);
    }
    public static void showCompanyStatus(){
        System.out.println("Total number of employees: "+ employeeCount);
    }
}

public class HireEmployee {
    public static void main(String[] args) {

        
        Employee e1 = new Employee("Aadi");
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Priya");

        System.out.println("Employee Details:");
       
        e1.getDetails();
        e2.getDetails();
        e3.getDetails();

        
        Employee.showCompanyStatus();
    }
}
