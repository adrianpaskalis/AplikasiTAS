package com.example.aplikasiuts;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

 public class RetrofitClient {
        private static Retrofit retrofit;
        public static final String BASE_URL = "https://kpsi.fti.ukdw.ac.id/";

        //design patern

        public static Retrofit getRetrofitInstance() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }


