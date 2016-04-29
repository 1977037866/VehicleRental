import java.util.Scanner;

public class Bus extends Moto{
	public void typeSelection(){
		int[] i={800,1500};
		String[] s={"鲁B.44444","鲁B.55555"};
		System.out.println("可供选择的车:  1.<=16座     2.>16座 \t");
		Scanner inputType=new Scanner(System.in);
		int b=inputType.nextInt();	
		setPrice(i[b-1]);
		setLisencePlate(s[b-1]);
		System.out.println("您所租车的车牌号为："+getLisencePlate());
	}
}
