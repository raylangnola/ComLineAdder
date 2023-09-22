public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.printf("%d arguments\n",args.length);
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                count = count + 1;
                sum += Integer.parseInt(args[ndx]);
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("Total of %d values is: %,d\n",args.length,sum);
        System.out.printf("Using a count I found that there were %d numbers without using the length method",count);
    }
}