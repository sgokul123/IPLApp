package com.bridgeit.ipl2017.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bridgeit.ipl2017.utility.Debug;

import java.util.ArrayList;

/**
 * Created by bridgeit on 1/2/17.
 */
public class ImageAdapter extends BaseAdapter {
    public static final String TAG = "ImageAdapter";
<<<<<<< HEAD
    int j;
    private ImageView mImageView;
    private Context mContext;
    private int size, i;
    private ArrayList<Bitmap> mBitmapsImages;
    // private ArrayList<PlayerInfoModel> playerInfoModels=new ArrayList<>();

    public ImageAdapter(Context con, ArrayList<Bitmap> bitmaps) {
        mContext = con;
        this.mBitmapsImages = bitmaps;
=======

    private  ImageView mImageView;
    private Context mContext;
    private int size,i;
    int j;
    private   ArrayList<Bitmap> mBitmapsImages;
   // private ArrayList<PlayerInfoModel> playerInfoModels=new ArrayList<>();

    public ImageAdapter(Context con, ArrayList<Bitmap> bitmaps) {
        mContext = con;
      this.mBitmapsImages =bitmaps;
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
    }

    public int getCount() {
        return mBitmapsImages.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            mImageView = new ImageView(mContext);
            mImageView.setLayoutParams(new GridView.LayoutParams(255, 255));
            mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            mImageView.setPadding(8, 8, 8, 8);
        } else {
            mImageView = (ImageView) convertView;
        }
<<<<<<< HEAD
        Debug.showLog(TAG, "Set Image..");
=======
        Debug.showLog(TAG,"Set Image..");
>>>>>>> 52bd319017631e3df353b28bd96ddf88d8a8806a
        mImageView.setImageBitmap(mBitmapsImages.get(position));

        return mImageView;
    }

}