package homework;

public class LogicalOperators {

    public static void main(String[] args) {

        // int from 0 to 59
        /* if x = 0 to 14  print 2 quarter
           if x = 15 to 29  print 2 quarter
           if x = 30 to 44  print 3 quarter
           if x = 45 to 59  print 4 quarter
         */
        int y = -1;
        if (y >= 0 && y <= 14) {
            System.out.println("It is 2quarter");
        } else if (y >= 14 && y <= 29) {
            System.out.println("It is 2 quarter");
        } else if (y >= 30 && y <= 44) {
            System.out.println("It is 3 quarter");
        } else if (y >= 45 && y <= 59) {
            System.out.println("It is 4 quarter");
        } else {
            System.out.println("Provided number is incorrect");
        }
    }
}

