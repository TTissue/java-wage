package wage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Staff extends Company  {
	static int giftSum=0;
	int [] gift=new int[10];

	public int gift()
	{
		for(int i:gift)
		{
			giftSum=giftSum+i;
		}
		return giftSum;
	}
	
	
	
	void staffSalary()								
	{
		int GIFT=0;
		try {
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bf=new BufferedWriter(fw);

		System.out.println("请输入添加员工名字：");
		Scanner a=new Scanner(System.in);
		String str=a.nextLine();
		bf.write("员工姓名："+str);
		bf.newLine();					

		System.out.println("请输入生日：");
		Scanner c=new Scanner(System.in);
		String s=c.nextLine();
		bf.write("生日为："+s);		
		bf.newLine();
		
		String s1=s.substring(0, 4);
		String s2=s.substring(4, 6);
		String s3=s.substring(6, 8);
		int year=Integer.parseInt(s1);
		int month=Integer.parseInt(s2);
		int day=Integer.parseInt(s3);
	
		System.out.println("请输入要发工资的年份：YYYY");
		Scanner e=new Scanner(System.in);
		String f=e.nextLine();
		final int year2=Integer.parseInt(f);		
		for(int i=year2;i<2020;i++)
		{
			System.out.println(i+"年的工资如下：");
			bf.write(i+"年的工资为：");
			bf.newLine();
			
			for(int j=0;j<12;j++)
			{
				this.wage[j]=(int)(2000+Math.random()*2000);
			}
			for(int j=0;j<12;j++)
			{
				if((j+1)==month)
				{
					gift[GIFT]=(int)(Math.random()*200);
				
				}
				System.out.println((j+1)+"月的工资为："+this.wage[j]);
				bf.write((j+1)+"月的工资为："+this.wage[j]);					
				bf.newLine();
			}
			System.out.println(i+"年的生日礼物为："+gift[GIFT]);
			bf.write(i+"年的生日礼物为："+gift[GIFT]);						
			bf.newLine();
			GIFT++;
			int t=this.wage();
			int t2=this.gift();
			System.out.println(i+"年的总工资为："+(t+t2));
			bf.write(i+"年的总工资为："+(t+t2));
			bf.newLine();
			
			list.add(this);									
			
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
		}
		bf.write("#"+str+"        ");					
		bf.newLine();
		bf.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
void read()		
	{
		try {
			StringBuilder result=new StringBuilder();
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			while((s=br.readLine())!=null)
			{
				result.append(System.lineSeparator()+s);
			}
			String str=result.toString();			
			
			System.out.println("请输入要查询的员工姓名：");
			Scanner sc=new Scanner(System.in);
			String c=sc.nextLine();
			
			String d="#"+c;
			if(str.contains(c))		
			{
			String t=str.substring(str.indexOf(c), str.indexOf(d));
			System.out.println(t.toString()+"\n");
			}
			else
				System.out.println("该名字不存在！");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}