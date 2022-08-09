package com.banca.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.banca.dao.ContoCorrenteDAO;
import com.banca.model.ContoCorrente;
import com.banca.util.JpaUtil;

public class ContoCorrenteDAOImpl implements ContoCorrenteDAO {
	
	EntityManager em;

	public void insert(ContoCorrente cc) {
		System.out.println("insert");
		em = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		try {
			entityTransaction.begin();
			em.persist(cc);
			entityTransaction.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
			entityTransaction.rollback();

		} finally {
			em.close();
		}
		
	}

	public void update(ContoCorrente cc) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public ContoCorrente findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void prelievo() {
		// TODO Auto-generated method stub
		
	}

	public void versamento() {
		// TODO Auto-generated method stub
		
	}

}
