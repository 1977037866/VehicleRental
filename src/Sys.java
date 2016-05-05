import java.util.Scanner;

public class Sys {
	int rentalNo;
	//存储租车信息
	String[] name;
	String[] lisence;
    int[] day;
    double[] fee;
	//欢迎语
	public void welcome(){
		System.out.println("\t\t-------------------------------");
	    System.out.println("\t\t|     欢迎来到**汽车租赁公司           |");
	    System.out.println("\t\t-------------------------------");
	}
	//选择需办理业务
	public void  businessSelect(){
		String isContinue=null;
		do{
			System.out.print("您要办理的业务是：1.租车   2.还车\t");
		    Scanner inputBusiness = new Scanner(System.in);
		    int a = inputBusiness.nextInt();
		    if(a == 1){
			    pickUp();
		    }else{
		    	dropOff();
		    }
		    System.out.print("继续吗？（y/n）");
		    Scanner b=new Scanner(System.in);
		    isContinue=b.next();
		    System.out.println();
		}while(isContinue.equalsIgnoreCase("y"));
		System.out.println("欢迎下次惠顾！");
	}
	//租车
	public void pickUp(){
		//car or bus
		String[] ct={"别克商务","宝马","别克林荫大道"};
		String[] cl={"鲁B.11111","鲁B.22222","鲁B.33333"};
		String[] bt={"公交(seats<=16)","公交(seats>16)"};
		String[] bl={"鲁B.44444","鲁B.55555"};

		//询问租车数，创建多个同样大小的数组存储租车数据
 		System.out.print("租车数量为(<=5)：");
 		Scanner c=new Scanner(System.in);
 		rentalNo=c.nextInt();
 		name=new String[rentalNo];
 		lisence=new String[rentalNo];
 	    day=new int[rentalNo];
 	    fee=new double[rentalNo];
 	    
 		for (int i = 0; i < rentalNo; i++) {
 			System.out.println("第"+(i+1)+"辆");
			System.out.println("本店的车型有：1.car  2.bus");
			System.out.print("请选择您要租赁的车型：");
			Scanner d=new Scanner(System.in);
		    int typeChoice=d.nextInt();
		    if(typeChoice==1){
			   System.out.print("可供选择的车:  1.别克商务  2.宝马  3.别克林荫大道\t");
			   Scanner inputCar=new Scanner(System.in);
			   int x=inputCar.nextInt();
			   Moto moto_1=new Car(cl[x-1],ct[x-1]);  //多态,
			   //Car car=(Car)moto_1;      //向下转型（强类型转换）,可用但不建议使用
			   System.out.println("租车时间为：");
			   Scanner inputDay=new Scanner(System.in);
			   name[i]=ct[x-1];
			   lisence[i]=moto_1.getLisencePlate();
			   day[i]=inputDay.nextInt();
			   fee[i]=moto_1.billCalculator(day[i]);
		    }else{
			   System.out.println("可供选择的车:  1.<=16座     2.>16座 \t");
			   Scanner inputBus=new Scanner(System.in);
			   int y=inputBus.nextInt();
			   Moto moto_2=new Bus(bl[y-1],bt[y-1]);
			   System.out.println("租车时间为：");
			   Scanner inputDay=new Scanner(System.in);
			   name[i]=bt[y-1];
			   lisence[i]=moto_2.getLisencePlate();
			   day[i]=inputDay.nextInt();
			   fee[i]=moto_2.billCalculator(day[i]);
		    }
		}
		//核对信息
		System.out.println("租车信息如下，请核实"); 
		System.out.println("\t车型\t\t车牌\t\t租用天数\t\t费用");
		double totalFee=0;
		for (int i = 0; i < rentalNo; i++) {
			System.out.println("\t"+name[i]+"\t\t"+lisence[i]+"\t"+day[i]+"\t\t"+fee[i]);
			totalFee += fee[i];
		}
		System.out.println("您所需支付金额为："+totalFee);
	}
	//还车
	public void dropOff(){
		int count=0;
		//当用户输入错误且输入次数不大于3时，重复询问
		do{
			System.out.println("请输入你的车牌号：");
		    Scanner inputNo=new Scanner(System.in);
		    String number=inputNo.next();
		    for (int i = 0; i < rentalNo; i++) {
				if(number==lisence[i]){
					 System.out.println("还车成功！");
			         break;
		        }else{
		        	 System.out.println("输入错误，请确认后重新输入！");			   
			         count++;
		        }
			}
		}while(count<3);
		if(!(count<3))
			System.out.println("操作过于频繁，请稍后尝试！");
	}
	public static void main(String[] args) {
		Sys sys=new Sys();
		sys.welcome();
		sys.businessSelect();
	}
}
