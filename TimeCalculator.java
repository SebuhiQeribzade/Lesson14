package TimeDifference;

public class TimeCalculator {
    private boolean isValidTime(int hour, int minute) {
    return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
}

    public void calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        if (!isValidTime(hour1, minute1) || !isValidTime(hour2, minute2)) {
            System.out.println("Invalid time format or value.");
            return;
        }

        int totalMinute1 = hour1 * 60 + minute1;
        int totalMinute2 = hour2 * 60 + minute2;
        int difference = totalMinute2 - totalMinute1;

        if (difference < 0) {
            System.out.println("Invalid time values: Negative difference.");
            return;
        }

        int hourDiff = difference / 60;
        int minuteDiff = difference % 60;

        System.out.println("There is " + hourDiff + " hour " + minuteDiff + " minutes difference.");
    }

    public void calculateDifference(String time1, String time2) {
        String[] time1Parts = time1.split(":");
        String[] time2Parts = time2.split(":");

        int hour1 = Integer.parseInt(time1Parts[0]);
        int minute1 = Integer.parseInt(time1Parts[1]);
        int hour2 = Integer.parseInt(time2Parts[0]);
        int minute2 = Integer.parseInt(time2Parts[1]);

        calculateDifference(hour1, minute1, hour2, minute2);
    }}

