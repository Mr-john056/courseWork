import java.util.Arrays;
public class Employee {
    private static int count;
    private final String fio;
    private String department;
    private int salary;
    private int id;

    public Employee(String fio, int department,int salary){
        count++;
        this.setId(count);
        this.fio = fio;
        this.department = getDepartment();
        this.salary = salary;

    }

    public String getFio() {
        return fio;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО работника ='" + fio + '\'' +
                ", Отдел ='" + department + '\'' +
                ", Зарплата =" + salary +
                ", id=" + id +
                '}';
    }
    public static int sumSalary (Employee[] employees){
        int sumSalary1 = 0;
        for (Employee employee : employees){
            if (employee != null) {
                sumSalary1 = sumSalary1 + employee.getSalary();
            }
        }
        return sumSalary1;
    }
    public static Employee minSalary(Employee[] employees){
        int index = 0;
        int minSalary1 = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && minSalary1 > employees[i].getSalary()){
                minSalary1 = employees[i].getSalary();
                index = i;
            }
        }
    return employees[index];
    }
    public static Employee maxSalary(Employee[] employees) {
        int index = 0;
        int maxSalary1 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary1 < employees[i].getSalary()) {
                    maxSalary1 = employees[i].getSalary();
                    index = i;
                }
            }
        }
        return employees[index];
    }
        public static float middleSalary(Employee[] employees){
            int k = 0;
            for (int i = 0; i < employees.length; i++){
                if (employees[i] != null){
                    k++;
                }
            }
            if (k==0) return 0;
            float sumSalary2=sumSalary(employees);
            float middleSalary = sumSalary2/k;
            System.out.println("Средняя зарплата сотрудников = " + middleSalary);
            return middleSalary;
        }
        public static void showEmployee(Employee[]employees){
            for (int i = 0; i < employees.length; i++){
                if (employees[i]!= null){
                    System.out.println("ФИО сотрудника: " + employees[i].getFio());
                }
            }
        }
}

