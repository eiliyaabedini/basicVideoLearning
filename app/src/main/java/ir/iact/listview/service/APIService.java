package ir.iact.listview.service;

import java.util.ArrayList;

import ir.iact.listview.model.NewsModel;
import retrofit2.Call;
import retrofit2.http.GET;
  
/* Retrofit 2.0 */

public interface APIService {

    @GET("56d15bf10f00001100c88265")
    Call<NewsModelResponse> getNewsModels();
}