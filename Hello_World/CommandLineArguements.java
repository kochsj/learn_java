public class CommandLineArguements {
    // when we run this compiled code, we can provide arguements from the command line
    // java CommandLineArguements arg0 arg1 arg2 arg3 ...ect
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}