public class Car extends Moto{
	private String type;
	public  Car(String lisencePlate,String type) {
		super(lisencePlate);
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double billCalculator(int day){  
		if (type.equals("�������")) {
			 setPrice(600);
		} else if (type.equals("����")) {
			setPrice(500);
		} else {
			setPrice(300);
		}
		return super.billCalculator(day);
	} 
}
