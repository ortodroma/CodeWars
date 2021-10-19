package rectangle;


import java.awt.*;

public class RectangleIntersect {

    public static boolean rectangleBuiltInIntersect(Rectangle firstRectangle, Rectangle secondRectangle) {

        return firstRectangle.intersects(secondRectangle);

    }

    public static boolean rectangleIntersect(Rectangle firstRectangle, Rectangle secondRectangle) {
        if (firstRectangle.isEmpty() || secondRectangle.isEmpty()) {
            throw new Error("Rectangle has width or height 0");
        }

        boolean ring = false;

        int firstRectangleXWidth = firstRectangle.x + firstRectangle.width;
        int secondRectangleXWidth = secondRectangle.x + secondRectangle.width;
        int firstRectangleYHeight = firstRectangle.y + firstRectangle.height;
        int secondRectangleYHeight = secondRectangle.y + secondRectangle.height;

        int maxX = Math.max(firstRectangle.x, secondRectangle.x);
        int minXWidth = Math.min(firstRectangleXWidth, secondRectangleXWidth);
        int maxY = Math.max(firstRectangle.y, secondRectangle.y);
        int minYHeight = Math.min(firstRectangleYHeight, secondRectangleYHeight);

        if (firstRectangle.x < secondRectangle.y) {
            if (firstRectangle.x < secondRectangle.x && firstRectangleYHeight > secondRectangleYHeight) {
                ring = true;
            }
        } else if (secondRectangle.x < firstRectangle.x && secondRectangleYHeight > firstRectangleYHeight) {
            ring = true;
        }

        return (maxX <= minXWidth || maxY <= minYHeight) && !ring;
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

        System.out.println(RectangleIntersect.rectangleBuiltInIntersect(firstRectangle, secondRectangle));

        System.out.println(RectangleIntersect.rectangleIntersect(firstRectangle, secondRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(thirdRectangle, fourthRectangle));//true
        System.out.println(RectangleIntersect.rectangleIntersect(fifthRectangle, sixthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(seventhRectangle, eighthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(ninthRectangle, tenthRectangle));//false
        System.out.println(RectangleIntersect.rectangleIntersect(eleventhRectangle, twelfthRectangle));//false

    }

}