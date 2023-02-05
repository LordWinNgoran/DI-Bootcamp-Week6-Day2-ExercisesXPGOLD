//Exercise 1 : Declaring Class Attributes
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: 
 * Date : 01/01/2023
 */

package exercise1;

public class FatherPanda {

	// 1 Declare a public boolean type variable and name it isPredator.
	public boolean isPredator;
	// 2 Declare a protected int type variable and name it weight.
	protected int weight;
	// 3 Declare a private int type variable and name it age.
	private int age;

	// 4 Declare a public void function, name it eat and print the following
	// statements
	public void eat() {

		// 5 After each meal, Father Panda gains weight: (print weight in front of it)
		System.out.println("After each meal, Father Panda gains weight: " + weight);
		// 6 And his age is: (print age in front of it)
		System.out.println("And his age is: " + age);

	}

	public static void main(String[] args) {
		FatherPanda father = new FatherPanda();
		father.eat();
	}

}
