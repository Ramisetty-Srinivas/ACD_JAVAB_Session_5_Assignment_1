package session5_assignment1;

public class AbstractDemo extends Sum {
	   public int SumOfTwo(int num1, int num2){
		return num1+num2;
	   }
	   public int SumOfThree(int num1, int num2, int num3){
		return num1+num2+num3;
	   }
	   public static void main(String args[]){
	      AbstractDemo obj = new AbstractDemo();
	      System.out.println(obj.SumOfTwo(3, 7));
	      System.out.println(obj.SumOfThree(4, 3, 19));
	      obj.disp();
	   }
}
