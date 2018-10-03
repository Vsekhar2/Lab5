import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Bank Account Type Enum
     */
    public enum BankAccountType {
        /**
         * Checkings
         */
        CHECKINGS,
        /**
         * Savings
         */
        SAVINGS,
        /**
         * Student
         */
        STUDENT,
        /**
         * WorkPlace
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name ownerName
     * @param accountCategory BankACcount type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {

        this.ownerName = name;

        this.accountType = accountCategory;

        Bank.setTotalAccounts();
        /*
         * Implement this function
         */




    }

    /**
     *
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param setAccountNumber  = accountNumber
     */
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;

    }
    /**
     *
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * @param setAccountType  = AccountType
     */
    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;

    }

    /**
     *
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param setAccountBalance  = Account Balance
     */
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /**
     *
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * @param setOwnerName  = OwnerName
     */
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    /**
     *
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * @param setInterestRate = interestRates
     */
    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }
    /**
     *
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * @param setInterestEarned  = InterestEarned
     */
    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
