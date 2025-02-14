/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @Daniel Kissi <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    private static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        for (int i = 0; i < numOfTimesToRepeat; i++) {
            result += s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += repeat("*", i) + "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += repeat(" ", height - i) + repeat("*", i) + "\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        for (int y = radius - 1; y >= -radius + 1; y--) {
            int x = (int) Math.sqrt(radius * radius - y * y);
            str += repeat(" ", radius - x) + repeat("*", 2 * x) + "\n";
        }
        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;
        for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(long number){
        return sumOfDivisors(number) == number;
    }

    public static boolean isPrime(long number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }



    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        long i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}