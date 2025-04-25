public class Main {
    public static void main(String[] args) {
        Drink firstDrink=new Tee("чай",0.5,80,true,true);
        Drink twiseDrink=new Latte("Latte",0.5,150,true,true);
        Drink threeDrink=new Americano("Americano",0.8,100,true,true);
        System.out.println(firstDrink.getTOtalPrise());
        System.out.println(twiseDrink.getTOtalPrise());
        System.out.println(threeDrink.getTOtalPrise());
    }
}
