package com.example.shivansh.krishi_care;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    public static  final String API = "dbc30b65-1fc6-11e9-9ee8-0200cd936042";
    public static final String BASE_URL = "https://27e1f295.ngrok.io/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
