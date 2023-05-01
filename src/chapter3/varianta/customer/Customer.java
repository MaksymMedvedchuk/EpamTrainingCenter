package chapter3.varianta.customer;

public class Customer implements Comparable<Customer> {
    private int id;
    private String surname;
    private String name;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    public Customer(int id, String surname, String name, String address, String creditCardNumber, String bankAccountNumber) {
        setId(id);
        setSurname(surname);
        setName(name);
        setAddress(address);
        setCreditCardNumber(creditCardNumber);
        setBankAccountNumber(bankAccountNumber);
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public int compareTo(Customer o) {
        int result = name.compareTo(o.name);
        if (result == 0) {
            result = surname.compareTo(o.surname);
        }
        return result;
    }

     static class Comparator implements java.util.Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            int result = o1.name.compareTo(o2.name);
            if (result == 0) {
                result = o1.surname.compareTo(o2.surname);
            }
            return result;
        }
    }
}

