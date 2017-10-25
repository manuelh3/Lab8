import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Types of accounts.
     */
    public enum BankAccountType {
        /**
         * Lets you add and take money.
         */
        CHECKINGS,
        /**
         * Lets you add money and rarely take it out, gives better interest rate.
         */
        SAVINGS,
        /**
         * For students learning.
         */
        STUDENT,
        /**
         * Linked with work.
         */
        WORKPLACE
    }

    /**
     * The identifier.
     */
    private int accountNumber;
    /**
     * What account type this is.
     */
    private BankAccountType accountType;
    /**
     * The amount of money in the account.
     */
    private double accountBalance;
    /**
     * The owner's name.
     */
    private String ownerName;
    /**
     * The current interest rate.
     */
    private double interestRate;
    /**
     * The money to be owned from the investment rate.
     */
    private double interestEarned;

    /**
     * Default constructor.
     * @param name gives name of the owner.
     * @param accountCategory says what type of account this is.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * @return the amount of money that is in the account.
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }
}