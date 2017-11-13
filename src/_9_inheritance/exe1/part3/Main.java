package _9_inheritance.exe1.part3;

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
 * Part 2:
 * Change the �whoAmI� method of the last exercise to be �toString�.
 * 
 * Do it in all the classes.
 * 
 * In the Main class � use it in order to print the instances.
 * 
 * Part 3: 
 * For the �Cat� class - Add new method �climbOnTree()� that prints �<cat name> climbing on tree�.
 * 
 * For the �Dog� class � Add new method �playDead()� that prints �<dog name> is dead now�.
 * 
 * 
 * Create a zoo: Create an array of animals, and for each element assign different animal (dog or cat).
 * 
 * Print the name of all the animals in the zoo. In addition:
 * If the animal is cat � make it climb a tree.
 * If the animal is dog � make it play dead.
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
		System.out.println(d);
		d.makeSound();

		System.out.println();

		Cat c = new Cat("Lady", "White");
		System.out.println(c);
		c.makeSound();

		Animal[] animals = new Animal[4];
		animals[0] = new Dog("Pez", "Brown");
		animals[1] = new Cat("Garfield", "Orange");
		animals[2] = new Dog("Dilan", "White");
		animals[3] = new Cat("Gilbert", "Gray");

		System.out.println();
		for (int i = 0; i < animals.length; i++)
		{
			Animal curr = animals[i];
			System.out.println(curr);
			curr.makeSound();
			if (curr instanceof Cat)
				((Cat)curr).climbOnTree();
			
			if (curr instanceof Dog)
				((Dog)curr).playDead();
			
			System.out.println("---------------------------------");
		}

	}
}
