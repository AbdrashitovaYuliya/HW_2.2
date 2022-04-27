public class Main {
    public static void main(String[] args) {

        int original = 500;
        int add = 1200;
        int current = original + add;
        boolean addBonus = add > 1000;


        if (addBonus) {

            int bonus = add / 100;
            int amount = bonus + current;
            System.out.println("Итоговый счет " + amount + " руб.");

        } else {

            System.out.println("Итоговый счет " + current + " руб.");
        }
    }
    }