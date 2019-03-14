package com.example.to_play;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.to_play.vo.Article;
import java.util.ArrayList;

public class ArticleAdapter extends BaseAdapter {

    private ArrayList<Article> list = new ArrayList<Article>() ;
    private Article article;
    Intent intent;

    @Override
    public int getCount() {
        return list.size() ;
    }

    // ** 이 부분에서 리스트뷰에 데이터를 넣어줌 **
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //postion = ListView의 위치      /   첫번째면 position = 0
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.article_list, parent, false);
        }


        TextView title = (TextView)convertView.findViewById(R.id.title);
        TextView name = (TextView)convertView.findViewById(R.id.name);
        TextView like = (TextView)convertView.findViewById(R.id.likeNum);
        TextView comment = (TextView)convertView.findViewById(R.id.commentNum);
        TextView view = (TextView)convertView.findViewById(R.id.viewNum);
        TextView regdate = (TextView)convertView.findViewById(R.id.regdateText);

        article = list.get(position);

        title.setText(article.getTitle());
        name.setText(article.getName());
        like.setText(String.valueOf(article.getLike()));
        comment.setText(String.valueOf(article.getComment()));
        view.setText(String.valueOf(article.getView()));

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test 11 " , "test :: " + list.get(pos).getNo());
                intent = new Intent(context , DetailActivity.class);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
    @Override
    public long getItemId(int position) {
        return position ;
    }


    @Override
    public Object getItem(int position) {
        return list.get(position) ;
    }

    // 데이터값 넣어줌
    public void addArticle(int no , String title ,String name ,String img , int like , int view , int comment ) {
        list.add(new Article(no,title,name,img,like,view,comment));
    }

}
