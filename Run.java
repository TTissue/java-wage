package wage;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) 
	{
		
		do{	
		System.out.println("������ְ����λ���˳���1.Ա��    2.����    3.�ɶ�    4.��ѯ���в��˳�");
		try{
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			if(t==1)			
			{
				System.out.println("��ѯ����ӣ�1.���    2.��ѯ");
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
				System.out.println("��ѯ����ӣ�1.���    2.��ѯ");
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
