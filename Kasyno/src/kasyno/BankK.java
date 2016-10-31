package kasyno;

/**
 *
 * @author Whisu
 */
public class BankK {

    int stanKonta = 10000;
    private static BankK inst;

    private BankK() {
    }

    public static synchronized BankK inst() {
        if (inst == null) {
            inst = new BankK();
        }
        return inst;
    }

    public void aktKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public int stanK() {
        return stanKonta;
    }
}
