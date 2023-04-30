import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // Defining two lines
        double x1 = 2.0, y1 = 3.0, x2 = 5.0, y2 = 7.0;
        double x3 = 4.0, y3 = 5.0, x4 = 1.0, y4 = 8.0;

        // Calculating the length of line 1
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 1: " + length1);

        // Calculating the length of line 2
        double length2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of line 2: " + length2);

        // Checking equality of lines using equals method
        if (Double.valueOf(length1).equals(Double.valueOf(length2))) {
            System.out.println("Line 1 is equal to Line 2");
        } else {
            System.out.println("Line 1 is not equal to Line 2");
        }

        // Comparing lines using compareTo method
        int comparisonResult = Double.compare(length1, length2);
        if (comparisonResult == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is less than Line 2");
        } else {
            System.out.println("Line 1 is greater than Line 2");
        }
    }
}
