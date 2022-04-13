package com.company.LiskovSubstitution;

public class Rectangle {

    private  int width;
    private  int height;


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height=height;
    }

    public int getArea(int height , int width)
    {
        return (height*width);
    }
}
