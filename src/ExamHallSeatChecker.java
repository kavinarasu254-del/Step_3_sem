public class ExamHallSeatChecker {

    public void checkDuplicateSeats(int[] seatNumbers) {
        boolean hasDuplicate = false;
        boolean[] printed = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (printed[i]) continue;
            boolean isDup = false;

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDup = true;
                    printed[j] = true;
                }
            }

            if (isDup) {
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                hasDuplicate = true;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        ExamHallSeatChecker checker = new ExamHallSeatChecker();

        int[] hallOne = {101, 102, 103, 102, 105};
        checker.checkDuplicateSeats(hallOne);

        int[] hallTwo = {101, 102, 103, 104, 105};
        checker.checkDuplicateSeats(hallTwo);
    }
}
