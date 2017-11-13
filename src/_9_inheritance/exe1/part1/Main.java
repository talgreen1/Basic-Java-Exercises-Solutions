package _9_inheritance.exe1.part1;

/**
 * Define base class �Animal�. It will have the following members:
 * -String name
 * -String color
 * 
 * Add constructors, setters & getters.
 * 
 * Add the following methods:
 * -whoAmI � prints �I�m a generic Animal�
 * -makeSound � prints �? ? ? �
 * 
 * Define the class �Dog� that inherits from �Animal�.
 * Override the �whoAmI� & �makeSound� methods to print dog related texts.
 * 
 * Define the class �Cat� that inherits from �Animal�.
 * Override the �whoAmI� & �makeSound� methods to print cat related texts.
 * 
 * Create main that uses the classes. Use the getters & setters for dog & cat.
 * Use polymorphism: Create array of Animals and in each element add dog or cat.
 * 
 * @author Tal Green
 *
 */
public class Main
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Rexy", "Black");
		System.out.println(d.getColor()); // Dog have 'getColor' method - He got it from the base class Animal
		d.whoAmI();
		d.makeSound();
		
		System.out.println();
		
		Cat c = new Cat("Lady", "White");
		c.whoAmI();
		c.makeSound();
		
		Animal [] animals = new Animal[4];
		animals[0] = new Dog("Pez", "Brown");
		animals[1] = new Cat("Garfield", "Orange");
		animals[2] = new Dog("Dilan", "White");
		animals[3] = new Cat("Gilbert", "Gray");
		
		System.out.println();
		for (int i = 0; i < animals.length; i++)
		{
			animals[i].whoAmI();
			animals[i].makeSound();
			System.out.println("My name is " + animals[i].getName() + " and my color is: " + animals[i].getColor());
			System.out.println("---------------------");
		}
		
		
	}
}
