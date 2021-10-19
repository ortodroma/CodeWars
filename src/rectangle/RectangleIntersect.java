package rectangle;


import java.awt.*;

public class RectangleIntersect {


    public static boolean rectangleIntersect(Rectangle firstRectangle, Rectangle secondRectangle) {


        boolean ring = false;

        int maxX = Math.max(firstRectangle.x, secondRectangle.x);
        int minXWidth = Math.min(firstRectangle.x + firstRectangle.width, secondRectangle.x + secondRectangle.width);
        int maxY = Math.max(firstRectangle.y, secondRectangle.y);
        int minYHeight = Math.min(firstRectangle.y + firstRectangle.height, secondRectangle.y + secondRectangle.height);


        if (firstRectangle.x < secondRectangle.y) {
            if (firstRectangle.x < secondRectangle.x && firstRectangle.y + firstRectangle.height > secondRectangle.y + secondRectangle.height) {
                ring = true;
            }
        } else if (secondRectangle.x < firstRectangle.x && secondRectangle.y + secondRectangle.height > firstRectangle.y + firstRectangle.height) {
            ring = true;
        }

        if (maxX > minXWidth && maxY > minYHeight || ring == true) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(1, 1, 3, 3);
        Rectangle secondRectangle = new Rectangle(2, 2, 4, 4);

        Rectangle thirdRectangle = new Rectangle(1, 3, 4, 4);
        Rectangle fourthRectangle = new Rectangle(3, 1, 5, 5);

        Rectangle fifthRectangle = new Rectangle(1, 1, 1, 1);
        Rectangle sixthRectangle = new Rectangle(3, 3, 2, 2);

        Rectangle seventhRectangle = new Rectangle(3, 3, 2, 2);
        Rectangle eighthRectangle = new Rectangle(1, 1, 1, 1);

        Rectangle ninthRectangle = new Rectangle(1, 1, 5, 5);
        Rectangle tenthRectangle = new Rectangle(2, 2, 1, 1);

        Rectangle eleventhRectangle = new Rectangle(2, 2, 1, 1);
        Rectangle twelfthRectangle = new Rectangle(1, 1, 5, 5);

        System.out.println(RectangleIntersect.rectangleIntersect(firstRectangle, secondRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(thirdRectangle, fourthRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(fifthRectangle, sixthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(seventhRectangle, eighthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(ninthRectangle, tenthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(eleventhRectangle, twelfthRectangle));//false
    }
//        boolean intersect = false;
//        Rectangle rec1 = new Rectangle(1, 1, 7, 7);
//        Rectangle rec2 = new Rectangle(2, 2, 4, 4);
//
//        intersect = rec1.intersects(rec2);
//        System.out.println(intersect);

}


