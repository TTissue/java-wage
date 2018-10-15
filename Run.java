package wage;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) 
	{
		
		do{	
		System.out.println("请输入职工岗位或退出：1.员工    2.经理    3.股东    4.查询所有并退出");
		try{
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			if(t==1)			
			{
				System.out.println("查询或添加：1.添加    2.查询");
				Scanner sc=new Scanner(System.in);
				int d=sc.nextInt();
				Staff st=new Staff();
				if(d==1)
				{
					st.staffSalary();
				}
				else if(d==2)
				{
					st.read();
				}
			}
			else if(t==2)				
			{
				System.out.println("查询或添加：1.添加    2.查询");
				Scanner e=new Scanner(System.in);
				int f=e.nextInt();
				Manager ma=new Manager();
				if(f==1)
				{
					ma.managerSalary();
				}
				else if(f==2)
				{
					ma.read();	
				}
			}
			else if(t==3)				
			{
				Shareholder sh=new Shareholder();
				sh.dividend();	
			}
			else if(t==4)				
			{
				Company cp=new Company();
				cp.read();
				cp.delete();
				break;
			}
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}while(true);
	}
}
