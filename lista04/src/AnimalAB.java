import java.time.LocalTime;

public abstract class AnimalAB implements AnimalIF{
    private String name;
    private String kind;
    private int age;
    private String habitat;
    private float height;
    private float weight;
    private LocalTime sleepHours = LocalTime.of(0,0);
    private float ingestedFood = 0.0F;
    private float distanceTraveled = 0.0F;

    @Override
    public String eat(float amount){
        return "eating " + amount + "kg";
    }

    @Override
    public String move(float distance){
        return "moving " + distance + " meters";
    }

    @Override
    public String sleep(LocalTime time){
        return "sleeping for" + time.toString() + "h";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalTime getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(LocalTime sleepHours) {
        this.sleepHours = sleepHours;
    }

    public float getIngestedFood() {
        return ingestedFood;
    }

    public void setIngestedFood(float ingestedFood) {
        this.ingestedFood = ingestedFood;
    }

    public float getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(float distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
}
