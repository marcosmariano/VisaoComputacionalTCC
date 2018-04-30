package com.easypark.vraptor4.controller;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;

import com.easypark.vraptor4.model.dao.VagaDao;
import com.easypark.vraptor4.model.entity.Vaga;
import com.easypark.vraptor4.model.repository.VagaRepository;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("/vaga")
public class VagaController {
    @Inject
    private Result result;
    @Inject
    private VagaRepository vagaRepository;

    @Get 
    @Path("/list")
    public void listAll() {
        result.use(Results.json())
            .withoutRoot()
            .from(vagaRepository.list())
            .serialize();
    }
    
    @Get
    @Path("/update/1")
    public void updateVagaTrue() {
    	Vaga v = new Vaga(2L,"A1",true);
    	VagaDao vDao = new VagaDao();
    	vDao.editar(v);
    }
    
    @Get
    @Path("/update/0")
    public void updateVagaFalse() {
    	Vaga v = new Vaga(2L,"A1",false);
    	VagaDao vDao = new VagaDao();
    	vDao.editar(v);
    }
    /*BUSCA ID
    @Get
	@Path("/orders/{order.id}")
	public void get(Order order) {
		order = entityManager.find(Order.class, order.getId());
		if (order != null) {
			result.use(representation()).from(order).serialize();
		} else {
			System.out.println("order not found");
			status.notFound();
		}*/
	
}