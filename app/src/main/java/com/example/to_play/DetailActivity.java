package com.example.to_play;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.to_play.vo.Content;

public class DetailActivity extends AppCompatActivity {

    /* content list zone*/
    private ListView contentList;
    private DetailAdapter da;

    /*reply list zone*/
    private ListView replyList;
    private ReplylAdapter ra;


    /*tset data */
    String[] contentArr = {"test입니다.........","test입니다........."};



    /*tset data */
    String[] userName = {"test1","test2"};
    String[] replyText = {"test입니다.........","test입니다........."};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);





        /*

        da = new DetailAdapter();
        contentList = (ListView)findViewById(R.id.contentList);
        contentList.setAdapter(da);
*/

      /*  ra = new ReplylAdapter();
        replyList = (ListView)findViewById(R.id.replyList);
        replyList.setAdapter(ra);*/
/*

        */
/*test zone*//*

        for(int i = 0 ; i< 2 ; i++){
            da.addContent(contentArr[i]);
        */
/*    ra.addReply(userName[i],replyText[i]);*//*

        }



*/






    }
}
