package org.environment.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.environment.entities.Employee;

public class EmployeeHibernateDAOImpl extends HibernateDaoSupport implements
		EmployeeDAO {

	@Override
	public Long createEmployee(Employee emp) {
		getHibernateTemplate().persist(emp);
		return emp.getEmpId();
	}

	public Employee getEmployeeById(Long id) {
		return getHibernateTemplate().get(Employee.class, id);
	}
}
