package StoryModule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import beans.MainPage;
import beans.Page;

public class StoryPage extends Page 
{
	public Page execute() 
	{
		System.out.println("-----------Story-----------");
		System.out.println("1 �������");
		System.out.println("2 �����й�");
		System.out.println("3 �����ڴ�");
		System.out.println("4 ��������");
		System.out.println("5 ʩ��ʳʨʷ");
		System.out.println("6 ����ȡ��");
		System.out.println("7 �л��ɳ�");
		System.out.println("8 ����֮�ⲻ�ھ�");

		Scanner sc = new Scanner(System.in);
		String choice_3= sc.nextLine();
		
		switch (choice_3)
		{
			case"1":
			{
				File story=new File("data/Story", "�������.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine()) != null ) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"2":
			{
				File story=new File("data/Story", "�����й�.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"3":
			{
				File story=new File("data/Story", "�����ڴ�.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"4":
			{
				File story=new File("data/Story", "��������.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"5":
			{
				File story=new File("data/Story", "ʩ��ʳʨʷ.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"6":
			{
				File story=new File("data/Story", "����ȡ��.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"7":{
				File story=new File("data/Story", "�л��ɳ�.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			case"8":
			{
				File story=new File("data/Story", "���֮�ⲻ����.txt");
				String line=null;
				try (BufferedReader r = new BufferedReader(new FileReader(story));)
						{
						       	while ((line = r.readLine())!=null) 
						       	{
										System.out.println(line);
								}
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				break;
			}
			
		}
		Scanner sc1=new Scanner(System.in);
		System.out.println("1 ������ҳ��");
		System.out.println("2 ���ع���Ŀ¼");
		System.out.println("3 �˳�");
		int choice2=sc1.nextInt();
		if(choice2==1)
			return new MainPage();

		else if(choice2==2)
			return new StoryPage();
		else return null;
	}
}
