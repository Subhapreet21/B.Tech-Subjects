
import java.util.*;

public class JackAndSundays {

    public static int countSundays(String startDay, int N) {
        Map<String, Integer> dayMap = new HashMap<>();
        dayMap.put("Monday", 1);
        dayMap.put("Tuesday", 2);
        dayMap.put("Wednesday", 3);
        dayMap.put("Thursday", 4);
        dayMap.put("Friday", 5);
        dayMap.put("Saturday", 6);
        dayMap.put("Sunday", 7);

        // Get the numerical value of the starting day
        int start = dayMap.get(startDay);
        int sundayCount = 0;

        // Iterate over the days and count Sundays
        for (int i = 0; i < N; i++) {
            int currentDay = (start + i) % 7; // Calculate the current day
            if (currentDay == 6) { // Sunday is represented by 6
                sundayCount++;
            }
        }
        return sundayCount;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String startDay = s.nextLine(); // Input start day
        int N = s.nextInt(); // Input number of days
        int result = countSundays(startDay, N);
        System.out.println("Number of Sundays in " + N + " days: " + result);
    }
}
