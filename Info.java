abstract class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getname()
	{
		return this.name;
	}
	
	public int getage()
	{
		return this.age;
	}
	
	abstract void display();
}

class Student extends Person
{
	private String PRN;
	private double cgpa;
	
	public Student(String name, int age, String PRN, double cgpa)
	{
		super(name,age);
		this.PRN=PRN;
		this.cgpa=cgpa;
	}
	void display()
	{
		System.out.println("\nSTUDENT INFO");
		System.out.println("Name   : "+getname());
		System.out.println("Age    : "+getage());
		System.out.println("PRN    : "+PRN);
		System.out.println("Cgpa   : "+cgpa);
	}
}

class Employee extends Person
{
	private String ID;
	private int salary;
	
	public Employee(String name, int age, String ID, int salary)
	{
		super(name,age);
		this.ID=ID;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("\nEMPLOYEE INFO");
		System.out.println("Name   : "+getname());
		System.out.println("Age    : "+getage());
		System.out.println("ID     : "+ID);
		System.out.println("Salary : "+salary);
	}
}

class Info
{
	public static void main(String args[])
	{
		Person s=new Student("sakshi", 19, "20uai030",8.9);
		s.display();
		Person e=new Employee("JD",19,"Emp101",100000);
		e.display();
	}
}