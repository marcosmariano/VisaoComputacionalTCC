package br.com.estacionamento;

import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Handler;

import br.com.estacionamento.Pojo.Vaga;
import br.com.estacionamento.Rest.VagaRest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtVaga = (TextView) findViewById(R.id.txtVaga1);
        final ImageView imgVazio = (ImageView) findViewById(R.id.imgVago);
        final ImageView imgOcupado = (ImageView) findViewById(R.id.imgOcupado);

        VagaRest vRest = new VagaRest();
        Vaga v = vRest.getVaga();
        AcessoRest acesso = new AcessoRest();

        final String result = acesso.exemploGet("http://52.67.171.172:8080/vraptor4/vaga/busca");
        txtVaga.setText("A1");

        imgVazio.setVisibility(View.VISIBLE);
        imgOcupado.setVisibility(View.INVISIBLE);

                if (result.contains("true")) {
                    imgVazio.setVisibility(View.INVISIBLE);
                    imgOcupado.setVisibility(View.VISIBLE);

                } else {
                    imgVazio.setVisibility(View.VISIBLE);
                    imgOcupado.setVisibility(View.INVISIBLE);
                }

        }

}
