public  class Array17_SecondLargest {
public static void main(String args[]){
    int[] numbers={10,57,28,98,23};
    int largest=numbers[0];
    int secondLargest=numbers[0];
    for(int i=1 ; i<numbers.length; i++){
        if(numbers[i] > largest){
            secondLargest=largest;
            largest=numbers[i];
        }else if (numbers[i] > secondLargest && numbers[i] != largest){
            secondLargest=numbers[i];
        }
    }
    System.out.println("Largest = " +largest);
    System.out.println("Second Largest = " + secondLargest);
}
    
}