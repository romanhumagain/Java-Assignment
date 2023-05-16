package Assignment;
import java.text.DecimalFormat;

public class Exe25 {
  public static void main(String[] args) {
    double relativeHumidity = 0.75;
    double temperature = 20.0;

    double dewPoint = calculateDewPoint(relativeHumidity, temperature);

    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("Dew point: " + df.format(dewPoint) + "°C");
    

  }

  public static double calculateDewPoint(double relativeHumidity, double temperature) {
    double saturationVaporPressure = 6.112 * Math.exp((17.67 * temperature) / (temperature + 243.5));
    double actualVaporPressure = relativeHumidity * saturationVaporPressure;
    return (243.5 * Math.log(actualVaporPressure / 6.112)) / (17.67 - Math.log(actualVaporPressure / 6.112));
  }
}