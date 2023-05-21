package homeWork4;

public class Director extends Employee{
    public Director(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.DIRECTOR;
    }

    @Override
    public int getSalary() {
       if(employees==null){
           return super.getSalary();
       }else {
           return super.getSalary()+(employees.length*100);
       }
    }
}
