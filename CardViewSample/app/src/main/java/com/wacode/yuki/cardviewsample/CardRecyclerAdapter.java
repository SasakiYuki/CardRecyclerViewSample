package com.wacode.yuki.cardviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by yuki on 2016/05/26.
 */
public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.ViewHolder>{
        private String[] list;
        private Context context;

        public CardRecyclerAdapter(Context context,String[] stringArray) {
                super();
                this.list = stringArray;
                this.context = context;
        }

        @Override
        public int getItemCount() {
                return list.length;
        }

        @Override
        public void onBindViewHolder(ViewHolder vh, final int position) {
                vh.textView_main.setText(list[position]);
                if(position != list.length){
                        vh.textView_sub.setText("次:"+list[position+1]);
                }else {
                        vh.textView_sub.setText("次:"+list[position]);
                }
                vh.imageView.setImageResource(R.mipmap.ic_launcher);
                vh.layout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Toast.makeText(context,list[position],Toast.LENGTH_SHORT).show();
                        }
                });
        }

        @Override
        public CardRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                LayoutInflater layoutInflater = LayoutInflater.from(context);
                View v = layoutInflater.inflate(R.layout.layout_recycler, parent, false);
                ViewHolder viewHolder = new ViewHolder(v);
                return viewHolder;
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
                TextView textView_main;
                TextView textView_sub;
                LinearLayout layout;
                ImageView imageView;

                public ViewHolder(View v) {
                        super(v);
                        textView_main = (TextView)v.findViewById(R.id.textView_main);
                        textView_sub = (TextView)v.findViewById(R.id.textView_sub);
                        layout = (LinearLayout)v.findViewById(R.id.layout);
                        imageView = (ImageView)v.findViewById(R.id.imageView);
                }
        }
}
