import java.util.Scanner;

public class Car extends Moto{
	public void typeSelection(){
		int[] i={600,500,300};
		String[] s={"鲁B.11111","鲁B.22222","鲁B.33333"};
		System.out.print("可供选择的车:  1.别克商务  2.宝马  3.别克林荫大道\t");
		Scanner inputType=new Scanner(System.in);
		int c=inputType.nextInt();
		setPrice(i[c-1]);
		setLisencePlate(s[c-1]);
		System.out.println("您所租车的车牌号为："+getLisencePlate());
	}
}
