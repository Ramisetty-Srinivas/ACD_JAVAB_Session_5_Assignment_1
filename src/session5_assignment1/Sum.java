package session5_assignment1;

/*
 * An abstract class is a class that is declared abstract —it may or may not include abstract methods. 
 * Abstract classes cannot be instantiated, but they can be subclassed. 
 * When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods 
 * in its parent class.
 */


/*
 * 1) Abstract class can also have regular(or concrete) methods along with abstract methods.
 * 2) Abstract methods do not have body, they just have prototype(method signature).
 * 3) Abstract methods must be implemented in the child class (if the class is not abstract) 
 * otherwise program will throw compilation error.
 */

public abstract class Sum {
	 //abstract methods
	 public abstract int SumOfTwo(int n1, int n2);
	 public abstract int SumOfThree(int n1, int n2, int n3);
	 //Regular method 
	 public void disp(){
	    System.out.println("Method of class Sum");
}
}
