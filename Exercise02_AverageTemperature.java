/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise02_AverageTemperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] temps = new double[] { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		double total;

		total = calculateTotalTemps(temps);
		calculateAverageTemperature(temps, total);

	}

	/**
	 * This method calculates the average of the temperatues based on the total and
	 * number of temperatures inputed
	 * 
	 * @param temps - array of temperatures - used to determine array length
	 * @param total - sum of all temperatures
	 */
	public static void calculateAverageTemperature(double[] temps, double total) {
		double average = total / temps.length;
		System.out.printf("Average to 2 decimal places is: %.2f%n", average);
	}

	/**
	 * This method calculates the total of the temperatures in the array
	 * 
	 * @param temps - array of temperatures
	 * @return - total of temperatures
	 */
	public static double calculateTotalTemps(double[] temps) {
		double total = 0;

		for (double number : temps) {
			total += number;
		}
		System.out.printf("Total temperatures to 2 decimal places is: %.2f%n", total);
		return total;
	}

}
