package zoo;

public class VetTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Rex", 3);
        animals[1] = new Horse("Pé de Pano", 5);
        animals[2] = new Sloth("Sid", 2);

        Veterinarian vet = new Veterinarian();

        for (Animal animal : animals) {
            vet.examinar(animal);
            System.out.println();
        }
    }
}
