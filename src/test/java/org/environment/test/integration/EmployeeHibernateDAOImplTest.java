package org.environment.test.integration;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.environment.dao.EmployeeDAO;
import org.environment.entities.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:environment-application-config.xml")
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class EmployeeHibernateDAOImplTest {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Test
	public void testGetEmployeeById() {
		Employee emp = employeeDAO.getEmployeeById(1L);
		assertNotNull(emp);
	}

	@Test
	public void testCreateEmployee() {
		Employee emp = new Employee();
		emp.setName("Emp123");
		Long key = employeeDAO.createEmployee(emp);

		assertEquals(2L, key.longValue());
	}

}
