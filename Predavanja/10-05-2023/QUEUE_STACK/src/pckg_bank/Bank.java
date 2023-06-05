package pckg_bank;

import pckg_adt_queue.QUEUEARR;
import pckg_customer.Customer;

import java.util.Set;
import java.util.TreeSet;

public class Bank {

    private String bankName;
    private int id;
    private static int cntID = 100;
    private Set<BankStand> stands;
    private QUEUEARR<Customer> queue;
    private static final int BANKCAP = 30;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.id = cntID++;
        this.stands = new TreeSet<>();
        queue = new QUEUEARR<>(BANKCAP);
    }

    public void addStand(BankStand stand) {
        this.stands.add(stand);
    }

    public void addCustomerToQueue(Customer customer) {
        queue.enqueue(customer);
    }

    public void startTransactionsOnBankStands() {
        // Rjesit problem
        //koliko kojem salteru treba od 100 min da koliko ljudi provuce
    }
}
