package t03ControlFlow;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return temp < 15 ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums) {
        if (nums.length != 0) {
            double sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum / nums.length;
        }
        else throw new IllegalArgumentException();
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age) {
        if (age >= 0 && age <= 999) {
            String ticketType = "";
            if (age < 5) {
                ticketType = "Free";
            }
            else if (age < 13) {
                ticketType = "Child";
            }
            else if (age < 18) {
                ticketType = "Student";
            } else if (age < 60) {
                ticketType = "Standard";
            }
            else ticketType = "OAP";
            return ticketType;

        }
        else throw new IllegalArgumentException();
    }

    // Question 4
    public static String grade(int mark)
    {
        var grade = "";
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException();
        }
        else if (mark >= 40) {
            grade = "Pass";
            if (mark >= 60) {
                if (mark >= 75) {
                    grade = grade + " with Distinction";
                }
                else {
                    grade = grade + " with Merit";
                }
            }
        }
        else {
            grade = "Fail";
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel)
    {
        int maxAttendance;
        switch (covidLevel) {
            case 4:
                maxAttendance = 20;
                break;
            case 3, 2:
                maxAttendance = 50;
                break;
            case 1:
                maxAttendance = 100;
                break;
            case 0:
                maxAttendance = 200;
                break;
            default:
                throw new IllegalArgumentException("Invalid covidLevel");
        }
        return maxAttendance;
    }
}
