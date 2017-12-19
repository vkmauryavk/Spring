package vijay.spring.first.first_spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {

	@Autowired
	JDBCTemplet jdbcTemplet;

	public JDBCTemplet getJdbcTemplet() {
		return jdbcTemplet;
	}

	public void setJdbcTemplet(JDBCTemplet jdbcTemplet) {
		this.jdbcTemplet = jdbcTemplet;
	}

}
