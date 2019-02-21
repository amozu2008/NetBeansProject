
package abcbankpack.model;


public class Transactions {
    
    private int transId;
    private int accountNo;
    private String transType;
    private double amount;
    private String amtInWords;
    
    public Transactions(){}
    


    /**
     * @return the transId
     */
    public int getTransId() {
        return transId;
    }

    /**
     * @param transId the transId to set
     */
    public void setTransId(int transId) {
        this.transId = transId;
    }

    /**
     * @return the accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the transType
     */
    public String getTransType() {
        return transType;
    }

    /**
     * @param transType the transType to set
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the amtInWords
     */
    public String getAmtInWords() {
        return amtInWords;
    }

    /**
     * @param amtInWords the amtInWords to set
     */
    public void setAmtInWords(String amtInWords) {
        this.amtInWords = amtInWords;
    }
    
    
}
