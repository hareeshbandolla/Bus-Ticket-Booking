package Bus_Reservation;
public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;   // get and set
	Bus(int no, boolean ac, int cap){
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusno() {
		return busno;
	}
	public boolean ac() {
		return ac;
	}
	public int getCapacity() { // acceer method
		return capacity;
	}
	public void setAc(boolean val) {
		ac =val;
	}
	public void setcapacity(int cap) { // mutation
		capacity= cap;
	}
	void displayBusInfo() {
		System.out.println("Bus no :"+busno+" AC "+ac+" Total capacity : "+capacity);
	}
}
