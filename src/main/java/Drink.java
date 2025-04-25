public abstract class Drink {
    private String name;
    private double value;
    private double prise;
    private boolean mapleSyrup;

    public final double PRISE_MAPLE_SYRUP=30;

    public Drink(String name, double value, double prise, boolean mapleSyrup) {
        this.name = name;
        this.value = value;
        this.prise = prise;
        this.mapleSyrup = mapleSyrup;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public double getPrise() {
        return prise;
    }

    public boolean isMapleSyrup() {
        return mapleSyrup;
    }

    public double getTOtalPrise(){
        double totalPrise=getPrise();
        if (mapleSyrup){
            totalPrise+=PRISE_MAPLE_SYRUP;

        }
        return totalPrise;
    }
}
