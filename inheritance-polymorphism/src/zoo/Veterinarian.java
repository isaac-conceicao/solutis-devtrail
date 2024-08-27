package zoo;

public class Veterinarian {
    public void examinar(Animal animal) {
        System.out.println("O veterinário está examinando o animal " + animal.getName() + ".");
        animal.makeSound();
    }
}
