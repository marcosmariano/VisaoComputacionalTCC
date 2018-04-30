package br.com.estacionamento.Rest;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

import br.com.estacionamento.AcessoRest;
import br.com.estacionamento.Pojo.Vaga;

/**
 * Created by MarcosVinicius on 20/10/2016.
 */
public class VagaRest {

    public Vaga getVaga(){

        AcessoRest acesso = new AcessoRest();
        String result = acesso.exemploGet("http://52.67.171.172:8080/vraptor4/vaga/busca");
        Gson g = new Gson();
        Vaga v = new Vaga();

        v=g.fromJson(result,Vaga.class);
        return v;

    }

    public ArrayList<Vaga> getListVaga(){
        AcessoRest acesso = new AcessoRest();
        String result = acesso.exemploGet("http://52.67.171.172:8080/vraptor4/vaga/list");
        ArrayList<Vaga> listaVaga = new ArrayList<Vaga>();

        Gson g = new Gson();
        JsonParser parser = new JsonParser();

        JsonArray array = parser.parse(result).getAsJsonArray();
        for (int i = 0; i < array.size(); i++) {
            // Adicionando na lista a posicao atual do JsonArray
            listaVaga.add(g.fromJson(array.get(i), Vaga.class));
        }
        // retornado a lista que consumiu do WS
        return listaVaga;
    }

}
