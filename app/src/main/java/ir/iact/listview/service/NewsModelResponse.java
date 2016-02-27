package ir.iact.listview.service;

import java.util.ArrayList;

import ir.iact.listview.model.NewsModel;

public class NewsModelResponse {
    private ArrayList<NewsModel> newsModels;

    public NewsModelResponse() {
    }

    public ArrayList<NewsModel> getNewsModels() {
        return newsModels;
    }

    public void setNewsModels(ArrayList<NewsModel> newsModels) {
        this.newsModels = newsModels;
    }
}
