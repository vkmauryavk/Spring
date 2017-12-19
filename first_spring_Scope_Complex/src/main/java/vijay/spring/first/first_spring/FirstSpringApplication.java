package vijay.spring.first.first_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import vijay.spring.first.first_spring.basic.BinarySearch;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {

		// BinarySearch bs = new BinarySearch(new QuickSortAlgo());

		int[] array = { 1, 5, 76, 3, 2 };

		ApplicationContext applicationContext = SpringApplication.run(FirstSpringApplication.class, args);

		BinarySearch bs = applicationContext.getBean(BinarySearch.class);
		BinarySearch bs1 = applicationContext.getBean(BinarySearch.class);

		System.out.println(bs);
		System.out.println(bs1);
		/*
		 * vijay.spring.first.first_spring.BinarySearch@3feb2dda
		 * vijay.spring.first.first_spring.BinarySearch@3feb2dda
		 *
		 * same out put will come because scope is singleton and both instance
		 * referencing single objects
		 */

		int result = bs.BinarySearchAlgo(array, 5);
		System.out.println(result);

		// result is come Like This becuase we write component at bubbleSort
		// vijay.spring.first.first_spring.BubbleSortAlgo@33ecda92
		// 3

	}
}
