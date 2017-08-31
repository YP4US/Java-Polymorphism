//Name: Yogesh Pawar Date:31/08/2017
//To elucidate concept of abstract method and how to provide it's implimentation
abstract class Animal
{
	abstract void test();	//abstract method with no implimentation/defination
	abstract void disp();   //abstract method with no implimentation/defination
}

//Implimentation Class
abstract class Demo1 extends Animal
{
	/*As Classes are inherited therefore Properties of Animal Class can be used in this class and we provided implimentation for one method
	 of abstract class by overriding and another one is remaining thats why we need to specify implimentation for remaining class or declare
	  class with abstract keyword */
	void test()
	{
		System.out.println("Running test() in Demo1...");
	}
}

class Demo2 extends Demo1
{
	/*Implimentation for all abstract method is provided therefor no need to specify class as abstract class*/
	void disp()
	{
		System.out.println("Running Disp() in Demo2...");
	}
}

class MainClass1
{
	public static void main(String arg[])
	{
		Demo2 d2=new Demo2();
		d2.test();
		d2.disp();
	}
}
