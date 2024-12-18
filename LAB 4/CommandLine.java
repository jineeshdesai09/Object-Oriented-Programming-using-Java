public class CommandLine{
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Error: No arguments provided.");
            System.exit(1);
        }

        // Iterate through arguments
        for (String arg : args) {
            // Check if the first character is an uppercase letter
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                System.exit(1);
            }
        }

        System.out.println("All arguments are valid.");
    }
}
