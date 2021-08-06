//constructor chaining
class a
{
	public a()
	{
	System.out.println("a 1");
	}
}
class b extends a
{
	public b()
	{
		this(4);
	System.out.println("b 1");
	}
	public b(int k)
	{
		System.out.println("b 2");
	}
}
public class example
{
 public static void main(String[]args)
	{	
      b obj=new b();
	}

} 