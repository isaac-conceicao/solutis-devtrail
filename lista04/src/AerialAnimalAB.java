import java.time.LocalTime;

public abstract class AerialAnimalAB extends AnimalAB{

    private int wingsQty;
    private int pawsQty;
    private double wingspan;

    @Override
    public String move(float distance){
        return "flying " + distance + " meters";
    }

    public int getWingsQty() {
        return wingsQty;
    }

    public void setWingsQty(int wingsQty) {
        this.wingsQty = wingsQty;
    }

    public int getPawsQty() {
        return pawsQty;
    }

    public void setPawsQty(int pawsQty) {
        this.pawsQty = pawsQty;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
