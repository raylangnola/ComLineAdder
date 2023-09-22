public class ComLineAdder {
    public static void main(String[] args) {
      int count = 0;
        int sum = 0;
        System.out.printf("%d arguments\n",args.length);
        for(int ndx = 0; ndx < args.length; ndx++) {
            try {
                sum += Integer.parseInt(args[ndx]);
              count += 1;
            } catch (Exception e) {
                System.out.printf("Couldn't convert %s\n",args[ndx]);
            }       
        }
        System.out.printf("Total of %d values out of %d arguements is: %,d\n",count,args.length,sum);
    }
}