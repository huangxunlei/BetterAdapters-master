package com.xinkong.mylibrary.factory;

import android.view.View;

import com.xinkong.mylibrary.decorate.Visitable;
import com.xinkong.mylibrary.viewholder.BaseViewHolder;


/**
 * Created by hxl65 on 2017/02/17.
 */

public abstract class ItemTypeFactory implements TypeFactory {

//    @Override
//    public int type(BannerBean bannerBean) {
//        return BANNER_ITEM_LAYOUT;
//    }

//    @Override
//    public int type(ContentBean contentBean) {
//        return CONTENT_ITEM_LAYOUT;
//    }

//    @Override
//    public int type(DividerBean dividerBean){
//        return DIVIDER_ITEM_LAYOUT;
//    }


//    @Override
//    public int type(SearchBean dividerBean){
//        return SEARCH_ITEM_LAYOUT;
//    }

    @Override
    public int type(Visitable visitable, int resId) {
        int viewType = 0;
        if (visitable instanceof Visitable) {
            viewType = resId;
        }
        return viewType;
    }

    @Override
    public abstract BaseViewHolder createViewHolder(int type, View itemView);
}