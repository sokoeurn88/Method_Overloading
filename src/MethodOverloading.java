
public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println(sum(2, 3));
		add(5.5, 10.5);
		System.out.println(sum(5, 5, 6));
		
		sayHi();
		System.out.println(sayHi("Chhay Sokoeurn"));
		

	}
	
	public static int sum(int x, int y) {
		return x + y;
	}
	
	public static void add (double i, double j) {
		System.out.println(i+j);
	}
	
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	public static String sayHi(String name) {
		return name;
	}
}
