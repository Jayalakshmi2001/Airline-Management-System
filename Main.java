package ams;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		String admin_name="abcd";
		String admin_pwd="1234@abcd";
		boolean loop=true;
		while(loop)
		{
			System.out.println("**************************************************");
			System.out.println("       WELCOME TO AIRLINE MANAGEMENT SYSTEM       ");
			System.out.println("**************************************************");
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.Exit");
			int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
		{
			System.out.println("Enter Admin name:");
			String name=sc.next();
			System.out.println("Enter your password:");
			String pwd=sc.next();
			if(name.equals(admin_name) && pwd.equals(admin_pwd))
			{
				boolean loop_1=true;
				while(loop_1)
				{
				System.out.println("1.Add Flight Details");
				System.out.println("2.View Flight Details");
				System.out.println("3.Remove Flight Details");
				System.out.println("4.Edit Flight Details");
				System.out.println("5.Exit");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.println("**************************************************");
					
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					break;
				}
				case 4:
				{
					break;
				}
				case 5:
				{
					loop_1=false;
					System.out.println("Thank you");
					break;
				}
				}
				}
			}
			else
			{
				System.out.println("Please enter appropriate admin name and password");
			}
			break;
		}
		
		case 2:
		{
			boolean loop_2=true;
			while(loop_2)
			{
			System.out.println("1.Search Flight Details");
			System.out.println("2.Book Flight Details");
			System.out.println("3.view Flight Details");
			System.out.println("4.Cancel Flight Details");
			System.out.println("5.Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("**************************************************");
				
				break;
			}
			case 2:
			{
				break;
			}
			case 3:
			{
				break;
			}
			case 4:
			{
				break;
			}
			case 5:
			{
				loop_2=false;
				System.out.println("Thank you");
				break;
			}
			}
			
			}
			break;
		}
		
		case 3:
		{
			loop=false;
			System.out.println("Thank you Visit Again");

		}
		}
		}
	}

}
