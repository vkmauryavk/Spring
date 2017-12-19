package vijay.spring.first.first_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FirstSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(FirstSpringApplication.class, args);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstSpringApplication.class);

		BinarySearch bs = applicationContext.getBean(BinarySearch.class);

		int[] array = { 1, 5, 76, 3, 2 };
		int result = bs.BinarySearchAlgo(array, 5);

		System.out.println(result);

	}
}
