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
		System.out.println("1 仓颉造字");
		System.out.println("2 地名有关");
		System.out.println("3 耳朵在此");
		System.out.println("4 见鸡而作");
		System.out.println("5 施氏食狮史");
		System.out.println("6 天心取米");
		System.out.println("7 有机可乘");
		System.out.println("8 醉翁之意不在酒");

		Scanner sc = new Scanner(System.in);
		String choice_3= sc.nextLine();
		
		switch (choice_3)
		{
			case"1":
			{
				File story=new File("data/Story", "仓颉造字.txt");
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
				File story=new File("data/Story", "地名有关.txt");
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
				File story=new File("data/Story", "耳朵在此.txt");
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
				File story=new File("data/Story", "见鸡而作.txt");
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
				File story=new File("data/Story", "施氏食狮史.txt");
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
				File story=new File("data/Story", "天心取米.txt");
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
				File story=new File("data/Story", "有机可乘.txt");
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
				File story=new File("data/Story", "醉酒之意不在翁.txt");
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
		System.out.println("1 返回主页面");
		System.out.println("2 返回故事目录");
		System.out.println("3 退出");
		int choice2=sc1.nextInt();
		if(choice2==1)
			return new MainPage();

		else if(choice2==2)
			return new StoryPage();
		else return null;
	}
}
