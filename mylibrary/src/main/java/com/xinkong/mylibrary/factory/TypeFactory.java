package com.xinkong.mylibrary.factory;

import android.view.View;

import com.xinkong.mylibrary.decorate.Visitable;
import com.xinkong.mylibrary.viewholder.BaseViewHolder;

/**
 * Created by hxl65 on 2017/02/17.
 */

public interface TypeFactory {
    int type(Visitable visitable, int resId);
    // int type(BannerBean bannerBean);

    /// int type(ContentBean contentBean);

    // int type(SearchBean searchBean);

    ///int type(DividerBean dividerBean);

    BaseViewHolder createViewHolder(int type, View itemView);
}