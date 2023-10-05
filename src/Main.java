import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //asks for user prompt, declares scanners and sets up gui through a reusable method
        System.out.println("Enter a starting of string:");
        Scanner s = new Scanner(System.in);
        String modString = s.next();
        String mod;
        String mod2;
        gui();

        //user chooses "StringWorkshop" option
        int option = s.nextInt();

        //concat desired string through string-returning method, displays and reprints gui
        while (option == 1) {

            mod = s.next();
            modString = addContent(modString, mod);

            System.out.println("Current string: " + modString);

            gui();
            option = s.nextInt();
        }

        //shows boolean truth value to containing substring through bool-returning method + ibid
        while (option == 2) {

            mod = s.next();

            System.out.println("Contains substring?: " + checkSubstring(modString, mod));

            gui();
            option = s.nextInt();
        }

        //prints length through length-checking method + ibid
        while (option == 3) {
            System.out.println("Length: " + outputLength(modString));

            gui();
            option = s.nextInt();
        }

        //prints substring of string after prefix after taking it as an input + ibid
        while (option == 4) {

            System.out.println("Prefix: ");
            mod = s.next();

            System.out.println(afterPrefixOutput(modString, mod));

            gui();
            option = s.nextInt();
        }

        //prints substring of string before suffix after taking it as an input + ibid
        while (option == 5) {

            System.out.println("Suffix: ");
            mod = s.next();

            System.out.println(beforeSuffixOutput(modString, mod));

            gui();
            option = s.nextInt();
        }

        //prints between prefix and suffix + ibid
        while (option == 6) {

            System.out.println("Prefix: ");
            mod = s.next();

            System.out.println("Suffix: ");
            mod2 = s.next();

            System.out.println(betweenOutput(modString, mod, mod2));

            gui();
            option = s.nextInt();
        }

        //just prints exit text
        while (option == 7) {

            System.out.println("Exiting...");
        }
    }

    public static void gui() {

        System.out.println();
        System.out.println("Pick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains substring");
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");
        System.out.println();
    }

    public static String addContent(String s, String m) {

        s = s.concat(m);
        return s;
    }

    public static boolean checkSubstring(String s, String m) {

        if (s.contains(m)) {
            return true;
        }

        return false;
    }

    public static int outputLength(String s) {

        return s.length();
    }

    public static String afterPrefixOutput(String s, String m)
    {
        return s.substring(s.indexOf(m)+m.length());
    }

    public static String beforeSuffixOutput(String s, String m) {

        return s.substring(0, s.indexOf(m));
    }

    public static String betweenOutput(String s, String m, String m2) {

        return s.substring(s.indexOf(m)+m.length(), s.indexOf(m2));
    }
}