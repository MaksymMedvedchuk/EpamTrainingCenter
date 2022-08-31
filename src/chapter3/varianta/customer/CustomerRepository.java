package chapter3.varianta.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerRepository {

    private final List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer input) {
        customerList.add(input);
    }

    public List<Customer> findAlCardIntervalCustomer(String cardInterval) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getCreditCardNumber().charAt(0) > cardInterval.charAt(0) && customer.getCreditCardNumber().charAt(15) < cardInterval.charAt(15)) {
                list.add(customer);
            }
        }
        return list;
    }

    public List<Customer> findAlphabeticalOrderCustomer() {
              //       return customerList.stream().sorted().collect(Collectors.toList());//робив спочатку, но ClassCastException
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customerList) {
            list.add(customer);
            list.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getSurname));
        }
        return list;
    }
}


//Comparator це інтерфейс для порівняння обєктів в коллекції?
//comparing створює компататори для порівняння парамерів обєктів?
// через Collections ми можемо сотрувати тільки якщо в обєкта один параметр?

