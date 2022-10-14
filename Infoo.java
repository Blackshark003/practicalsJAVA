interface Person
{
	abstract void display();
}

class Student implements Person
{
	private String name;
	private int age;
	private String PRN;
	private double cgpa;
	
	public Student(String name, int age, String PRN, double cgpa)
	{
		this.name=name;
		this.age=age;
		this.PRN=PRN;
		this.cgpa=cgpa;
	}
	public void display()
	{
		System.out.println("\nSTUDENT INFO");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("PRN    : "+PRN);
		System.out.println("Cgpa   : "+cgpa);
	}
}

class Employee implements Person
{
	private String name;
	private int age;
	private String ID;
	private int salary;
	
	public Employee(String name, int age, String ID, int salary)
	{
		
		this.name=name;
		this.age=age;
		this.ID=ID;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("\nEMPLOYEE INFO");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("ID     : "+ID);
		System.out.println("Salary : "+salary);
	}
}

class Infoo
{
	public static void main(String args[])
	{
		Person s=new Student("sakshi", 19, "20uai030",8.9);
		s.display();
		Person e=new Employee("JD",19,"Emp101",100000);
		e.display();
	}
}