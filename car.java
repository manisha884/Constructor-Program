enum car
{
	lamborgini(900),tata(2),audi(50.56),flat(15),honda(12);
	private double price;
	car(double price){
	this.price =price;
	}
	private double price(){
	return price;
	}

public static void main(String args[])
{
System.out.println("all car prices:");
for(car c:car.values())

System.out.println(c.price);

}

} 