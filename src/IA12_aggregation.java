class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class Staff {
    String empName;
    Department dept;   // HAS-A relationship (aggregation)

    Staff(String empName, Department dept) {
        this.empName = empName;
        this.dept = dept;
    }

    void display() {
        System.out.println(empName + " works in " + dept.deptName);
    }
}

public class IA12_aggregation {
    public static void main(String[] args) {

        Department d1 = new Department("IT");   // created separately
        Staff e1 = new Staff("Gautam", d1); // passed object

        e1.display();
    }
}