package com.example.av1;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Part;

public interface ApiRetrofit {

    public String url_base = "http://gerenbdphp.000webhostapp.com/";

    @GET("query_todos")
    Call<List<Alunos> >getAlunos();

     Retrofit retrofit = new Retrofit.Builder()
             .baseUrl(url_base).addConverterFactory(GsonConverterFactory.create())
             .build();



}
