public class Tee extends Drink{
    private boolean mint;
    private double PRISE_MINT=10;
    public Tee(String name, double value, double prise, boolean mapleSyrup,boolean mint) {
        super(name, value, prise, mapleSyrup);
        this.mint=mint;
    }
    @Override
    public double getTOtalPrise(){
        double totalPrise=0;
        if (mint){
            totalPrise+=PRISE_MINT;

        }
        totalPrise+=super.getTOtalPrise();

        return totalPrise;
    }
}
