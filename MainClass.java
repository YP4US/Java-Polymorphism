//Name: Yogesh Pawar Date:31/08/2017
//To Elucidate Runtime Polymorphism

//SuperClass
class Animal
{
	void noice()
	{
		System.out.println("Animal can make noice....");
	}
}

//SubClass
class Cat extends Animal
{
	void noice()							//Method Overriding
	{
		System.out.println("Meau Meau");
	}
}

//SubClass
class Dog extends Animal
{
	void noice()							//Method Overriding
	{
		System.out.println("Bhau Bhau");
	}
}

//SubClass
class Rat extends Animal 
{
	void noice()							//Method Overriding
	{
		System.out.println("Chi chu");
	}
}

//SimulatingClass
class AnimalSimulator
{
	void animalNoice(Animal a1)			//Argument as SuperClass Type performing Implicit UpCasting
	{
	a1.noice();
	}
}

//MainClass
class MainClass
{
	public static void main(String arg[])
	{
		AnimalSimulator as=new AnimalSimulator();
		as.animalNoice(new Cat());
		as.animalNoice(new Dog());
		as.animalNoice(new Rat());
	}
}