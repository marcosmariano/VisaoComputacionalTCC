package com.easypark.vraptor4.model.repository;

import java.sql.SQLException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.easypark.vraptor4.model.dao.VagaDao;
import com.easypark.vraptor4.model.entity.Vaga;

@RequestScoped
public class VagaRepository {

    @Inject
    private Session session;

    private Criteria createCriteria() {
        return session.createCriteria(Vaga.class);
    }

    @SuppressWarnings("unchecked")
    public List<Vaga> list() {
        return createCriteria().list();
    }
    
    @SuppressWarnings("uncheked")
    public void update(Vaga v){
    	VagaDao vDao = new VagaDao();
    	vDao.editar(v);
    }
}