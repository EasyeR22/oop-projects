public class Celsius {
    private double temp;
    public Celsius(double temp){
        this.temp = temp;
    }
    public double toFahrenheit(){
        return   ((temp * 1.8) + 32);
    }
    public double toKelvin(){
        return  (temp + 273);
    }
}
