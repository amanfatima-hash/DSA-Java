public class Array20_LeftRotate {
    public static void main(String[] args) {
        int[] numbers={10 , 20  ,30 , 40 , 50};
        int first= numbers[0];
       for(int i=0; i<numbers.length-1; i++){
        numbers[i]=numbers[i+1];
       }
       numbers[numbers.length-1]=first;
       System.out.println("Left Rotated Array:");
       for (int i=0; i<numbers.length; i++){
        System.out.println(numbers[i]);
       }
    }
}
