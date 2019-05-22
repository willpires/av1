package com.example.av1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
     ListView listaAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listaNomeAlunos = new ArrayList<String>();
        listaNomeAlunos.add("will");
        listaNomeAlunos.add("jose");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,listaNomeAlunos);
        listaAlunos  = findViewById(R.id.listaView);
        listaAlunos.setAdapter(adapter);



        ApiRetrofit api = ApiRetrofit.retrofit.create(ApiRetrofit.class);
        Call<List<Alunos>> alunosCall = api.getAlunos();

        alunosCall.enqueue(new Callback<List<Alunos>>() {
            @Override
            public void onResponse(Call<List<Alunos>> call, Response<List<Alunos>> response) {
                if(response.s)
            }

            @Override
            public void onFailure(Call<List<Alunos>> call, Throwable t) {

            }
        });

    }
}
