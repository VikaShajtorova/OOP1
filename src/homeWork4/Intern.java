package homeWork4;

public class Intern extends Worker {
   public int quantityHours;

    public Intern(String name, String surname, int currentYear, int yearEmployment, int quantityHours) {
        super(name, surname, currentYear, yearEmployment);
        this.quantityHours = quantityHours;
    }
    @Override
    public void setProfession() {
        this.profession = PROFESSION.INTERN;
    }

    @Override
    public int getSalary() {
       if(quantityHours==0){
           return super.getSalary();
       }else {
           return baseRate*quantityHours;
       }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + getName() +
                ", profession=" + profession +
                ", salary=" + getSalary() +
                '}';
    }
}
