package chapter3.varianta.customer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer(12345, "Mikolaiv", "Mikola", "Centralna 9",
                234567, 789654);
        Customer secondCustomer = new Customer(67891, "Vasilik", "Vasil", "Plygna 1",
                852369, 321789);
        Customer thirdCustomer = new Customer(69547, "Artemii", "Artem", "Lihotnya 3",
                369147, 258963);

        CustomerList customerList = new CustomerList();
        customerList.addCustomer(firstCustomer);
        customerList.addCustomer(secondCustomer);
        customerList.addCustomer(thirdCustomer);

        customerList.printAlphabeticalOrderCustomer(111111, 999999);
        












    }
}
