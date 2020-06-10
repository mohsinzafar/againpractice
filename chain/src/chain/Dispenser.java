package chain;

public interface Dispenser {
void setNext(Dispenser dispenser);
void dispense(Currency curremcy);
}
