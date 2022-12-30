public class Kelvin {
    private double temp;
    public Kelvin(double temp){
        this.temp = temp;
    }
    public double toCelsius(){
        return temp-273;
    }
    public double toFahrenheit(){
        return temp-273 * 1.8 + 32;
    }
}
