package p1;

public class Student {
	
	private String name;
	private int id;
	private int marks;
	private String course;  
	
	public int getId()
	{
		return id;
	}
	
	public void setNewCourse(String newCourse)
	{
		course = newCourse;
	}
	
	public void provideName(String studentName)
	{
		name = studentName;
	}
	
	public void setStudentInfo(String studentName,int studentId,int studentMarks,String courseName)
	{
		name = studentName;
		id = studentId;
		marks = studentMarks;
		course = courseName;
	}
	public void displayStudentInfo()
	{
		System.out.println("Name "+name);
		System.out.println("ID "+id);
		System.out.println("Marks "+marks);
		System.out.println("Course "+course);
		
		System.out.println("------------------------------------");
		
	}
	public void giveExam(int StudentMarks)
	{
		marks = StudentMarks;
	}
	
	
}
