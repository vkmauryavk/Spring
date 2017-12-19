package vijay.spring.first.first_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {

		// BinarySearch bs = new BinarySearch(new QuickSortAlgo());

		int[] array = { 1, 5, 76, 3, 2 };

		ApplicationContext applicationContext = SpringApplication.run(FirstSpringApplication.class, args);

		BinarySearch bs = applicationContext.getBean(BinarySearch.class);

		int result = bs.BinarySearchAlgo(array, 5);
		System.out.println(result);

		// result is come Like This becuase we write component at bubbleSort
		// vijay.spring.first.first_spring.BubbleSortAlgo@33ecda92
		// 3

	}
}
