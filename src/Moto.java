public abstract class Moto {
    //属性
	private double price;
	private String lisencePlate;
	//带参构造方法
	public  Moto(String lisencePlate){
		this.lisencePlate=lisencePlate;
	}
	//Getter、Setter方法
	public double getPrice() {
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
	public double billCalculator(int day){  //费用计算方法不受子类影响，可以有方法体,故不必声明为抽象方法
		return day*price;
	}
}
//注意！注意！注意！面向对象思想！！！