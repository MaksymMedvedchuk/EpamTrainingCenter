package chapter3.varianta.customer;

public class Runner {
    private static final CustomerRepository CUSTOMER_REPOSITORY = new CustomerRepository();

    public static void main(String[] args) {
        fillRepository();
        System.out.println("Customers whose card number falls within the specified range:");
        System.out.println(CUSTOMER_REPOSITORY.findByCardFromInterval("3234456936211483", "3234456936211485"));
        System.out.println();
        System.out.println("Customers in alphabetical order:");
        System.out.println(CUSTOMER_REPOSITORY.findByNameSurnameOrder());
    }

    private static void fillRepository() {
        Customer firstCustomer = new Customer(12345, "Mikolaiv", "Artem", "Centralna 9",
                "3234456936211484", "12361478521236");
        Customer secondCustomer = new Customer(67891, "Vasilik", "Vasil", "Plygna 1",
                "3654789625683698", "12178914785234");
        Customer thirdCustomer = new Customer(69547, "Artemii", "Artem", "Lihotnya 3",
                "3698745632145694", "258963231456");

        CUSTOMER_REPOSITORY.addCustomer(firstCustomer);
        CUSTOMER_REPOSITORY.addCustomer(secondCustomer);
        CUSTOMER_REPOSITORY.addCustomer(thirdCustomer);
    }
}
