import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=List.of(12,9,13,4,6,2,15);
		
		List<String> courses= List.of("Spring","Spring Boot","API","Microservices",
				"AWS","PCF","Azure","Docker","Kubernetes");
		
		courses.stream()
		.filter(course-> course.contains("Spring"))
		.forEach(System.out::println);

		System.out.println("*******************************************************");

		printAllnumbersinListFunctional(nums);
		
		System.out.println("*******************************************************");

		printEvennumbersinListFunctional(nums);

		System.out.println("*******************************************************");
		
		courses.stream()
		.filter(course->course.length()>=4)
		.forEach(System.out::println);
		
		System.out.println("*******************************************************");
		
		printSquarenumbersinListFunctional(nums);

		System.out.println("*******************************************************");

		printCubeOddnumbersinListFunctional(nums);
		
		System.out.println("*******************************************************");

		courses.stream().map(course-> course +" "+course.length()).forEach(System.out::println);
	}
	
	private static void print(int number)
	{
		System.out.println(number);
	}
	private static Boolean isEven(int number)
	{
		if(number%2==0)
		{return true;}
		return false;
		//System.out.println(number);
	}
	private static void printAllnumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out :: println); //method reference
		
	}
	
	private static void printEvennumbersinListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number ->number%2==0)//lambda exp
		.forEach(System.out :: println); //method reference
		
	}
	private static void printSquarenumbersinListFunctional(List<Integer> numbers)
	{
		numbers.stream()
		.map(x->x*x)
		.forEach(System.out::println);
	}

	private static void printCubeOddnumbersinListFunctional(List<Integer> numbers)
	{
		numbers.stream()
		.filter(num->num%2==1)
		.map(num->num*num*num)
		.forEach(System.out::println);
	}
	
	
}
