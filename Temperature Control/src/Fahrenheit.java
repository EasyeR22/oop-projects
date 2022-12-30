public class Fahrenheit {
    private double temp;
    public Fahrenheit(double temp){
        this.temp = temp;
    }
    public double toCelcius(){
        return  ((temp-32)/1.8);
    }
    public double toKelvin(){
        return  (((temp-32)/1.8))+273;
    }
}
