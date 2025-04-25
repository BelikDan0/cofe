public class Latte extends Drink{
    private boolean korica;
    private double PRISE_KOTICA=20;

    public Latte(String name, double value, double prise, boolean mapleSyrup,boolean korica) {
        super(name, value, prise, mapleSyrup);
        this.korica=korica;
    }

    @Override
    public double getTOtalPrise(){
        double totalPrise=0;
        if (korica){
            totalPrise+=PRISE_KOTICA;
        }
        totalPrise+=super.getTOtalPrise();
        return totalPrise;
    }
}
