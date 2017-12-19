package vijay.spring.first.first_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApplication {
	// private static Logger LOGGER =
	// LoggerFactory.getLogger(FirstSpringApplication.class);

	public static void main(String[] args) {
		// SpringApplication.run(FirstSpringApplication.class, args);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// LOGGER.info("Beans Load -> {} ", (Object)
		// applicationContext.getBeanDefinitionNames());

		BinarySearch bs = applicationContext.getBean(BinarySearch.class);

		int[] array = { 1, 5, 76, 3, 2 };
		int result = bs.BinarySearchAlgo(array, 5);

		System.out.println(result);

	}
}
