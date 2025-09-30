public class ArrowStatement{

    public static void main(String[] args) {

        int day = 1;
        
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default -> "Invalid day";
        };

        System.out.println(dayName);
    }
}
