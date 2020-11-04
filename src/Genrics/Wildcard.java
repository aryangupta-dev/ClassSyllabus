/*   Created by IntelliJ IDEA.
 *   Author: Aryan gupta (ag2602)
 *   Date: 11/4/2020
 *   Time: 11:20 PM
 *   File: Wildcard.java
 */

package Genrics;

public class Wildcard<Type extends Number> {
    private Type[] numbers;

    public Wildcard(Type[] numbers) {
        this.numbers = numbers;
    }

    public Type[] getNumbers() {
        return numbers.clone();
    }

    public void setNumbers(Type[] numbers) {
        this.numbers = numbers;
    }

    public Double calculateAverage() {
        double sum = 0.0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index].doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean comapareAverage(Wildcard<? extends Number> numbers) {
        return this.calculateAverage() == numbers.calculateAverage();
    }
}
