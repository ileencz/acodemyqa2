package homework;

public class Loops {

    public static void main(String[] args) {

        //Integer value is 10
        int x = 10;
        if (x == 10) {
            System.out.println("Integer value is " + x);
        } else {
            System.out.println("Error massage");
        }

        // int from 18 to 65
        /* if x = 18 to 21  print 10%
           if x = 22 to 64  print 15%
           if x = 65 to 99  print 20%
         */
        int y = 10;
        if (y >= 18 && y <= 21) {
            System.out.println("Your age is 18-22 and Discount is 10%");
        } else if (y >= 22 && y <= 64) {
            System.out.println("Your age is 22-64 and Discount is 15%");
        } else if (y >= 65 && y <= 99) {
            System.out.println("Your age is 65-99 and Discount is 20%");
        } else {
            System.out.println("Sorry, but you can't get a discount, because your age is under 18.");
        }

        // animals + random animal
        String[] animals = {"giraffe", "elephant", "lion", "cat", "dog", "fox", "wolf", "squirrel", "mouse", "horse"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        for (String animal : animals) {
            System.out.println(animal);
        }
        for (int i = 3; i < 4; i++) {
            System.out.println(animals[i]);
        }

        // even numbers {0, 2, 4, 6, 8, 10}
        int b = 0;
        for (int i = 0; i < 5; i++) {
            b += 2;
            System.out.println(b + " ");
        }

        // numbers from 50 to 1
        int countDown = 50;
        while (countDown >= 1) {
            System.out.println(countDown);
            countDown--;
        }

        // numbers from 1 to 100
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

        // transport to the job {car, bus, trolleybus, train, taxi};
        String currentTransport = "horse";

        switch (currentTransport) {
            case "Car":
                System.out.println("This is a fast transport!");
                break;
            case "bus":
                System.out.println("This is vehicle and it is " + currentTransport);
                break;
            case "trolleybus":
                System.out.println("This is vehicle and it is " + currentTransport);
                break;
            case "train":
                System.out.println("This is vehicle and it is " + currentTransport);
                break;
            case "taxi":
                System.out.println("This is vehicle and it is " + currentTransport);
                break;
            default:
                System.out.println("Oops, " + currentTransport + " it is not a transport");
        }

        // multiplication table from 1 to 10
        for (int i = 1; i < 10; i++) {
            for (int d = 1; d < 10; d++) {
                System.out.print(d * i + "  ");
            }
            System.out.println("");
        }
    }
}










