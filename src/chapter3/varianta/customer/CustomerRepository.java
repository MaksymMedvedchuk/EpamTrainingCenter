package chapter3.varianta.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private final List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer input) {
        customerList.add(input);
    }

    public List<Customer> findByCardFromInterval(String min, String max) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customerList) {
            if (Long.parseLong(customer.getCreditCardNumber()) >= Long.parseLong(min)
                    && Long.parseLong(customer.getCreditCardNumber()) <= Long.parseLong(max)) {
                list.add(customer);
            }
        }
        return list;
    }

    public List<Customer> findByNameSurnameOrder() {
        List<Customer> list = new ArrayList<>(customerList);
        list.sort(new Customer.Comparator());
        return list;

    }
}


