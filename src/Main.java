public class Main {
    public static void main(String[] args) {

        // 1

        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5.67f;
        double f = 8.910223;
        char cage = '#';
        boolean highNum = d > b;

        // 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxers = Math.abs(boxer1 + boxer2);
        System.out.println("Масса спортсменов " + weightAllBoxers);
        Object Mass;
        Mass = Math.abs(boxer1 - boxer2);
        System.out.println("Разница в весе " + Mass);


        // 3

        int banan = 5;
        int weightBanan = 80;
        int milk = 2;
        int weightMilk = 105;
        int iceCream = 2;
        int weightIceCream = 100;
        int egg = 4;
        int weightEgg = 70;
        int allWeight = banan * weightBanan + milk * weightMilk + iceCream * weightIceCream + egg * weightEgg;
        double allWeightKg = allWeight / (double)1000;

        System.out.println("Общий вес завтрака " + allWeight + " гр");
        System.out.println("Общий вес завтрака " + allWeightKg + " кг");

        // 4

        int looseDay = 250;
        int extrmLooseDay = 500;
        int weightToLoose = 7000;
        double days = (double) weightToLoose / looseDay;
        double extrmDays = (double) weightToLoose / extrmLooseDay;
        System.out.println ((int) Math.ceil(days) + " дней, на легкой диете");
        System.out.println ((int) Math.ceil(extrmDays) + " дней, на жесткой диете");
        System.out.println ((int)  + Math.ceil((days + extrmDays) / 2) + " в среднем ");

        // 5

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        double newMasha = masha * 1.1;
        double newDenis = denis * 1.1;
        double newKristina = kristina * 1.1;

        double diffMasha = (newMasha - masha) * 12;
        double diffDenis = (newDenis - denis) * 12;
        double diffKristina = (newKristina - kristina) * 12;

        System.out.println("Маша теперь получает " + (int) newMasha + " рублей.  Годовой доход вырос на " + (int) diffMasha + " рублей");
        System.out.println("Денис теперь получает " + (int) newDenis + " рублей.  Годовой доход вырос на " + (int) diffDenis + " рублей");
        System.out.println("Кристина теперь получает " + (int) newKristina+ " рублей.  Годовой доход вырос на " + (int) diffKristina + " рублей");








    }
}