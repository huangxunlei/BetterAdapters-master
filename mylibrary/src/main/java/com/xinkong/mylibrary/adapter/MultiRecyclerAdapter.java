package com.xinkong.mylibrary.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xinkong.mylibrary.decorate.Visitable;
import com.xinkong.mylibrary.factory.ItemTypeFactory;
import com.xinkong.mylibrary.viewholder.BaseViewHolder;

import java.util.List;


/**
 * Created by hxl65 on 2017/02/17.
 */

public class MultiRecyclerAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    List<Visitable> mData;
    ItemTypeFactory typeFactory;

    public MultiRecyclerAdapter(List<Visitable> mData, ItemTypeFactory mItemTypeFactory) {
        this.mData = mData;
        typeFactory = mItemTypeFactory;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return typeFactory.createViewHolder(viewType, view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.bindViewData(mData.get(position));
    }

    @Override
    public int getItemViewType(int position) {

        return mData.get(position).type(typeFactory);
    }

    @Override
    public int getItemCount() {
        return (mData != null ? mData.size() : 0);
    }

}
