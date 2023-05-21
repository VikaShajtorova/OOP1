package homeWork4;

public class Director2 extends Director{
    public Director2(String name, String surname, int currentYear, int yearEmployment) {
        super(name, surname, currentYear, yearEmployment);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.DIRECTOR2;
    }
}
