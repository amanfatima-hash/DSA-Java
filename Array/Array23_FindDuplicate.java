public class Array23_FindDuplicate {
    public static void main(String[] args) {
        int[] numbers={10 , 20 , 30, 40 , 20 , 40};
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println("Duplicate element = " +numbers[i]);
                }
            }
        }
    }
}
