public class PatternMatchingSwitch {

    public static void main(String[] args) {

        System.out.println();

        String dayName = "Sunday";

        String result = switch (dayName) {
            case String yash when yash.equals("Sunday") || yash.equals("Saturday") -> 
                "Today is a holiday Hurrah";
            default -> "Invalid day";
        };

        System.out.println(result);
    }
}
