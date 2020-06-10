package chain;

public class DispenserChain {
	
	 Dispenser d1;
	DispenserChain(){
		 d1=new RupeeDispenser(5000);
		Dispenser d2=new RupeeDispenser(1000);
		Dispenser d3=new RupeeDispenser(500);
		
		d1.setNext(d2);
		d2.setNext(d3);
		
	}
	public void dispense(Currency c) {
		d1.dispense(c);
	}
}
