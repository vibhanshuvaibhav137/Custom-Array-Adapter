package com.example.adapterapp;

public class NumberView {
    private String mNum;
    private String mText;
    private int mImageId;


    public NumberView(int nImage, String nNum, String nText){
        mImageId = nImage;
        mNum = nNum;
        mText = nText;
    }

    public int getImageId(){
        return mImageId;
    }

    public  String getNum(){
        return mNum;
    }

    public String getText(){
        return mText;
    }
}
