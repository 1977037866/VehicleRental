import java.util.Scanner;

public class Car extends Moto{
	public void typeSelection(){
		int[] i={600,500,300};
		String[] s={"³B.11111","³B.22222","³B.33333"};
		System.out.print("�ɹ�ѡ��ĳ�:  1.�������  2.����  3.���������\t");
		Scanner inputType=new Scanner(System.in);
		int c=inputType.nextInt();
		setPrice(i[c-1]);
		setLisencePlate(s[c-1]);
		System.out.println("�����⳵�ĳ��ƺ�Ϊ��"+getLisencePlate());
	}
}
