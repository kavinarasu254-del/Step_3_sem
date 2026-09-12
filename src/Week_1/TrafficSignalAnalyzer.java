package Week_1;

public class TrafficSignalAnalyzer {

    public void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;

        char maxChar = signalLog.charAt(0);
        int maxStreak = 1;
        char currentChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                maxChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + maxChar + "' repeated " + maxStreak + " times");
    }

    public static void main(String[] args) {
        TrafficSignalAnalyzer analyzer = new TrafficSignalAnalyzer();

        analyzer.findLongestStreak("RRGGGYRR");
        analyzer.findLongestStreak("RRRRYYGG");
    }
}