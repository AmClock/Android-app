package com.example.to_play;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.to_play.vo.Content;
import java.util.ArrayList;


public class DetailAdapter extends BaseAdapter {

    private ArrayList<Content> list = new ArrayList<Content>();

    private int pos;

    private Content content;

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
            convertView = inflater.inflate(R.layout.content_list, parent, false);
        }


        TextView contentText = (TextView)convertView.findViewById(R.id.contentText);

        content = list.get(pos);

        contentText.setText(content.getContent());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
    public void addContent(String content ) {
        list.add(new Content(content));

        Log.i("addContent // ", "addContent: "+list.get(0).getContent());
    }
}
