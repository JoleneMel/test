
public class Application {
	public static boolean isFizz(int numToEvaluate) {
		return (numToEvaluate % 3 == 0);
	}
	
	public static boolean isBuzz(int numToEvaluate) {
		return (numToEvaluate % 5 == 0);
	}
	 public static boolean isEven(int number) {
		 return(number % 2 == 0);
	 }
	 public static boolean isOdd(int number) {
		 //return(number % 2 !== 0);
		 return ( ! isEven(number));
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 50; i++) {
//			if (i % 15 == 0) {
//				System.out.println("FizzBuzz");
//			}else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
		
		for (int i = 1; i <= 50; i++) {
			if (isFizz(i) && isBuzz(i)) {
				System.out.println("FizzBuzz");
			}else if (isFizz(i)) {
				System.out.println("Fizz");
			} else if (isBuzz(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
