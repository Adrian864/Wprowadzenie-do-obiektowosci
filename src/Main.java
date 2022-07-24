import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Car audi = new Car("Czerwony", 5, "A4", false);
        System.out.println(audi.getgearbox());
        audi.setGearbox(true);
        System.out.println(audi.getgearbox());
        System.out.println(audi.getkolor());
        audi.setKolor("Niebieski");
        System.out.println(audi.getkolor());
        System.out.println(audi.getnumberDoor());
        audi.setNumberDoor(4);
        System.out.println(audi.getnumberDoor());
        System.out.println(audi.getmarka());
        audi.setMarka("M3");
        System.out.println(audi.getmarka());

        Kalkulator calc = new Kalkulator();
        calc.add(5,2);
        System.out.println(calc.add(5,2));
        */
        /*
        System.out.println("Podaj a:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Podaj b:");
        int b = scanner.nextInt();
        Kalkulator calc = new Kalkulator();
        System.out.println(calc.add(a,b));
         */
        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą cyfrę:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = scanner.nextInt();
        System.out.println("Podaj jaką operację chcesz wykonać wpisująć + - *");
        String znak = scanner.next();
        switch (znak){
            case "+":
                System.out.println(calc.add(a,b));
        }
        switch (znak){
            case "-":
                System.out.println(calc.ode(a,b));
        }
        switch (znak){
            case "*":
                System.out.println(calc.mno(a,b));
        }
    }
}
