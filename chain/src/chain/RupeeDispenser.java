package chain;

public class RupeeDispenser implements  Dispenser{
private Dispenser next=null;
private int worth;
public RupeeDispenser(int worth) {

	this.worth = worth;
}
public void setNext(Dispenser dispenser)
{
	this.next=dispenser;
	}
public void dispense(Currency curremcy) {
	if(curremcy.getAmount()>=worth) {
		int quotient=curremcy.getAmount()/worth;
		int reminder= curremcy.getAmount()%worth;
		System.out.println("Dispensing "+quotient+" in "+worth+" Notes");
		if(reminder!=0 && next!=null) {
			next.dispense(new Currency(reminder));
		}
	}
	else if(next!=null){
		next.dispense(curremcy);
	}
	else {
		System.out.println(curremcy.getAmount()+" cannot be processed");
		
	}
}
}
