import java.util.Scanner;

public class Bus extends Moto{
	public void typeSelection(){
		int[] i={800,1500};
		String[] s={"³B.44444","³B.55555"};
		System.out.println("�ɹ�ѡ��ĳ�:  1.<=16��     2.>16�� \t");
		Scanner inputType=new Scanner(System.in);
		int b=inputType.nextInt();	
		setPrice(i[b-1]);
		setLisencePlate(s[b-1]);
		System.out.println("�����⳵�ĳ��ƺ�Ϊ��"+getLisencePlate());
	}
}
