package homeWork4;

import java.util.Arrays;

public abstract class Employee extends Person {
    final int baseRate = 40;
    protected PROFESSION profession;
    protected int currentYear;
    protected int yearEmployment;
    private int experience;
    Employee [] employees;
    public Employee[] getEmployees(){
        return employees;
    }

    public Employee(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname);
        this.currentYear = currentYear;
        this.yearEmployment = yearEmployment;
        setProfession();
    }

    public abstract void setProfession();

    public int getExperience() {
        experience = currentYear - yearEmployment;
        return experience;
    }

    public int getSalary() {
        return baseRate*profession.ratio*getExperience();
    }
    public void addWorker(Employee employee){
        if(employees==null){
            employees=new Employee[1];
            employees[0]=employee;
        }else {
            employees= Arrays.copyOf(employees,employees.length+1);
            employees[employees.length-1]=employee;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", profession=" + profession +
                ", salary=" + getSalary() +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
