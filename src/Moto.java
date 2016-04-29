
public abstract class Moto {
    //属性
	private int price;
	private String lisencePlate;
	//Getter、Setter方法
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
	//成员方法
	public abstract void typeSelection();
	
}
