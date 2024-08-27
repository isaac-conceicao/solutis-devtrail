package zoo;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("O cachorro " + getName() + " está latindo: Au au!");
    }

    public void run() {
        System.out.println("O cachorro " + getName() + " está correndo.");
    }
}
