import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unit : ");
        String unit = sc.nextLine().toUpperCase();

        float result;

        if(unit.equals("F")){

            System.out.print("Fahrenheit : ");
            float fahrenheit = sc.nextFloat();

            result = (fahrenheit - 32) * 5 / 9;

            System.out.printf("%.2f Fahrenheit = %.2f Celsius", fahrenheit, result);

        }
        else if(unit.equals("C")){

            System.out.print("Celsius : ");
            float celsius = sc.nextFloat();

            result = (celsius * 9 / 5) + 32;

            System.out.printf("%.2f Celsius = %.2f Fahrenheit", celsius, result);

        }
        else {
            System.out.println("Invalid unit. Please enter 'F' for Fahrenheit or 'C' for Celsius.");
        }

        sc.close();
    }

}
