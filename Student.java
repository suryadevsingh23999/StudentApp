class Student
{
	String name;
	int age;
	String gender;
	int usn;
	void eat()
	{
		System.out.println("Student is eating");
	}
	void sleep()
	{
		System.out.println("Student is sleeping");
	}
	void Studentstudy()
	{
		System.out.println("Student is studying");
	}
}
class StudentApp
{
	public static void main(String[]args) 
	{
		Student S1 = new Student();
		Student S2 = new Student();
		Student S3 = new Student();
		S1.eat();
		S2.sleep();
		S3.Studentstudy();
		S1.name="Anny";
		S1.age=21;
		S1.gender="female";
		S1.usn=437;
		System.out.println("Name of Student S1 is"+S1.name);
		System.out.println("Age of Student S1 is"+S1.age);
		System.out.println("Gender of Student S1 is"+S1.gender);
		System.out.println("USN of Student S1 is"+" "+S1.usn);
		S2.name="James";
		S2.age=24;
		S2.gender="male";
		S2.usn=789;
		System.out.println("Name of Student S2 is"+S2.name);
		System.out.println("Age of Student S2 is"+S2.age);
		System.out.println("Gender of Student S2 is"+S2.gender);
		System.out.println("USN of Student S2 is"+" "+S2.usn);
		S3.name="Taylor";
		S3.age=31;
		S3.gender="male";
		S3.usn=564;
		System.out.println("Name of Student S3 is"+S3.name);
		System.out.println("Age of Student S3 is"+S3.age);
		System.out.println("Gender of Student S3 is"+S3.gender);
		System.out.println("USN of Student S3 is"+" "+S3.usn);
	}
}

