public class YieldSwitch{

    public static void main(String[] args) {
        
        System.out.println();

        String dayName = "Sunday";
        String Result = switch (dayName){
            case "Sunday","Saturday":
                yield "Today is holiday Hurrah ";
            default:
             yield "Invalid day ";

        };

        System.out.println(Result);
    }
}
