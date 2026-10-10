public class Array19_CheckSorted {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        boolean sorted=true;
        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not sorted.");
        }
    }
}
