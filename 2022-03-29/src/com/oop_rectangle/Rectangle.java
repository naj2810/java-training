package com.oop_rectangle;

public class Rectangle {


    int length,width;
    Rectangle(int length, int width)
    {
        this.length=length;
        this.width=width;


    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

public int area()
{
    return length*width;
}
    public int perimeter()
    {
        return 2*(length*width);
    }


  String toStringF() {
        return String.format("Length- %d Width- %d Perimter %d  ARea- %d", length,width,area(),perimeter());
    }
}
