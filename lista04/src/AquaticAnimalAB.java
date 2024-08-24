import java.time.LocalTime;

public abstract class AquaticAnimalAB extends AnimalAB{

    private int finsQty;

    @Override
    public String move(float distance){
        return "swimming " + (distance * 1.852) + " nautical miles";
    }

    public int getFinsQty() {
        return finsQty;
    }

    public void setFinsQty(int finsQty) {
        this.finsQty = finsQty;
    }
}
