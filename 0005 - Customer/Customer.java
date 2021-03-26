// package bankingPrj; 
// package Customer;

// import bankingPrj.Account; importing another source code / file named Account under the same project folder

public class Customer {
    public String name = "James Bond";
    public static void main(String[] args){
        Account acc = new Account(); // creating an object of Account class
        acc.showAccName(); // calling the showAccName method of the object
        Customer cous = new Customer(); // creating an object of Customer class
        System.out.println(cous.name); // calling the method of the object
    }
}