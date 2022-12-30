import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InterestingFacts intfax = new InterestingFacts();
        System.out.println("What unit do you want to convert from? ");
        System.out.println("Input 1 for Celsius, 2 for Fahrenheit, 3 for Kelvin:");
        int n = scan.nextInt();
        if(n<1 || n>3){
            System.out.println("Your input is incorrect");
        }
        if(n==1){
            System.out.println("Input your body temperature in Celsius:");
            double h = scan.nextDouble();
            Celsius celsius = new Celsius(h);
            if(h>=37 || h<=35){
                System.out.println("Your body temperature is unstable. Please, drink your medicine");
            }
            System.out.println("Your temperature in Fahrenheit is " + celsius.toFahrenheit());
            System.out.println("Your temperature in Kelvin is " + celsius.toKelvin());
            intfax.InterestingFax(n);
        }
        else if(n==2){
            System.out.println("Input your body temperature in Fahrenheit:");
            double h = scan.nextDouble();
            Fahrenheit fahrenheit = new Fahrenheit(h);
            if(h>98.6 || h<95){
                System.out.println("Your body temperature is unstable. Please, drink your medicine");
            }
            System.out.println("Your temperature in Celsius is " + fahrenheit.toCelcius());
            System.out.println("Your temperature in Kelvin is " + fahrenheit.toKelvin());
            intfax.InterestingFax(n);
        }
        else if(n==3){

            System.out.println("Input your body temperature in Kelvin:");
            double h = scan.nextDouble();
            Kelvin kelvin = new Kelvin(h);
            if(h>=310 || h<305){
                System.out.println("Your body temperature is unstable. Please, drink your medicine");
            }
            System.out.println("Your temperature in Fahrenheit is " + kelvin.toFahrenheit());
            System.out.println("Your temperature in Celsius is " + kelvin.toCelsius());
            intfax.InterestingFax(n);
        }
    }
}