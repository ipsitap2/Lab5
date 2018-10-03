import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     *
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     * setter
     * @param setAcc iudhiwuhd
     */

    public void setAccountNumber(final int setAcc) {
        this.accountNumber = setAcc;
    }

    /**
     * getter
     * @return
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     * setter
     * @param setBalance jfk
     */

    public void setAccountBalanceBalance(final double setBalance) {
        this.accountBalance = setBalance;
    }

    /**
     * getter
     * @return
     */
    public double getAccountBalance() {
        return this.accountNumber;
    }
    /**
     *
     */

    private String ownerName;
    /**
     * setter
     * @param setownerName jfk
     */

    public void setOwnerName(final String setownerName) {
        this.ownerName = setownerName;
    }

    /**
     * getter
     * @return ownername
     */
    public String getOwnerName() {
        return this.ownerName;
    }
    /**
     *
     */

    private double interestRate;
    /**
     * setter
     * @param setinterestRate jfk
     */

    public void setInterestRate(final double setinterestRate) {
        this.interestRate = setinterestRate;
    }

    /**
     * getter
     * @return interest rate
     */
    public double getInterestRate() {
        return this.interestRate;
    }
    /**
     *
     */
    private double interestEarned;
    /**
     * setter
     * @param setinterestEarned jfk
     */

    public void setInterestEarned(final double setinterestEarned) {
        this.interestEarned = setinterestEarned;
    }

    /**
     * getter
     * @return interest rate
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /**
     *
     * @param name fgb
     * @param accountCategory dvfvdf
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
