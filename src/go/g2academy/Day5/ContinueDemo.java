package go.g2academy.Day5;

public class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            //interested only in p's
            if (searchMe.charAt(i) != 'p'){
                continue;
            }

            //process p's
            numPs++; //numPs = numPs + 1
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}