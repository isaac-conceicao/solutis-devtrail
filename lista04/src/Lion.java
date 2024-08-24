import java.time.LocalTime;

public class Lion extends TerrestrialAnimalAB {

    @Override
    public String eat(float amount){
        this.setIngestedFood(this.getIngestedFood() + amount);
        return this.getName() + " is eating " + amount + "kg of food";
    }

    @Override
    public String move(float distance){
        this.setDistanceTraveled(this.getDistanceTraveled() + distance);
        return this.getName() + " is moving " + distance + " meters";
    }

    @Override
    public String sleep(LocalTime time){
        LocalTime sum = this.getSleepHours().plusHours(time.getHour());
        this.setSleepHours(sum);
        return this.getName() + " is sleeping for" + time.toString() + "hs";
    }

}
