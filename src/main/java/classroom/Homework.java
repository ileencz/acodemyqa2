package classroom;

import com.sun.jdi.CharValue;

public class Homework {
    public static void main(String[] args) {

    //Integral example
        //  Byte
        byte  clothingSize = 36;
        System.out.println(clothingSize);

        byte studentsInClass = 22;
        System.out.println(studentsInClass);

        byte itemsInTheCart = 10;
        System.out.println(itemsInTheCart);

        byte candiesInKg = 120;
        System.out.println(candiesInKg);

        byte housesInTheStreet = 100;
        System.out.println(housesInTheStreet);

        byte roseInTheVase = 53;
        System.out.println(roseInTheVase);

        byte signsInTheCarNumber = 7;
        System.out.println(signsInTheCarNumber);

        byte familyMembers = 8;
        System.out.println(familyMembers);

        byte alphabetLetters = 33;
        System.out.println(alphabetLetters);

        byte teethInTheMouth = 32;
        System.out.println(teethInTheMouth);

        System.out.println("Byte minimal value teethInTheMouth is:" + Byte.MIN_VALUE);
        System.out.println("Byte maximal value signsInTheCarNumber is:" + Byte.MAX_VALUE);

        // Short
        short mmInSm = 1000;
        System.out.println(mmInSm);

        short minuteInMonth = 32767;
        System.out.println(minuteInMonth);

        short symbolsInText = 30000;
        System.out.println(symbolsInText);

        short kilowattToMegawatt = 1000;
        System.out.println(kilowattToMegawatt);

        short lengthOfTheLatvianRailroad = 1859;
        System.out.println(lengthOfTheLatvianRailroad);

        short SquareOfPlavnieki = 2985;
        System.out.println(SquareOfPlavnieki);

        short populationDensityOfRiga = 2021;
        System.out.println(populationDensityOfRiga);

        short polendInRiga = 11871;
        System.out.println(polendInRiga);

        short streetsNumbersOfRiga = 1735;
        System.out.println(streetsNumbersOfRiga);

        short airlinersSpeed = 500;
        System.out.println(airlinersSpeed);

        System.out.println("Short minimal value lengthOfTheLatvianRailroad is:" + Short.MIN_VALUE);
        System.out.println("Short maximal value streetsNumbersOfRiga is:" + Short.MAX_VALUE);

        // Char
        char c1 = '\u0026';
        System.out.println(c1);

        char c2 = '\u023A';
        System.out.println(c2);

        char c3 = 97;
        System.out.println(c3);

        char c4 = 103;
        System.out.println(c4);

        char c5 = 7;
        System.out.println(c5);

        char c6 = '\u1E57';
        System.out.println(c6);

        char c7 = 880;
        System.out.println(c7);

        char c8 = '\u03A9';
        System.out.println(c8);

        char c9 = 902;
        System.out.println(c9);

        char c10 = '\u038F';
        System.out.println(c10);

        System.out.println("Char minimal value c1 is:" + Character.MIN_VALUE);
        System.out.println("Char maximal value c10 is:" + Character.MAX_VALUE);

        // Integer
        int populationOfRiga = 614618;
        System.out.println(populationOfRiga);

        int LuznikiStadiumSeats = 81000;
        System.out.println(LuznikiStadiumSeats);

        int blondsHears = 150000;
        System.out.println(blondsHears);

        int diametrOfTheSun = 1392700;
        System.out.println(diametrOfTheSun);

        int distanceFromEarthToProximaCentauri = 268770;
        System.out.println(distanceFromEarthToProximaCentauri);

        int speedOfLight = 299792458;
        System.out.println(speedOfLight);

        int pointOfClosestApproachOfTheEarthToTheSun = 146000000;
        System.out.println(pointOfClosestApproachOfTheEarthToTheSun);

        int vaccinatedPeopleInLatvia = 1855000;
        System.out.println(vaccinatedPeopleInLatvia);

        int womenInLatvia = 1000999;
        System.out.println(womenInLatvia);

        int usaPopulatoin = 329000000;
        System.out.println(usaPopulatoin);

        System.out.println("Integer minimal value vaccinatedPeopleInLatvia is:" + Integer.MIN_VALUE);
        System.out.println("Integer maximal value usaPopulatoin is:" + Integer.MAX_VALUE);

        //Long
        long distanceFromEarthToSun = 149597870700L;
        System.out.println(distanceFromEarthToSun);

        long creditCardNumber = 5624562300320045L;
        System.out.println(creditCardNumber);

        long russianFreeCallCentreNumber = 88001007815L;
        System.out.println(russianFreeCallCentreNumber);

        long latvianTelephonNumberExample = 37166622803L;
        System.out.println(latvianTelephonNumberExample);

        long vaccinatedPeopleInTheWorld = 9097104632L;
        System.out.println(vaccinatedPeopleInTheWorld);

        long populationOfChina = 1402000000000L;
        System.out.println(populationOfChina);

        long populationOfIndia = 138000000000L;
        System.out.println(populationOfIndia);

        long worldOceanArea = 361260000L;
        System.out.println(worldOceanArea);

        long worldOceanVolume = 1340740000L;
        System.out.println(worldOceanVolume);

        long pacificOceanVolume = 710000000L;
        System.out.println(pacificOceanVolume);

        System.out.println("Long minimal value populationOfChina is:" + Long.MIN_VALUE);
        System.out.println("Long maximal value pacificOceanVolume is:" + Long.MAX_VALUE);

        // Float
        float densityPopulationOfRiga = 2021.4F;
        System.out.println(densityPopulationOfRiga);

        float rigaSquare = 304.05F;
        System.out.println(rigaSquare);

        float squareOfPublicGardensInRiga = 57.54F;
        System.out.println(squareOfPublicGardensInRiga);

        float percentageOfOceanSalinity = 32.7F;
        System.out.println(percentageOfOceanSalinity);

        float numberOfRequestsOnTheSite = 4.839F;
        System.out.println(numberOfRequestsOnTheSite);

        float followersOfPavelVolya = 29.3452F;
        System.out.println(followersOfPavelVolya);

        float sunMass = 1.0014F;
        System.out.println(sunMass);

        float siderealCirculationPeriod = 87.969F;
        System.out.println(siderealCirculationPeriod);

        float orbitalVelocity = 47.36F;
        System.out.println(orbitalVelocity);

        float meanOrbitalAnomaly = 174.795884F;
        System.out.println(meanOrbitalAnomaly);

        System.out.println("Float minimal value sunMass is:" + Float.MIN_VALUE);
        System.out.println("Float maximal value meanOrbitalAnomaly is:" + Float.MAX_VALUE);

        // Double
        double temperatureOfSun = 15.5000000;
        System.out.println(temperatureOfSun);

        double weighOfSun = 1.99000000000000000000000000000000;
        System.out.println(weighOfSun);

        double piValue = 3.1415926535;
        System.out.println(piValue);

        double atlanticOceanVolume = 14.69000000;
        System.out.println(atlanticOceanVolume);

        double arcticOceanSquare = 14.75000000;
        System.out.println(arcticOceanSquare);

        double movementOfMercuryAtDistanceFromSun = 57.91000000;
        System.out.println(movementOfMercuryAtDistanceFromSun);

        double distanceFromSunToNeptune = 4.503000000000;
        System.out.println(distanceFromSunToNeptune);

        double orbitalEccentricity = 0.20563593;
        System.out.println(orbitalEccentricity);

        double distantOrbitalPointFromTheSun = 0.46670079;
        System.out.println(distantOrbitalPointFromTheSun);

        double radiusOfSun = 6.96000000000;
        System.out.println(radiusOfSun);

        System.out.println("Double minimal value temperatureOfSun is:" + Double.MAX_VALUE);
        System.out.println("Double maximal value orbitalEccentricity is:" + Double.MIN_VALUE);

        // Boolean
        boolean isSummer = false;
        System.out.println(isSummer);

        boolean isWinter = true;
        System.out.println(isWinter);

        boolean isOneGreatherThenTwo = 1 > 2;
        System.out.println(isOneGreatherThenTwo);

        boolean isOneMoreThenTwo = 1 < 2;
        System.out.println(isOneMoreThenTwo);

        boolean isB1 = true;
        System.out.println(isB1);

        boolean isB2 = false;
        System.out.println(isB2);

        boolean isCinderellaLostHerShoe = true;
        System.out.println(isCinderellaLostHerShoe);

        boolean isCappucinoWithoutMilk = false;
        System.out.println(isCappucinoWithoutMilk);

        boolean hasHotWater = true;
        System.out.println(hasHotWater);

        boolean hasWarmWater = false;
        System.out.println(hasWarmWater);

        // Operators
        int a = 10;
        int b = 3;
        int c = a + b;

        System.out.println(a / b);
        System.out.println(10 / 3);

        System.out.println(a - c);
        System.out.println(10 - (10 + 3));

        System.out.println(a * b);
        System.out.println(10 * 3);

        System.out.println(b * c);
        System.out.println(3 * (10 + 3));

//I have an analytical mindset, I quickly remember new information and am not afraid of constructive criticism.I still strive for learning and development.

        String firstPart = "I have an analytical mindset";
        System.out.println(firstPart);
        String secondPart = "I quickly remember new information";
        System.out.println(secondPart);
        String thirdPart = "and am not afraid of constructive criticism";
        System.out.println(thirdPart);
        String fourthPart = "I still strive for learning and development";
        System.out.println(fourthPart);

        System.out.printf("%s %s %s %s.\n",firstPart,secondPart,thirdPart,fourthPart);
        System.out.println(firstPart+", "+secondPart+" "+thirdPart +". "+fourthPart+".");

    }
}
