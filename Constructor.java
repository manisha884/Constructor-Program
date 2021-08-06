class constructor
{
	String name;
	int id;
	double salary;

	constructor(String name,int id,double salary)
	{
	 this.name=name;
	 this.id=id;
	 this.salary=salary;
	}
	public static void main(String[]args)
	{
	constructor obj=new constructor("manisha",101,20000);
	constructor obj1=new constructor("karan",111,25000);
	constructor obj2=new constructor("tom",105,21000);
	System.out.println("employee name"+"                 employee id"+"                 employee salary");
	System.out.println("--------------------------------------------------------------------------------------");

	System.out.println("employee name:"+obj.name+"       employee id: "+obj.id+"        employee salary"+obj.salary);
	System.out.println("employee name:"+obj1.name+"       employee id: "+obj1.id+"        employee salary"+obj1.salary);
	System.out.println("employee name:"+obj2.name+"          employee id: "+obj2.id+"         employee salary"+obj2.salary);



	}

}