package sayan.tasks;

public class AverageTask {
    public static Double avg(String number) {
        double average = 0;
        if (number == null || number.isEmpty()) {
            return null;
        }
        String[] index = number.split(" ");
        for (int a = 0; a < index.length; a++) {
            double numb;
            try {
                numb = Double.parseDouble(index[a]);
            } catch (NumberFormatException e) {
                return 0.0;
            }
            average += numb;
        }
        return average / index.length;
    }
}