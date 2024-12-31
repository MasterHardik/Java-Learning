class Student{
    Student(){
        System.out.println("finally in default contructor");
    }
    
    Student(String name,int n){
        this(name);
    }
    
    Student(String name){
        this();
    }
}

public class ConstructorChaining
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Student st = new Student("std1", 11);
	}
}
