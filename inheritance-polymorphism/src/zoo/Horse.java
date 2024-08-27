package zoo;

public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("O cavalo " + getName() + " está relinchando: Relincho!");
    }

    public void run() {
        System.out.println("O cavalo " + getName() + " está galopando.");
    }
}
