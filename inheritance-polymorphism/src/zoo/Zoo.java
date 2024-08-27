package zoo;

public class Zoo {
    private Animal[] cages;
    private int ocupation;

    public Zoo() {
        cages = new Animal[10];
        ocupation = 0;
    }

    public void adicionarAnimal(Animal animal) {
        if (ocupation < cages.length) {
            cages[ocupation] = animal;
            ocupation++;
        } else {
            System.out.println("O zoológico está cheio. Não é possível adicionar mais animais.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < ocupation; i++) {
            System.out.println("Jaula " + (i + 1) + ":");
            cages[i].makeSound();
            if (cages[i] instanceof Dog) {
                ((Dog) cages[i]).run();
            } else if (cages[i] instanceof Horse) {
                ((Horse) cages[i]).run();
            } else if (cages[i] instanceof Sloth) {
                ((Sloth) cages[i]).climbTree();
            }
            System.out.println(); // Linha em branco para melhor legibilidade
        }
    }
}
