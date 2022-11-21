public class Work2 {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1");
        int comingOfAge = 18;
        if (comingOfAge >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возвраст совершеннолетия не наступил, Вам нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Задача 2");

        int personsAge = 18;
        if (personsAge >= 7 && personsAge <18) {
            System.out.println("Ребенок ходит в школу, если ему 7 лет или более.");
        } else if (personsAge >= 18 && personsAge < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет, ему 18 и более лет.");
        } else {
            System.out.println("Человек окончил универститет и теперь может идти работать.");
        }

        // Задача 3
        System.out.println("Задача 3");

        int wagonCapacity = 102; // Вместимость вагона 102 человека
        int seatingArea = 60; // Сидячие места
        int standingRoom = wagonCapacity - seatingArea; // Стоячие места

        int seatPlace = 59; // занятно сидячих мест
        int placeToStand = 42; // занято стоячих мест

        if (seatingArea > seatPlace) {
            System.out.println("В вагоне есть " + (seatingArea - seatPlace) + " сидячих мест.");
        } else {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (standingRoom > placeToStand) {
            System.out.println("В вагоне есть " + (standingRoom - placeToStand) + " стоячих мест");
        } else {
            System.out.println("В вагоне нет стоячих мест");
        }
    }
}