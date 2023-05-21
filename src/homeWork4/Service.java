package homeWork4;

public class Service implements FindInterface {
    @Override
    public boolean find(Employee employee, String name) {
        Employee[] employees = employee.getEmployees();
        for (Employee employee1 : employees) {
            String employeeName = employee1.getName();
            if (employeeName.equals(name)) {
                System.out.println("Имя сотрудника: "+name);
                return true;
            }else {
                System.out.println("Имя сотрудника не найдено");

            }
        }

        return false;
    }
}

