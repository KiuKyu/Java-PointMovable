package com.kiu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Point point1 = new MovablePoint();

        point1.setXY(4, 6);
        System.out.println(point1);
        System.out.println(Arrays.toString(point1.getXY()));

        Point point2 = ((MovablePoint) point1).move();
        System.out.println(point2);

        // Test downcasting
        Point point3 = new Point(2,5);
        // System.out.println(((MovablePoint) point3).move());
        // Sẽ xảy ra lỗi nếu k có instanceof để check kế thừa
        if (point3 instanceof MovablePoint) { // Kiểm tra nếu point3 có phải đối tượng
            // thuộc class MovablePoint không.
            // Kết quả là luôn false do point3 là đối tượng của Point
            System.out.println(((MovablePoint) point3).move()); // không thể thực thi do False
        }
    }
}
