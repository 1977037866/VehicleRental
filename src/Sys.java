import java.util.Scanner;

public class Sys {
	int rentalNo;
	//�洢�⳵��Ϣ
	String[] name;
	String[] lisence;
    int[] day;
    double[] fee;
	//��ӭ��
	public void welcome(){
		System.out.println("\t\t-------------------------------");
	    System.out.println("\t\t|     ��ӭ����**�������޹�˾           |");
	    System.out.println("\t\t-------------------------------");
	}
	//ѡ�������ҵ��
	public void  businessSelect(){
		String isContinue=null;
		do{
			System.out.print("��Ҫ�����ҵ���ǣ�1.�⳵   2.����\t");
		    Scanner inputBusiness = new Scanner(System.in);
		    int a = inputBusiness.nextInt();
		    if(a == 1){
			    pickUp();
		    }else{
		    	dropOff();
		    }
		    System.out.print("�����𣿣�y/n��");
		    Scanner b=new Scanner(System.in);
		    isContinue=b.next();
		    System.out.println();
		}while(isContinue.equalsIgnoreCase("y"));
		System.out.println("��ӭ�´λݹˣ�");
	}
	//�⳵
	public void pickUp(){
		//car or bus
		String[] ct={"�������","����","���������"};
		String[] cl={"³B.11111","³B.22222","³B.33333"};
		String[] bt={"����(seats<=16)","����(seats>16)"};
		String[] bl={"³B.44444","³B.55555"};

		//ѯ���⳵�����������ͬ����С������洢�⳵����
 		System.out.print("�⳵����Ϊ(<=5)��");
 		Scanner c=new Scanner(System.in);
 		rentalNo=c.nextInt();
 		name=new String[rentalNo];
 		lisence=new String[rentalNo];
 	    day=new int[rentalNo];
 	    fee=new double[rentalNo];
 	    
 		for (int i = 0; i < rentalNo; i++) {
 			System.out.println("��"+(i+1)+"��");
			System.out.println("����ĳ����У�1.car  2.bus");
			System.out.print("��ѡ����Ҫ���޵ĳ��ͣ�");
			Scanner d=new Scanner(System.in);
		    int typeChoice=d.nextInt();
		    if(typeChoice==1){
			   System.out.print("�ɹ�ѡ��ĳ�:  1.�������  2.����  3.���������\t");
			   Scanner inputCar=new Scanner(System.in);
			   int x=inputCar.nextInt();
			   Moto moto_1=new Car(cl[x-1],ct[x-1]);  //��̬,
			   //Car car=(Car)moto_1;      //����ת�ͣ�ǿ����ת����,���õ�������ʹ��
			   System.out.println("�⳵ʱ��Ϊ��");
			   Scanner inputDay=new Scanner(System.in);
			   name[i]=ct[x-1];
			   lisence[i]=moto_1.getLisencePlate();
			   day[i]=inputDay.nextInt();
			   fee[i]=moto_1.billCalculator(day[i]);
		    }else{
			   System.out.println("�ɹ�ѡ��ĳ�:  1.<=16��     2.>16�� \t");
			   Scanner inputBus=new Scanner(System.in);
			   int y=inputBus.nextInt();
			   Moto moto_2=new Bus(bl[y-1],bt[y-1]);
			   System.out.println("�⳵ʱ��Ϊ��");
			   Scanner inputDay=new Scanner(System.in);
			   name[i]=bt[y-1];
			   lisence[i]=moto_2.getLisencePlate();
			   day[i]=inputDay.nextInt();
			   fee[i]=moto_2.billCalculator(day[i]);
		    }
		}
		//�˶���Ϣ
		System.out.println("�⳵��Ϣ���£����ʵ"); 
		System.out.println("\t����\t\t����\t\t��������\t\t����");
		double totalFee=0;
		for (int i = 0; i < rentalNo; i++) {
			System.out.println("\t"+name[i]+"\t\t"+lisence[i]+"\t"+day[i]+"\t\t"+fee[i]);
			totalFee += fee[i];
		}
		System.out.println("������֧�����Ϊ��"+totalFee);
	}
	//����
	public void dropOff(){
		int count=0;
		//���û�����������������������3ʱ���ظ�ѯ��
		do{
			System.out.println("��������ĳ��ƺţ�");
		    Scanner inputNo=new Scanner(System.in);
		    String number=inputNo.next();
		    for (int i = 0; i < rentalNo; i++) {
				if(number==lisence[i]){
					 System.out.println("�����ɹ���");
			         break;
		        }else{
		        	 System.out.println("���������ȷ�Ϻ��������룡");			   
			         count++;
		        }
			}
		}while(count<3);
		if(!(count<3))
			System.out.println("��������Ƶ�������Ժ��ԣ�");
	}
	public static void main(String[] args) {
		Sys sys=new Sys();
		sys.welcome();
		sys.businessSelect();
	}
}
