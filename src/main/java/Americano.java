public class Americano extends Drink{
    private boolean milk;
    public final double PRISE_MILK=20;
    public Americano(String name, double value, double prise, boolean mapleSyrup,boolean milk) {
        super(name, value, prise, mapleSyrup);
        this.milk=milk;
    }

    @Override
    public double getTOtalPrise() {
        double totalPrise=0;
        if(milk){
            totalPrise+=PRISE_MILK;
        }
        totalPrise+= super.getTOtalPrise();
        return totalPrise;
    }
}
