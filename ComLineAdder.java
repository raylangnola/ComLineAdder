public class ComLineAdder {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.printf("%d arguments\n",args.length);
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
                count +=1;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("Total of %d integers is: %,d\n",count,sum);
    }
}