package vijay.spring.first.first_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FirstSpringApplication.class, args);

		BinarySearch bs = new BinarySearch(new QuickSortAlgo());

		int[] array = { 1, 5, 76, 3, 2 };
		int result = bs.BinarySearchAlgo(array, 5);
		System.out.println(result);

	}
}
