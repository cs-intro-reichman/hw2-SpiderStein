public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        
        int totalHours = totalMinutes / 60;
        
        int newHours = totalHours % 24;
        
        int newMinutes = totalMinutes - (totalHours * 60);
        
        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
