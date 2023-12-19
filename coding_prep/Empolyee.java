public class Empolyee {

    public int emp_id;
    public String emp_name;
    public int emp_salary;

    public int getEmployeeId() {
        return emp_id;
    }

    public void setEmployeeId(int employeeId) {
        this.emp_id = employeeId;
    }

    public String getEmployeeName() {
        return emp_name;
    }

    public void setEmployeeName(String employeeName) {
        this.emp_name = employeeName;
    }

    public double getEmployeeSalary() {
        return emp_salary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.emp_salary = employeeSalary;
    }



    public static void main(String[] args){
        Empolyee empolyee = new Empolyee();

        empolyee.setEmployeeId(0001);
        empolyee.setEmployeeName("John Doe");
        empolyee.setEmployeeSalary(5000);
        int employeeId = empolyee.getEmployeeId();
        String employeeName = empolyee.getEmployeeName();
        int formattedSalary = (int) empolyee.getEmployeeSalary();


        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);


    }

}
