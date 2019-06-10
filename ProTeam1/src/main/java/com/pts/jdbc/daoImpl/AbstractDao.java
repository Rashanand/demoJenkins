package com.pts.jdbc.daoImpl;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao {
	/*@Autowired
	private SessionFactory sessionFactory;*/
	@Autowired
	private EntityManager entityManager;
	
	/*protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}*/
	
	protected Session getEntityManagerSession() {
		return (Session) entityManager.getDelegate();
	}
	
	public void persist(Object entity) {
		getEntityManagerSession().persist(entity);
	}
	
	public void delete(Object entity) {
		getEntityManagerSession().delete(entity);
	}
}
