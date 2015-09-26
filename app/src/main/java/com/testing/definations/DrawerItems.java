package com.testing.definations;

import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by ishank on 06/09/2015.
 */
public interface DrawerItems {
    public int getViewType();
    public View getView(LayoutInflater inflater,View convertView);
}
