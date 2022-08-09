package com.banca.dao;

import com.banca.model.ContoCorrente;

public interface ContoCorrenteDAO {
	
	public void insert(ContoCorrente cc);
	public void update(ContoCorrente cc);
	public void delete(int id);
	public ContoCorrente findById(int id);
	public void prelievo();
	public void versamento();
	

}
