package day14;
abstract class empl{
    protected String name;
    protected int id;
    protected int base_salary;
    empl(String name,int id,int base_salary){
        this.name=name;
        this.id=id;
        this.base_salary=base_salary;
    }

    abstract void bonus();

}
class manager extends empl{
    manager(String name, int id, int base_salary) {
        super(name, id, base_salary);
    }


    @Override
    public void bonus() {

        System.out.println("Salary of Manager"+" "+base_salary*10);
    }

}

class deveplor extends empl{
    deveplor(String name, int id, int base_salary) {
        super(name, id, base_salary);
    }

    @Override
    public void bonus() {

        System.out.println("Salary of Dev"+" "+base_salary*5);
    }
}
class intern extends empl{
    intern(String name, int id, int base_salary) {
        super(name, id, base_salary);
    }

    @Override
    public void bonus() {

        System.out.println("Salary of intern"+" " +base_salary);
    }
}

public class Employee_Problem {
    public static void main(String[] args){
        empl m=new manager("Partha",20,20000);
        empl d=new deveplor("vivin",21,15000);
        empl i=new intern("Uwaiz",22,10000);
        m.bonus();
        d.bonus();
        i.bonus();


    }
}