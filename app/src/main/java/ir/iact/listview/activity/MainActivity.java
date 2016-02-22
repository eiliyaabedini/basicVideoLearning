package ir.iact.listview.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ir.iact.listview.R;
import ir.iact.listview.model.NewsModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define ListView
        final ListView listView = (ListView) findViewById(R.id.mainActivity_listView);

        // Create Models
        NewsModel newsModel1 = new NewsModel("salam","In Tozihate Salam hast");
        NewsModel newsModel2 = new NewsModel("Haleton Chetore","In Tozihate Haleton Chetore");
        NewsModel newsModel3 = new NewsModel("In Avalin Liste mane","In Tozihate In Avalin Liste mane");

        final ArrayList<NewsModel> newsModels = new ArrayList<>();

        newsModels.add(newsModel1);
        newsModels.add(newsModel2);
        newsModels.add(newsModel3);

        newsModels.add(new NewsModel("ABCD", "EFG"));

        // Set Adapter to ListView
        final MyListAdapter myListAdapter = new MyListAdapter(newsModels);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                NewsModel newsModel = ((MyListAdapter) parent.getAdapter()).getItem(position);


                Toast.makeText(MainActivity.this, newsModel.title +"\n"+newsModel.description ,Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("newsModel",newsModel);
                startActivity(intent);
            }
        });

    }



    class MyListAdapter extends BaseAdapter {
        ArrayList<NewsModel> newsModels;

        public MyListAdapter(ArrayList<NewsModel> newsModels) {

            this.newsModels = newsModels;
        }

        @Override
        public int getCount() {
            return newsModels.size();
        }

        @Override
        public NewsModel getItem(int position) {
            return newsModels.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.list_item, null);
            TextView textView = (TextView) view.findViewById(R.id.listItem_titleTextView);
            TextView description = (TextView) view.findViewById(R.id.listItem_descriptionTextView);

            NewsModel newsModel = getItem(position);

            textView.setText(newsModel.title);
//            description.setText(newsModel.description);

            return view;
        }
    }
}
