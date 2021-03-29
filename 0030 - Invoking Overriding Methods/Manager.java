class Employee {
    public String name = "Mahmud";
    public float salary = 50000;


    public void showDetails(){
        System.out.println(name + " " + salary);
    }
}


public class Manager extends Employee {
    public String department = "Engineering";



    public void showDetails(){
        super.showDetails(); // invoking using super
        System.out.println(" " + department);
    }

    public static void main (String[] args){
        Manager m = new Manager();
        m.showDetails();
    }
}