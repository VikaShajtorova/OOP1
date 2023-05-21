package homeWork4;

public enum PROFESSION {
    DIRECTOR(3),
    WORKER(2),
    ACCOUNTANT(2),
    SECRETARY(2),
    JANITOR(1),
    DIRECTOR2(3),
    INTERN(1)
    ;
    int ratio;

    PROFESSION(int ratio) {
        this.ratio = ratio;
    }
}
