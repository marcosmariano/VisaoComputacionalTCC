package br.com.estacionamento.Pojo;

/**
 * Created by marcos.mariano on 26/09/2016.
 */
public class Vaga {

    private Long id;
    private String descricao;
    private boolean status;

    public Vaga(Long id, String descricao, boolean status) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
    }

    public Vaga() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
