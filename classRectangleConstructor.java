package com.company;

public class classRectangleConstructor {
    public static void main(String[] args) {
        RectangleConstructor rect = new RectangleConstructor(5,9);
        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());


    }
}
class RectangleConstructor{
    int height;
    int width;

    public RectangleConstructor() {
        this.height = 4;
        this.width = 5;
    }

    public RectangleConstructor(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


}
