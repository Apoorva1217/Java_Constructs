package com.addressbook;
import java.util.Scanner;
class Information
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private long mobileNo;
		
	public String getfirstName()
	{
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlasttName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getaddress()
	{
		return address;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getcity()
	{
		return city;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getstate()
	{
		return state;
	}
	public void setstate(String state)
	{
		this.state=state;
	}
	public int getzipcode()
	{
		return zipcode;
	}
	public void setzipcode(int zipcode)
	{
		this.zipcode=zipcode;
	}
	public long getmobileNo()
	{
		return mobileNo;
	}
	public void setmobileNo(long mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public Information(String firstName, String lastName, String address, String city, String state, int zipcode, long mobileNo)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		this.mobileNo=mobileNo;
	}
	public String toString()
	{
		return "First Name:"+firstName+"\tLast Name:"+lastName+"\tAddress:"+address+"\tCity:"+city+"\tState:"+state+"\tZipcode:"+zipcode+"\tMobile No:"+mobileNo;
	}
}	

public class AddressBook 
{
	public static void main(String[] args) 
	{
		 String firstName;
		 String lastName;
		 String address = null;
		 String city = null;
		 String state = null;
		 int zipcode = 0;
		 long mobileNo = 0;
		 int count=0;
		 Scanner sc=new Scanner(System.in);
		 
		 Information a[]=new Information[20];
		 while (true)
		 {
			 System.out.println("Select an Option!");
			 System.out.println("1. Add an Entry");
			 System.out.println("2. Edit an Entry");
			 System.out.println("3. Delete an Entry");
			 System.out.println("4. View all Entries");
			 System.out.println("5. Exit");
			 System.out.println("Enter the Choice:");
			 int ch=sc.nextInt();
	  	  	 switch(ch)
	    		 {
	     			case 1:
	     				System.out.println("Enter number of entries:");
	     				int n=sc.nextInt();
	     				for(int i=0;i<n;i++)
	     				{
	     					System.out.println("Enter the First Name:");
	     					firstName=sc.next();
	     					System.out.println("Enter the Last Name:");
	     					lastName=sc.next();
	     					System.out.println("Enter Address:");
	     					address=sc.next();
	     					System.out.println("Enter City:");
	     					city=sc.next();
	     					System.out.println("Enter State:");
	     					state=sc.next();
	     					System.out.println("Enter Zipcode:");
	     					zipcode=sc.nextInt();
	     					System.out.println("Enter Mobile No:");
	     					mobileNo=sc.nextLong();
	     					a[count]=new Information(firstName,lastName,address,city,state,zipcode,mobileNo);
	     					count++;
	     				}
	     				System.out.println("Entries are Added...\n");
	     				break;
	     			case 2:
     					System.out.println("Enter Mobile No:");
     					mobileNo=sc.nextLong();
	     				for(int i=0;i<count;i++)
	     				{
	     					if(a[i].getmobileNo()==mobileNo)
	     					{
	     						System.out.println("Enter the Address:");
	     						address=sc.next();
	     						a[i].setaddress(address);
	     						System.out.println("Enter the City:");
	     						city=sc.next();
	     						a[i].setcity(city);
	     						System.out.println("Enter the State:");
	     						state=sc.next();
	     						a[i].setstate(state);
	     						System.out.println("Enter the Zipcode:");
	     						zipcode=sc.nextInt();
	     						a[i].setzipcode(zipcode);
	     						System.out.println("Enter the Mobile No:");
	     						mobileNo=sc.nextLong();
	     						a[i].setmobileNo(mobileNo);
	     					}
	     				}
	     				System.out.println("Entries are Updated...\n");
	     				break;
	     			case 3:
	     				System.out.println("Enter Mobile No:");
     					mobileNo=sc.nextLong();
	     				for(int i=0;i<count;i++)
	     				{
	     					if(a[i].getmobileNo()==mobileNo)
	     					{
	     						a[i]=null;
	     					}
	     				}
	     				System.out.println("Entry is Deleted...");
	     				break;
	     			case 4:
	     				for(int i=0;i<count;i++)
	     				{
	     					System.out.println(a[i]);
	     				}
	     				System.out.println("\n");
	     				break;
	     			case 5:
	     				System.exit(0);
	     			default:
	     				System.out.println("Invalid Input!\n");
	    		 }
		 }
	}
}
