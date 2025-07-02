package tech504Sam;

public class FilmClassification {

    public static String getClassificationsByAge(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 1 || ageOfViewer > 999) {
            result = "Error: Please enter a valid age.";
        }
        else if (ageOfViewer < 12) {
            result = "U and PG films are available.";
        }
        else if (ageOfViewer < 15) {
            result = "U, PG, 12, and 12A films are available.";
        }
        else if (ageOfViewer < 18){
            result = "U, PG, 12, 12A, and 15 films are available.";
        }
        else {
            result = "All films are available.";
        }
        return result;
    }
}