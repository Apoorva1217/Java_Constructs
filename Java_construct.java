package com.bridgeit;

//Encapsulation 
class Employee 
{
	private String firstName;
	private int id;
	private String bankName;
	//Getter methods
	public String getfirstName()
	{
		return firstName;
	}
	public int getid()
	{
		return id;
	}
	public String getbankName()
	{
		return bankName;
	}
	//Setter methods
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setbankName(String bankName)
	{
		this.bankName=bankName;
	}
}

//Abstraction
abstract class Vehicle 
{
	//abstract methods
	public abstract void speed();
	public abstract void color();
	//concrete method
	void detail()
	{
		System.out.println("Vehicle Details:");
	}
}
class Bmw extends Vehicle
{
	public void speed()
	{
		System.out.println("Speed=100kmpr");
	}
	public void color()
	{
		System.out.println("Color=Red");
	}
}

//Inheritance
class Teacher 
{
	public void salary() 
	{
		System.out.println("Salary of Teacher:40000");
	}
}
class Programmer extends Teacher 
{
	@Override
	public void salary() 
	{
		System.out.println("Salary of Programmer:50000");
	}
}

//Multilevel inheritance
class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class Cat extends Dog
{
	void sleep()
	{
		System.out.println("Sleeping...");
	}
}

//Interface
interface Drawable
{
	void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("It is Rectangle");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("It is Circle");
	}
}

//Multiple inheritance
interface printable
{
	void print();
}
interface showable
{
	void print();
}
class Display implements printable,showable
{
	public void print()
	{
		System.out.println("Programming...Done!");
	}
}

//Constructor
class Addition
{
	public  int Addition(int x, int y) 
	{
		return x+y;
	}
	//Overload
	public double Addition(double x,double y) 
	{
		return x+y;
	}
}

//Main method
class Java_construct
{
	public static void main(String[] args) 
	{
		System.out.println("-----Encapsulation-----");
		Employee emp = new Employee();
		emp.setfirstName("Apoorva");
		emp.setid(101);
		emp.setbankName("Axis");
		System.out.println("First Name: " +emp.getfirstName());
		System.out.println("ID: " +emp.getid());
		System.out.println("Bank Name: " +emp.getbankName());
		System.out.println(emp.getfirstName()+ " is employee of " +emp.getbankName()+"."); //Association
		System.out.println("-----Abstraction-----");
		Vehicle v = new Bmw(); //upcasting
		v.detail();
		v.speed();
		v.color();
		System.out.println("-----Inheritance-----");
		Teacher t=new Teacher();
		t.salary();
		Programmer p=new Programmer();
		p.salary();
		System.out.println("-----Multilevel Inheritance-----");
		Cat c=new Cat();
		c.sleep();
		c.bark();
		c.eat();
		System.out.println("-----Interface-----");
		Drawable d=new Rectangle();
		d.draw();
		Drawable dr=new Circle();
		dr.draw();
		System.out.println("-----Multiple Inheritance-----");
		Display disp=new Display();
		disp.print();
		System.out.println("-----Constructor-----");
		Addition add=new Addition();
		System.out.println("Value of integers="+add.Addition(4,2));
		System.out.println("Value of double="+add.Addition(0.5,0.5)); //polymorphism	
	}
}
