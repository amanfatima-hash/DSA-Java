public class Array07_SumOfElements {
    public static void main(String[] args) {
        int numbers[]={10,20, 30, 40, 50};
        int sum = 0;
        System.out.println("Numbers are:");
        for (int i=0; i<numbers.length; i++){
      System.out.println(numbers[i]);
        sum+=numbers[i];
        }
     System.out.println("Sum are: "+sum);
    }
}
