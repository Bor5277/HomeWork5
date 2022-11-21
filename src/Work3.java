public class Work3 {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int personsAge = 18;

        if (personsAge >= 2 && personsAge <= 6) {
            System.out.println("Есди возвраст человека равен " + personsAge + " то ему нужно ходить в детский сад");
        } else if (personsAge >= 7 && personsAge < 18) {
            System.out.println("Есди возвраст человека равен " + personsAge + " то ему нужно ходить в школу");
        } else if (personsAge >= 18 && personsAge < 24) {
            System.out.println("Есди возвраст человека равен " + personsAge + " то ему нужно ходить в университет");
        } else if (personsAge >= 24) {
            System.out.println("Есди возвраст человека равен " + personsAge + " то ему нужно ходить на работу");
        }

        // Задача 2
        System.out.println("Задача 2");
        int childsAge = 14;
        if (childsAge <= 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (childsAge < 14) {
            System.out.println("Ребенок может кататься на аттракционе, только в сопровождении взрослого. Если взрослого нет то кататься нельзя");
        } else if (childsAge >= 14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 3
        System.out.println("Задача 3");
        int one = 105;
        int two = 90;
        int three = 101;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three)
                System.out.println("Максимальное число " + one);

        }

    }


}


