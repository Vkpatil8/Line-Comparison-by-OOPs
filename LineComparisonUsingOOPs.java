//Line comparison using oops

import java.util.Scanner;

public class LineComparisonUsingOOPs {

    //main method
    public static void main(String[] args) {


        Integer lengthOfLine1 = (int) computeLength();
        Integer lengthOfLine2 = (int) computeLength();

        //objects of compared and equals method
        new CompareToMethod(lengthOfLine1, lengthOfLine2);
        new EqualMethod(lengthOfLine1, lengthOfLine2);

    }

    //length computation method
    public static double computeLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter co-ordinates for a line 1: ");
        System.out.println("Enter the value of x1 and y1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the value of x2 and y2");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}
