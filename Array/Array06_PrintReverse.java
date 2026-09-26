public class Array06_PrintReverse {
    public static void main(String[] args) {
        int numbers[]={ 2 , 4 , 6 , 8 , 10};
        System.out.println("Numbers");
        for(int i=0 ; i<numbers.length ; i++){
        System.out.println(numbers[i]);
        }
        System.out.println("Reverse Number");
        for(int j=numbers.length-1; j>=0; j--){
            System.out.println(numbers[j]);
        }
    }
}
