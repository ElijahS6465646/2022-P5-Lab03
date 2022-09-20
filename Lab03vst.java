public class Lab03vst {
    public static void main(String[] args){
        int startingValue = 100000123;
        int hours = startingValue / 36000000;
        int minutes = 2800/60;
        int seconds = 2800 % 60;
        int milliSeconds = startingValue / 810000;
        System.out.println("Lab03, 100 Point Version\n");
        System.out.println("Starting milli-seconds:\t " + startingValue);
        System.out.println("Hours:     \t\t\t\t " + hours);
        System.out.println("Minutes:      \t\t\t " + minutes);
        System.out.println("Seconds:                 " + seconds);
        System.out.println("Milli-seconds:           " + milliSeconds);

    }
}
