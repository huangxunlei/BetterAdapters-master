package com.xinkong.mylibrary.viewholder;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by hxl65 on 2017/02/17.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    SparseArray<View> mViews;
    View mItemView;
    public int type;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = itemView;
        mViews = new SparseArray<>();
    }

    public View getView(int resId) {
        View view = mViews.get(resId);

        if (view == null) {
            view = mItemView.findViewById(resId);
            mViews.put(resId, view);
        }
        return view;
    }

    public abstract void bindViewData(T data);

}
