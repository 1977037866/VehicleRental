import java.util.Scanner;

public class Platform {
	int typeChoice;
	int rentalTime;
	int bill;
	String isContinue=null;
    //关联关系
	private Car car=new Car();
	private Bus bus=new Bus();
	//欢迎语
	public void welcome(){
		System.out.println("\t\t-------------------------------");
	    System.out.println("\t\t|     欢迎来到**汽车租赁公司           |");
	    System.out.println("\t\t-------------------------------");
	}
	//选择需办理业务
	public void  businessSelect(){
		do{
			System.out.print("您要办理的业务是：1.租车   2.还车\t");
		    Scanner inputBusiness=new Scanner(System.in);
		    int business=inputBusiness.nextInt();
		    if(business==1){
			    pickUp();
		    }else{
		    	dropOff();
		    }
		    System.out.print("继续吗？（y/n）");
		    Scanner input=new Scanner(System.in);
		    isContinue=input.next();
		    System.out.println();
		}while(isContinue.equalsIgnoreCase("y"));
		System.out.println("欢迎下次惠顾！");
	}
	//租车
	public void pickUp(){
		//选择车型
		System.out.println("本店的车型有：1.car  2.bus");
		System.out.print("请选择您要租赁的车型：");
		Scanner inputType=new Scanner(System.in);
		typeChoice=inputType.nextInt();
		if(typeChoice==1){
			car.typeSelection();
		}else{
			bus.typeSelection();
		}
		//确定租车时间
		System.out.print("请输入您要租车的天数：");
		Scanner inputTime=new Scanner(System.in);
		rentalTime=inputTime.nextInt();
		//计算费用
		if(typeChoice==1){
		   bill=car.getPrice()*rentalTime;
		}else{
		   bill=bus.getPrice()*rentalTime;
		}
	    
		System.out.println("您需要支付的费用："+bill);
		System.out.println("租车成功，欢迎下次惠顾！");
	}
	//还车
	public void dropOff(){
		int count=0;
		//当用户输入错误且输入次数不大于3时，重复询问
		do{
			System.out.println("请输入你的车牌号：");
		    Scanner inputNo=new Scanner(System.in);
		    String number=inputNo.next();
		    if((typeChoice==1 && number.equals(car.getLisencePlate()))||(typeChoice==2 && number.equals(bus.getLisencePlate()))){
			   System.out.println("还车成功！");
			   break;
		    }else{
			   System.out.println("输入错误，请确认后重新输入！");			   
			   count++;
		    }
		}while(count<3);
		if(!(count<3))
			System.out.println("操作过于频繁，请稍后尝试！");
	}
	public static void main(String[] args) {
		Platform p=new Platform();
		p.welcome();
		p.businessSelect();
	}
}

