package com.example.to_play;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.to_play.vo.Reply;

import java.util.ArrayList;

public class ReplylAdapter extends BaseAdapter {

    private ArrayList<Reply> list = new ArrayList<Reply>();

    private int pos;

    private Reply reply;

    @Override
    public int getCount() {
        return list.size();
    }

    // ** 이 부분에서 리스트뷰에 데이터를 넣어줌 **
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //postion = ListView의 위치      /   첫번째면 position = 0
        final int pos = position;
        final Context context = parent.getContext();


        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.reply_list, parent, false);
        }

        LinearLayout myBtnWrap = (LinearLayout) convertView.findViewById(R.id.myBtnWrap);
        myBtnWrap.setVisibility(View.GONE);

        TextView userName = (TextView) convertView.findViewById(R.id.userName);
        TextView replyContent = (TextView) convertView.findViewById(R.id.replyContent);

        reply = list.get(pos);

        userName.setText(reply.getUserName());
        replyContent.setText(reply.getContent());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // 데이터값 넣어줌
    public void addReply(String userName , String content) {
        list.add(new Reply(userName , content));
    }
}
