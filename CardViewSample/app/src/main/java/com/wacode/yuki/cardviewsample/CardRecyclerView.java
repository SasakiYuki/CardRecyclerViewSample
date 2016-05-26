package com.wacode.yuki.cardviewsample;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by yuki on 2016/05/26.
 */
public class CardRecyclerView extends RecyclerView{
    public CardRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setRecyclerAdapter(context);
    }

    public void setRecyclerAdapter(Context context){
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(new CardRecyclerAdapter(context,context.getResources().getStringArray(R.array.dummy)));
    }
}
