public abstract class Moto {
    //����
	private double price;
	private String lisencePlate;
	//���ι��췽��
	public  Moto(String lisencePlate){
		this.lisencePlate=lisencePlate;
	}
	//Getter��Setter����
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
	//��Ա����
	public double billCalculator(int day){  //���ü��㷽����������Ӱ�죬�����з�����,�ʲ�������Ϊ���󷽷�
		return day*price;
	}
}
//ע�⣡ע�⣡ע�⣡�������˼�룡����