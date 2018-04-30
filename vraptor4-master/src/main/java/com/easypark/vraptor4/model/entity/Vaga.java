package com.easypark.vraptor4.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaga {
	@Id
	private Long idVaga;
	private String Descricao;
	private boolean Status;
	
    public Vaga(Long idVaga, String descricao, boolean status) {
        this.idVaga = idVaga;
        this.Descricao = descricao;
        this.Status = status;
    }

    public Vaga() {
    }
    
	public Long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Long idVaga) {
        this.idVaga = idVaga;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
}
