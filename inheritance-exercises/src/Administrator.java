public class Administrator extends Employee {
    private double costAssistance;

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + costAssistance;
    }

    @Override
    public String toString() {
        return
                super.toString(costAssistance) +
                "\najuda de custo: " + costAssistance
        ;
    }

    public double getCostAssistance() {
        return costAssistance;
    }

    public void setCostAssistance(double costAssistance) {
        this.costAssistance = costAssistance;
    }
}
