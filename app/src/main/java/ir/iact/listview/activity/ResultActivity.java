package ir.iact.listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

import ir.iact.listview.R;
import ir.iact.listview.model.NewsModel;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView titleTextView = (TextView) findViewById(R.id.resultActivity_titleTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.resultActivity_descriptionTextView);


        NewsModel newsModel = (NewsModel) getIntent().getSerializableExtra("newsModel");

        titleTextView.setText(newsModel.title);
        descriptionTextView.setText(newsModel.description);
    }
}
