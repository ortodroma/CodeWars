package rectangle;


import java.awt.*;

public class RectangleIntersect {


    public static boolean rectangleIntersect(CustomRectangle firstRectangle, CustomRectangle secondRectangle) {
        int firstRectangleX = firstRectangle.getX();
        int firstRectangleY = firstRectangle.getY();
        int firstRectangleWidth = firstRectangle.getWidth();
        int firstRectangleHeight = firstRectangle.getHeight();

        int secondRectangleX = secondRectangle.getX();
        int secondRectangleY = secondRectangle.getY();
        int secondRectangleWidth = secondRectangle.getWidth();
        int secondRectangleHeight = secondRectangle.getHeight();

        boolean intersect = false;

        CustomRectangle leftRectangle, rightRectangle;

        if (firstRectangleX < secondRectangleX) {
            leftRectangle = firstRectangle;
            rightRectangle = secondRectangle;
        } else {
            leftRectangle = secondRectangle;
            rightRectangle = firstRectangle;
        }


        if (firstRectangleX + firstRectangleWidth > secondRectangleX
                && firstRectangleY + firstRectangleHeight > secondRectangleY
                && firstRectangleY + firstRectangleHeight < secondRectangleY + secondRectangleHeight) {
            intersect = true;

        }
        return intersect;
    }






    public static void main(String[] args) {
        CustomRectangle firstRectangle = new CustomRectangle(1, 1, 3, 3);
        CustomRectangle secondRectangle = new CustomRectangle(2, 2, 4, 4);


        CustomRectangle thirdRectangle = new CustomRectangle(3, 1, 4, 4);
        CustomRectangle fourthRectangle = new CustomRectangle(1, 3, 5, 5);

        CustomRectangle fifthRectangle = new CustomRectangle(1, 1, 1, 1);
        CustomRectangle sixthRectangle = new CustomRectangle(3, 3, 2, 2);

        CustomRectangle seventhRectangle = new CustomRectangle(1, 1, 5, 5);
        CustomRectangle eighthRectangle = new CustomRectangle(2, 2, 1, 1);

        CustomRectangle ninthRectangle = new CustomRectangle(3, 3, 2, 2);
        CustomRectangle tenthRectangle = new CustomRectangle(1, 1, 1, 1);

        CustomRectangle eleventhRectangle = new CustomRectangle(2, 2, 1, 1);
        CustomRectangle twelfthRectangle = new CustomRectangle(1, 1, 5, 5);

        System.out.println(RectangleIntersect.rectangleIntersect(firstRectangle, secondRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(thirdRectangle, fourthRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(fifthRectangle, sixthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(seventhRectangle, eighthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(ninthRectangle, tenthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(eleventhRectangle, twelfthRectangle));//false

//        boolean intersect = false;
//        Rectangle rec1 = new Rectangle(1, 1, 7, 7);
//        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
//
//        intersect = rec1.intersects(rec2);
//        System.out.println(intersect);
    }
}


