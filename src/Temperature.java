public class Temperature {
  public static double F = 0;
  public static double C = 0;
  /**
   * Converts temperature from Fahrenheit to Celsius degree.
   *
   * @param fahrenheit temperature degree in Fahrenheit
   * @return temperature degree in Celsius
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    // TODO fill in code here and replace the return statement
    C = ((5*(fahrenheit - 32))/9);
    return C;
  }

  /**
   * Converts temperature from Celsius to Fahrenheit degree.
   *
   * @param celsius temperature degree in Celsius
   * @return temperature degree in Fahrenheit
   */
  public static double celsiusToFahrenheit(double celsius) {
    // TODO fill in code here and replace the return statement
    F = (9 * celsius + (32 * 5)) / 5;
    return F;
  }
}
