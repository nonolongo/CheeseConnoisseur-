/**
 * This class is a driver that tests all of my code in the previous two classes
 *
 * @author Noah Longhi
 * @since 2-20-2020
 *
 */
public class CheeseDriver {
    /**
     * This is testing for the my two classes that I created.
     *
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {

        Cheese feta = new Cheese(5, "Feta");
        Cheese gouda = new Cheese(6, "Gouda");
        Cheese cheddar = new Cheese(7, "Cheddar");
        Cheese brie = new Cheese(8, "Brie");

        CheeseConnoisseur cc1 = new CheeseConnoisseur("Noah", 1000.00, feta);
        CheeseConnoisseur cc2 = new CheeseConnoisseur("Munim", 1000.00, cheddar);
        CheeseConnoisseur cc3 = new CheeseConnoisseur("Gayathri", 1000.00, brie);
        CheeseConnoisseur cc4 = new CheeseConnoisseur();
        CheeseConnoisseur cc5 = new CheeseConnoisseur("Richard", 1000.00, gouda);
        cc1.makeTrade(cc2);
        cc2.makeTrade(cc3);
        cc3.makeTrade(cc5);
        cc1.makeTrade(cc2);
        cc2.makeTrade(cc3);
        cc3.makeTrade(cc5);
        cc1.makeTrade(cc2);
        cc2.makeTrade(cc3);
        cc3.makeTrade(cc5);
        // cc5.makeTrade(cc3);
//        cc1.makeTrade(cc4);
//        cc4.makeTrade(cc3);
//        cc5.makeTrade(cc3);
        System.out.println(feta);
        System.out.println(gouda);
        System.out.println(cheddar);
        System.out.println(brie);
        System.out.println(Cheese.getTotalTrades());

    }
}
