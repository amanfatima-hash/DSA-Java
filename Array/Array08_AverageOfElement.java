import  java.util.Scanner;
public class Array08_AverageOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of number.");
        int size=sc.nextInt();
        int sum =0;
        double average;
        int numbers[]=new int[size];
        System.out.println("Enter Numbers: ");
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0; i< size; i++){
            sum+=numbers[i];
        }
    average=sum/size;
    System.out.println("Average= "+average);
  sc.close();
    }
}
