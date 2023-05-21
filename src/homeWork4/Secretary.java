package homeWork4;

import java.util.Arrays;

public class Secretary extends Worker{
    public Secretary(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.SECRETARY;
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
