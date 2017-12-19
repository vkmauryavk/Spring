package vijay.spring.first.first_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import vijay.spring.first.first_spring.scope.PersonDao;

@SpringBootApplication
public class FirstSpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(FirstSpringScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(FirstSpringScopeApplication.class, args);

		PersonDao pd = applicationContext.getBean(PersonDao.class);
		PersonDao pd1 = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}", pd);
		LOGGER.info("{}", pd.getJdbcTemplet());

		LOGGER.info("{}", pd1);
		LOGGER.info("{}", pd.getJdbcTemplet());
	}
}
