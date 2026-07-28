package day14;

abstract class Staff {
    String name;
    double salary;
    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    abstract void bonus();
}
class Manager extends Staff {
    Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    void bonus() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: 20000");
        System.out.println();
    }
}
class Employee extends Staff {
    Employee(String name, double salary) {
        super(name, salary);
    }
    @Override
    void bonus() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: 10000");
        System.out.println();
    }
}
class Intern extends Staff {
    Intern(String name, double salary) {
        super(name, salary);
    }
    @Override
    void bonus() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: 0");
        System.out.println();
    }
}

public class salaryBonus {
    public static void main(String[] args){
        Staff m = new Manager("Ravi", 80000);
        Staff e = new Employee("Priya", 50000);
        Staff i = new Intern("Arun", 15000);

        m.bonus();
        e.bonus();
        i.bonus();
    }
}