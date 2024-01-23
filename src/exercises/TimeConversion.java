package exercises;

public class TimeConversion {
	
	 public static String timeConversion(String s) {
		 	// foi usado o método 'split' para criar um delimitador entre as partes do array.
	        String[] parts = s.split(":");
	        int hours = Integer.parseInt(parts[0]);
	        int minutes = Integer.parseInt(parts[1]);
	        int seconds = Integer.parseInt(parts[2].substring(0, 2));
	        String period = parts[2].substring(2);

	        if (period.equals("AM") && hours == 12) {
	            hours = 0;
	        } else if (period.equals("PM") && hours != 12) {
	            hours += 12;
	        }

	        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
