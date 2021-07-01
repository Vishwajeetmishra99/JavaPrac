
public abstract class AbstractPrac {
	
	private String name;
	private int age;
	
	public void setName(String n) {
		
		name=n;
	}
	public void setAge(int a) {
		
		age=a;
	}
	
	abstract void showName();    //abstract method has no body, its has only declaration
}

abstract class Subclasss extends AbstractPrac {
	//The class Subclasss will also be abstract since it is inheriting abstract method from the superclass
	abstract void showName();
}

class AbstractExample{
	
	public static void main(String[] args) {
		
	//	AbstractPrac prac=new AbstractPrac();    error  , abstract class cannot be instantiated
	
	//	AbstractPrac A1=new Subclasss(); // we can create reference variable of the abstract class
	
	}
	//Abstract class can only be used as a superclass for other classes that can extend them
}
