public class Bus extends Moto{
	private String seat;
	public Bus(String lisencePlate,String seat) {
		super(lisencePlate);
		this.seat=seat;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public double billCalculator(int day){  
		if (seat.equals("seats>=16")) {
			setPrice(800);
		} else {
			setPrice(1500);
		}
		return super.billCalculator(day);
	} 
}
