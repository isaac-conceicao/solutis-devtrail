package zoo;

public class Sloth extends Animal {
    public Sloth(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("A preguiça " + getName() + " está fazendo um som: Aaaaaah!");
    }

    public void climbTree() {
        System.out.println("A preguiça " + getName() + " está subindo em uma árvore.");
    }
}
