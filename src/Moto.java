
public abstract class Moto {
    //����
	private int price;
	private String lisencePlate;
	//Getter��Setter����
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLisencePlate() {
		return lisencePlate;
	}
	public void setLisencePlate(String lisencePlate) {
		this.lisencePlate = lisencePlate;
	}
	//��Ա����
	public abstract void typeSelection();
	
}
