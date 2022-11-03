package chapter3.varianta.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
//              Перша реалізація через створення класу, який імплементить Comparator
        List<Customer> list = new ArrayList<>(customerList);
        list.sort(new Customer.Comparator());
        return list;
//        Друга реалізація через інтерфейс Comparable
//        return customerList.stream().sorted().collect(Collectors.toList());
//        Третя через метод sort з використанням Comparator
//        List<Customer> list = new ArrayList<>(customerList);
//        list.sort(Comparator.comparing(Customer::getName).
//        thenComparing(Customer::getSurname));
//        return list;
    }
}


//Comparator це інтерфейс для порівняння обєктів в коллекції?
//comparing створює компататори для порівняння парамерів обєктів?
// через Collections ми можемо сотрувати тільки якщо в обєкта один параметр?

