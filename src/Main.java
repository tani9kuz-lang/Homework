//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Тебе уже 18 или больше лет;");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //Task 2
        byte temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Task 3
        short speed = 140;
        if (speed <= 60) {
            System.out.println("Ваша скорость " + speed + " км/ч можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Ваша скорость " + speed + " км/ч придется заплатить штраф");
        }

        //Task 4

        int age2 = 34;
        if (age2 >= 2 && age2 <= 7) {
            System.out.println("Если возраст человека равен " + age2 + " лет, то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека " + age2 + " лет, то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека " + age2 + " то его место в университете");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека " + age2 + " то ему пора ходить на работу");
        }

        //Task 5
        int ageOfChild = 12;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + " то ему нельзя кататься на атракционе");
        }
        if (ageOfChild > 5 && ageOfChild <= 14) {
            System.out.println("Если возраст ребенка " + ageOfChild + " он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageOfChild > 14) {
            System.out.println("Если возратс ребенка " + " то он может кататься без сопровождения взрослого");
        }

        //Task 6
        byte totalNumberOfSeats = 102;
        byte seatingPlaces = 60;
        byte standingPlace = (byte) (totalNumberOfSeats - seatingPlaces);

        byte standingPlaceOccupied = 22;
        byte occupiedSeatsPlace = 68;
        if (standingPlaceOccupied < standingPlace) {
            System.out.println("В вагоне есть свободные стоячие места");
        }
        if (occupiedSeatsPlace < seatingPlaces) {
            System.out.println("в вагоне есть свободные сидячие места");
        }
        if (occupiedSeatsPlace >= seatingPlaces && standingPlaceOccupied >= standingPlace) {
            System.out.println("В вагоне нет свободных мест");
        }

        //Task 7
        int one = 1287260;
        int two = 12095858;
        int three = 163639;
        if (one > two && one > three) {
            System.out.println("Чило " + one + " самое большое");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        }
        if (three > one && three > two) {
            System.out.println("Число " + three + " самое большое");
        }
    }
}