package com.example.to_play;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private ArticleAdapter adapter;


    int [] no = {1,2,3,4,5,6};
    String[] title = {"test1","test2","test3","test4","test5","test6"};
    String[] name = {"test1","test2","test3","test4","test5","test6"};
    String[] img = {"test1","test2","test3","test4","test5","test6"};
    int [] like = {1,2,3,4,5,6};
    int [] view = {1,2,3,4,5,6};
    int [] comment = {1,2,3,4,5,6};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArticleAdapter();
        list = (ListView)findViewById(R.id.articleList);

        list.setAdapter(adapter);

        for(int i = 0 ; i < 6 ; i++){
            adapter.addArticle(no[i],title[i],name[i],img[i],like[i],view[i],comment[i]);
        }

    }//onCreate end


    public void onClick(){

    }

}//main end
