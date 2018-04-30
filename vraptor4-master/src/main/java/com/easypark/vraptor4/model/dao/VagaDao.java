package com.easypark.vraptor4.model.dao;



import org.hibernate.Session;

import com.easypark.vraptor4.model.entity.Vaga;

public class VagaDao {
	
    public void editar(Vaga v){
        Session util = HibernateUtil.getSessionFactory().getCurrentSession();
        util.beginTransaction();
        util.update(v);
        util.getTransaction().commit();
      
    }

}
