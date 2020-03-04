/**
 * This class is for the Cheese Connoisseur object and interacts with the Cheese
 * object.
 *
 * @author Noah Longhi
 * @since 2-20-2020
 *
 */
public class CheeseConnoisseur {
    private String name;
    private Cheese cheese;
    private double money;

    /**
     * This creates the CheeseConnoisseur object with a name, cheese, and money
     * amount.
     *
     * @param n This assigns a name to the CheeseConnoisseur object
     * @param c This assigns a cheese to the CheeseConnoisseur object
     * @param m This assigns a money amount to the Cheese Connoisseur object
     *
     */
    public CheeseConnoisseur(String n, double m, Cheese c) {
        name = n;
        money = m;
        cheese = c;
    }

    /**
     * This creates a CheeseConnoisseur object without a specified cheese.
     */
    public CheeseConnoisseur(String n, double m) {
        this(n, m, null);
    }

    /**
     * This creates a CheeseConnoisseur object with only a name.
     */
    public CheeseConnoisseur(String n) {
        this(n, 0.0, null);
    }

    /**
     * This creates a Cheese Connoisseur class without any parameters and
     * automatically assigns them.
     */
    public CheeseConnoisseur() {
        this("Louis Pasteur", 20.00, null);
    }

    /**
     * This is an accessor for the money variable on a cheese connoisseur object.
     *
     * @return The amount of money the cheese connoisseur object has
     */
    double getMoney() {
        return money;
    }

    /**
     * This is a mutator for the money variable on a cheese connoisseur object.
     * 
     * @param s Sets the cheese connoisseur's money amount
     */
    public void setMoney(double s) {
        this.money = s;
    }

    /**
     * This makes a trade happen between two cheese connoisseurs and checks for
     * sentience.
     * 
     * @param c Allows for the cheeses between the two connoisseurs to switch in the
     *          instance of this method
     */
    public void makeTrade(Cheese c) {
        if (c == null || cheese == null) {
            return;
        }
        cheese.trade();
        cheese.setTradeCounter();
        cheese = c;
        cheese.trade();
    }

    /**
     * This swaps the two cheese connoisseurs cheese permanently later in the
     * makeTrade method.
     * 
     * @param c1 First cheese connoisseur that will have his cheese switched
     * @param c2 Second cheese connoisseur that will have his cheese switched
     */
    public void swap(CheeseConnoisseur c1, CheeseConnoisseur c2) {
        Cheese temp = c1.cheese;
        c1.cheese = (c2.cheese);
        c2.cheese = (temp);
    }

    /**
     * This will make the trade between two cheese connoisseur and correctly balance
     * their money amount respectively.
     * 
     * @param cc The cheese connoisseur that is being traded with
     */
    public void makeTrade(CheeseConnoisseur cc) {

        CheeseConnoisseur ccLess;
        CheeseConnoisseur ccMore;
        double diff;
        if (cc.cheese == null || cheese == null) {
            return;
        } else if (cheese.equals(cc.cheese)) {
            return;
        }
        if (cheese.getPrice() > cc.cheese.getPrice()) {
            ccLess = cc;
            ccMore = this;
            diff = ccMore.cheese.getPrice() - ccLess.cheese.getPrice();
        } else {
            ccLess = this;
            ccMore = cc;
            diff = ccMore.cheese.getPrice() - ccLess.cheese.getPrice();
        }
        if (ccLess.getMoney() >= ccMore.cheese.getPrice()) {
            ccLess.setMoney(ccLess.getMoney() - diff);
            ccMore.setMoney(ccMore.getMoney() + diff);
            this.cheese.trade();
            this.cheese.setTradeCounter();
            cc.cheese.trade();
            swap(this, cc);
        } else {
            return;
        }

    }
}
