public abstract class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person(){

    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(Person person) {
        this(person.getName(), person.getAddress(), person.getPhoneNumber());
    }

    @Override
    public String toString() {
        return
                "\nnome: " + name +
                "\nendereço: " + address +
                "\ntelefone: " + phoneNumber
        ;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
