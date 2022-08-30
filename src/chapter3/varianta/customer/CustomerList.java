package chapter3.varianta.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

    List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer input) {
        customerList.add(input);
    }

    public void printAlphabeticalOrderCustomer(int beginInput, int endInput) {
        System.out.println("Customers in alphabetical order: ");
        for (Customer customer : customerList) {
            if (endInput < customer.getCreditCardNumber() && customer.getCreditCardNumber() > beginInput) {
                System.out.println(customer);
            }
        }
    }

}
