package homeWork4;

import java.util.Arrays;

public class Janitor extends Worker{
    public Janitor(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.JANITOR;
    }

    @Override
    public int getSalary() {
        return 1000;
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
