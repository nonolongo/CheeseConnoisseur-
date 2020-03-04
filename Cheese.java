//I worked on the homework assignment alone, using only course materials.
/**
 * This class creates a cheese object with different descriptors to be used by
 * Cheese Connoisseurs
 *
 * @author Noah Longhi
 * @since 2-20-2020
 *
 */
public class Cheese {

    private String type;
    private double price;
    private boolean sentience;
    private int tradeCounter;
    private static int totalTradeCount;

    /**
     * This is a constructor that creates the objects for this class.
     *
     * @param p  This helps assign a price to the cheese object
     * @param t  This helps assign a cheese type to the cheese object
     * @param tc This helps create the tradeCounter object and sets it so that if it
     *           is greater than three, it sets the Cheese's sentience to true
     */
    public Cheese(double p, String t, int tc) {
        price = p;
        type = t;
        tradeCounter = tc;
        setSentience();
    }

    /**
     * This is a constructor that creates a cheese object with only the values
     * price. and type
     *
     * @param p This helps assign a price to the cheese object
     * @param t This helps assign a cheese type to the cheese object
     *
     */
    public Cheese(double p, String t) {
        this(p, t, 0);
    }

    /**
     * This is an accessor to the tradeCounter variable.
     *
     * @return integer tradeCounter
     */
    public int getTradeCount() {
        return tradeCounter;
    }

    /**
     * This is an accessor to the totalTradeTrades variable.
     *
     * @return The total number of trades
     */
    public static int getTotalTrades() {
        return totalTradeCount;
    }

    /**
     * This is an accessor to the price variable.
     *
     * @return Price of cheese from cheese object
     */
    public double getPrice() {
        return price;
    }

    /**
     * This is an accessor to the type variable.
     *
     * @return Type of cheese for Cheese object returned
     */
    public String getCheeseType() {
        return type;
    }

    /**
     * This increases the trade total trade count by one for each time it is called.
     */
    public void setTradeCounter() {
        totalTradeCount++;
    }

    /**
     * This sets the sentience of the cheese object if tradeCounter is greater than
     * or equal to three.
     */

    public boolean getSentience() {
        return sentience;
    }

    public void setSentience() {
        if (tradeCounter >= 3) {
            sentience = true;
        } else {
            sentience = false;
        }
    }

    /**
     * Converts objects to strings to help with testing code.
     */
    public String toString() {
        String c;
        String tst = this.getCheeseType();
        int tstc = this.getTradeCount();

        if (!this.getSentience()) {
            c = "This is a slice of " + tst + " cheese that has been traded " + tstc + " times.";
        } else {
            c = "I am a slice of " + tst + " cheese that has been traded " + tstc + " times.";
        }
        return c;
    }

    /**
     * Checks if two cheese objects are the same based on price, type AND sentience.
     *
     * @param c compares a cheese with this.cheese
     * @return boolean determining if two cheeses are equal or not
     */
    public boolean equals(Cheese c) {
        if (price == c.price) {
            if (type == c.type) {
                if (sentience == c.sentience) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Allows for the trade of a cheese to occur.
     */
    public void trade() {
        tradeCounter++;
        if (tradeCounter == 3) {
            sentience = true;
            price *= 2;
            System.out.println("I'm ALIIIIIVE!");
        }
    }
}
