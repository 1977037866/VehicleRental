import java.util.Scanner;

public class Platform {
	int typeChoice;
	int rentalTime;
	int bill;
	String isContinue=null;
    //������ϵ
	private Car car=new Car();
	private Bus bus=new Bus();
	//��ӭ��
	public void welcome(){
		System.out.println("\t\t-------------------------------");
	    System.out.println("\t\t|     ��ӭ����**�������޹�˾           |");
	    System.out.println("\t\t-------------------------------");
	}
	//ѡ�������ҵ��
	public void  businessSelect(){
		do{
			System.out.print("��Ҫ�����ҵ���ǣ�1.�⳵   2.����\t");
		    Scanner inputBusiness=new Scanner(System.in);
		    int business=inputBusiness.nextInt();
		    if(business==1){
			    pickUp();
		    }else{
		    	dropOff();
		    }
		    System.out.print("�����𣿣�y/n��");
		    Scanner input=new Scanner(System.in);
		    isContinue=input.next();
		    System.out.println();
		}while(isContinue.equalsIgnoreCase("y"));
		System.out.println("��ӭ�´λݹˣ�");
	}
	//�⳵
	public void pickUp(){
		//ѡ����
		System.out.println("����ĳ����У�1.car  2.bus");
		System.out.print("��ѡ����Ҫ���޵ĳ��ͣ�");
		Scanner inputType=new Scanner(System.in);
		typeChoice=inputType.nextInt();
		if(typeChoice==1){
			car.typeSelection();
		}else{
			bus.typeSelection();
		}
		//ȷ���⳵ʱ��
		System.out.print("��������Ҫ�⳵��������");
		Scanner inputTime=new Scanner(System.in);
		rentalTime=inputTime.nextInt();
		//�������
		if(typeChoice==1){
		   bill=car.getPrice()*rentalTime;
		}else{
		   bill=bus.getPrice()*rentalTime;
		}
	    
		System.out.println("����Ҫ֧���ķ��ã�"+bill);
		System.out.println("�⳵�ɹ�����ӭ�´λݹˣ�");
	}
	//����
	public void dropOff(){
		int count=0;
		//���û�����������������������3ʱ���ظ�ѯ��
		do{
			System.out.println("��������ĳ��ƺţ�");
		    Scanner inputNo=new Scanner(System.in);
		    String number=inputNo.next();
		    if((typeChoice==1 && number.equals(car.getLisencePlate()))||(typeChoice==2 && number.equals(bus.getLisencePlate()))){
			   System.out.println("�����ɹ���");
			   break;
		    }else{
			   System.out.println("���������ȷ�Ϻ��������룡");			   
			   count++;
		    }
		}while(count<3);
		if(!(count<3))
			System.out.println("��������Ƶ�������Ժ��ԣ�");
	}
	public static void main(String[] args) {
		Platform p=new Platform();
		p.welcome();
		p.businessSelect();
	}
}

