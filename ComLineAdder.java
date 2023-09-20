public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.printf("%d arguments\n",args.length);
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count++;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("For %d numbers, the total of %d values is: %,d\n",args.length,count,sum);
    }
}