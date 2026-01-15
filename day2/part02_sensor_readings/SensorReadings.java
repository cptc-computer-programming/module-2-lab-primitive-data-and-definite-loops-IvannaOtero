package day2.part02_sensor_readings;

public class SensorReadings {

    public static void main(String[] args) {

        // Scenario: A sensor reports every 5 minutes for 1 hour.
        // Minutes: 0, 5, 10, ..., 60

        // TODO:
        // A sensor reports data every 5 minutes for 1 hour (minutes 0 through 60).
        for (int minute = 0; minute <= 60; minute +=5)
            int value = (minute / 5) * 2;  
            System.out.println("Minute: " + minute + "Value: " + value); 

        // Use a for loop with a step size of 5 to iterate over the minute marks.
        // At each minute, compute a value equal to (minute / 5) * 2,
        // then print the minute and the computed value.

        
        

    }
    
}
