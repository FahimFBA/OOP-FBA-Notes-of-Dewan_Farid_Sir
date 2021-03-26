// package bankingPrj; // the name of the folder
public class Account{
    public String accountName = "Saving Account";

    public void showAccName() { // method
        System.out.println(accountName);
    }
    public static void main(String[] args){
        Account acc = new Account(); // creating an object
        acc.showAccName(); // calling the method showAccName of the object named acc
    }
}