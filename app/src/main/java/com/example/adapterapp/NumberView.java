package com.example.adapterapp;

public class NumberView {
    private String mNum;
    private String mText;
    private int mImageId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public NumberView( String nNum, String nText){

        mNum = nNum;
        mText = nText;
    }

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

    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }
}
