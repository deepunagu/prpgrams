package basicsJava;
class InkPen
{
	void writing()
	{
		System.out.println("we use liqid ink here");
	}
}
class RenoldsblackPen extends InkPen
{
	void writing()
	{
		System.out.println("we use the rifil here");
	}
}
class classmateBluepen extends RenoldsblackPen
{
	void writing()
	{
		System.out.println("colour only changed means its blueink");
	}
}
class Student
{
	void examtime(InkPen ip)
	{
		ip.writing();
	}
}

public class PolyMorpism
{

public static void main(String[] args)
{
	Student s1=new Student();
	s1.examtime(new RenoldsblackPen());
	s1.examtime(new classmateBluepen());

	}
}
