//constructor chaining
class myclass
{
	int age;
	String name;
	myclass()
	{
	this("beginner book.com");
	}
	myclass(String s)
	{
	this(s,8);
	}

myclass(String s,int age)
{
this.name=s;
this.age=age;
}
public void display()
{
	System.out.println("name:" +name+" age:" +age);
}
public static void main(String[]args)
	{
	myclass obj=new myclass();
	obj.display();
	}
} 