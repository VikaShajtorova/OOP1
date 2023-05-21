package homeWork4;

import java.util.Arrays;

public class Worker extends Employee{
    public Worker(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.WORKER;
    }

    @Override
    public void addWorker(Employee employee) {
        if(employee.profession.equals(PROFESSION.INTERN)){
            super.addWorker(employee);
        }else {
            System.out.println("Может принимать на работу только интерна");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + getName() +
                ", profession=" + profession +
                ", salary=" + getSalary() +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
