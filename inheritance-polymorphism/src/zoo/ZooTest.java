package zoo;

public class ZooTest {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.adicionarAnimal(new Dog("Caramelo", 3));
        zoo.adicionarAnimal(new Horse("Pegasus", 5));
        zoo.adicionarAnimal(new Sloth("Sid", 2));
        zoo.adicionarAnimal(new Dog("Totó", 2));
        zoo.adicionarAnimal(new Horse("Eguinha Pocotó", 4));

        System.out.println("Percorrendo as jaulas do zoológico:");
        zoo.percorrerJaulas();
    }
}
