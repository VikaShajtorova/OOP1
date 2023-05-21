package homeWork4;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Sam","Williams");
        System.out.println(person1.getName());

        Employee director1 = new Director("Pol","Peters",2023,2010);
        System.out.println(director1.getSalary());

        Employee worker1 = new Worker("Olivia","Peters",2023,2013);
        System.out.println(worker1.getSalary());

        director1.addWorker(worker1);
        System.out.println(director1.toString());

        Worker accountant = new Accountant("Sara","Davis",2023,2010);
        System.out.println(accountant.toString());
        Worker secretary = new Secretary("Mary","Gibson",2023,2011);
        System.out.println(secretary.toString());
        Worker janitor = new Janitor("Adam","Jackson",2023,2010);
        System.out.println(janitor.toString());

        Director director2 = new Director2("Sophia","Jordan",2023,2010);
        director2.addWorker(secretary);
        director2.addWorker(accountant);
        System.out.println(director2);
        director1.addWorker(director2);
        System.out.println(director1);

        Worker intern1 = new Intern("Richard","Grant",2023,2023,4);
        worker1.addWorker(intern1);
        System.out.println(worker1);

        Service service = new Service();
        System.out.println(service.find(worker1,"Olivia Peters"));

    }
}
