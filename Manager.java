package wage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Manager extends Company{
	int[] bonus=new int[12];
	int bonusAll=0;
	public int bonus()
	{
		for(int i:bonus)
		{
			bonusAll=bonusAll+i;
		}
		return bonusAll;
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
		
		System.out.println("������Ҫ��ѯ�ľ���������");
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		
		String d="@"+c;
		if(str.contains(str))		
		{
		String t=str.substring(str.indexOf(c), str.indexOf(d));
		System.out.println(t.toString()+"\n");
		}
		else
			System.out.println("�����ֲ����ڣ�");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	void managerSalary()					
	{

		try {
			FileWriter fw=new FileWriter(file,true);		
			BufferedWriter bf=new BufferedWriter(fw);

		System.out.println("��������Ӿ������֣�");
		Scanner a=new Scanner(System.in);
		String str=a.nextLine();
		bf.write("����������"+str);
		bf.newLine();							

		System.out.println("���������գ�");
		Scanner c=new Scanner(System.in);
		String s=c.nextLine();
		bf.write("����Ϊ��"+s);						
		bf.newLine();
		
		String s1=s.substring(0, 4);
		String s2=s.substring(4, 6);
		String s3=s.substring(6, 8);
		int year=Integer.parseInt(s1);
		int month=Integer.parseInt(s2);
		int day=Integer.parseInt(s3);
		
		System.out.println("������Ҫ�����ʵ����");
		Scanner e=new Scanner(System.in);
		String f=e.nextLine();
		int year2=Integer.parseInt(f);		
	
		for(int i=year2;i<2020;i++)
		{
			System.out.println(i+"��Ĺ������£�");
			bf.write(i+"��Ĺ���Ϊ��");
			bf.newLine();
			
			for(int j=0;j<12;j++)
			{
				this.wage[j]=(int)(6000+Math.random()*3000);
			}
			for(int j=0;j<12;j++)
			{
				bonus[j]=(int)(Math.random()*200);
				System.out.println((j+1)+"�µĹ���Ϊ��"+this.wage[j]+"    ����Ϊ��"+bonus[j]);
				bf.write((j+1)+"�µĹ���Ϊ��"+this.wage[j]+"    "+"����Ϊ��"+bonus[j]);					
				bf.newLine();
			}
			int t=bonus();
			int t2=wage();
			int t3=(int)(100+Math.random()*200);
			System.out.println(i+"����ܽ���Ϊ��"+t);
			bf.write(i+"����ܽ���Ϊ��"+t);
			bf.newLine();
			System.out.println(i+"������ս���Ϊ��"+t3);
			bf.write(i+"������ս���Ϊ��"+t3);				
			System.out.println(i+"����ܹ���Ϊ��"+(t+t2+t3));
			bf.newLine();
			bf.write(i+"����ܹ���Ϊ��"+(t+t2+t3));
			bf.newLine();
			
			list.add(this);
			
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
			bf.write("@"+str+"          ");
			bf.newLine();
			bf.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
