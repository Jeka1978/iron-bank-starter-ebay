package model;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(new Person(1, "Jeka"), "beer");
    }
}
