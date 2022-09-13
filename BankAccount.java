/**
 * Aqui creamos la clase Cuenta Bancaria con los respectivos atributos 
 * @author Javier Ramirez 
 */
public class BankAccount {
    public String holder;
    public int accountNumber;
    private double cash;
    private int keyCode;
    protected boolean activated;
    
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getKeyCode() {
        return keyCode;
    }
    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }
    
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    
    
}
