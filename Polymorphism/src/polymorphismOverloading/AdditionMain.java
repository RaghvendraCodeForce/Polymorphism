package polymorphismOverloading;

public class AdditionMain {

	public static void main(String[] args) {
		
		Addition sum1 = new Addition();
		System.out.println("Without any parameter :");
		sum1.Add();
		
		System.out.println("with parameter :");
		sum1.Add(12, 10);
		
	}
}
