package homeWork4;

public class Accountant extends Worker{
    public Accountant(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.ACCOUNTANT;
    }
}
