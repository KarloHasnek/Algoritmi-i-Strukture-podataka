package pckg_bank;

public class BankStand {

    private int id;
    private static int cntID = 1;
    private float processingTime;
    private boolean statusProcessing;

    public BankStand(float processingTime) {
        this.id = cntID++;
        this.processingTime = processingTime*id;
        statusProcessing = true;
    }

    public void changeBankStandStatus(boolean newStatus) {
        this.statusProcessing = newStatus;
    }
}
