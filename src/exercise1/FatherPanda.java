package exercise1;

public class FatherPanda {

	public boolean isPredator;
    
    protected int weight;
    
    private int age;

    public void eat() {  
    
        System.out.println("After each meal, Father Panda gains weight: " + weight);
    
        System.out.println("And his age is: " + age);
    
    }
	public static void main(String[] args) {
		 FatherPanda father = new FatherPanda();
	        father.eat();
	}

}
