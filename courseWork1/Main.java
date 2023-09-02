public class Main {
    public static void main(String[] args) {
        int department1 = 1;
        int department2 = 2;
        int department3 = 3;
        int department4 = 4;
        int department5 = 5;

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", department1, 57000);
        employees[1] = new Employee("Козлов Петр Васильевич", department2, 98000);
        employees[2] = new Employee("Храмов Константин Сергеевич", department3, 134000);
        employees[3] = new Employee("Захаров Максим Олегович", department4, 55000);
        employees[4] = new Employee("Добрин Михаил Александрович", department5, 64000);
        employees[5] = new Employee("Савин Георгий Иванович", department1, 61000);
        employees[6] = new Employee("Полчунов Дмитрий Сергеевич", department2, 58000);
        employees[7] = new Employee("Самарцев Сергей Александрович", department3, 62500);
        employees[8] = new Employee("Баранов Антон Иванович", department4, 76000);
        employees[9] = new Employee("Стуликов Алексей Леонидович", department5, 84000);

        System.out.println("Курсовая работа №1");
        System.out.println(" ");

        for (Employee i : employees) {
            System.out.println(i);
        }

        System.out.println(" ");

        int sumSalary = Employee.sumSalary(employees);
        System.out.println("Сумма всех зарплат сотрудников: " + sumSalary);

        System.out.println(" ");
        Employee.minSalary(employees);

        System.out.println(" ");
        Employee.maxSalary(employees);

        System.out.println(" ");
        Employee.middleSalary(employees);

        System.out.println(" ");
        Employee.showEmployee(employees);
    }
}