import java.util.HashMap;
class Employee{
    private String empId, name, department, email;

    public Employee(String empId, String name, String department, String email) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "ID: " + empId + " | Name: " + name + " | Dept: " + department + " | Email: " + email;
    }
    
}

class DirectoryManager {
    private HashMap<String, Employee> database;

    public DirectoryManager() {
        this.database = new HashMap<>();
    }
    
    public void addEmployee(Employee emp){
        String employeeId = emp.getEmpId();
        if(database.containsKey(employeeId)){
            System.out.println("[ERROR] Employee ID "+employeeId+" already exists. Cannot overwrite.");
        }
        else{
            database.put(employeeId, emp);
            System.out.println("[SUCCESS] Added "+ emp.getName() + " Successfully to the Database.");
        }
    }

    public Employee getEmployee(String id){
        
        return database.get(id);
    }

    public void removeEmployee(String id){
        
        if (database.containsKey(id)) {
            database.remove(id);
            System.out.println("[SUCCESS] Employee " + id + " removed.");
        } else {
            System.out.println("[ERROR] Employee ID " + id + " not found.");
        }
    }

    public void printAllEmployee(){
        if (database.isEmpty()) {
            System.out.println("No employees in database.");
            return;
        }

        database.forEach((id, emp) -> {
            System.out.println(emp);
        });
    }
}
public class EnterpriseApp {
    public static void main(String[] args) {
        System.out.println("--- Booting Enterprise HR System ---");

        DirectoryManager db = new DirectoryManager();

        Employee e1 = new Employee("EMP-001", "Alice", "HR", "alice@company.com");
        Employee e2 = new Employee("EMP-002", "Bob", "Engineering", "bob@company.com");
        Employee e3 = new Employee("EMP-003", "Charlie", "Finance", "charlie@company.com");
        
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("\n-----Testing duplicate insertion-----");
        db.addEmployee(e1);

        System.out.println("\n-----Testing Deletion-----");
        db.removeEmployee("EMP-003");

        System.out.println("\n-----Getting Employee-----");
        Employee abc = db.getEmployee("EMP-002");
        System.out.println(abc);

        System.out.println("\n-----Final Directory Status-----");
        db.printAllEmployee();
    }
}
