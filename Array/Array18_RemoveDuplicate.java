public class Array18_RemoveDuplicate {
    public static void main(String[] args) {
        int numbers[]={34 , 89 , 35 , 34 , 35};
        System.out.println("Numbers are:");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Array after removing duplicates: ");
        for(int i=0; i<numbers.length; i++){
            boolean duplicate=false;
            for(int j=0; j<i; j++){
                if(numbers[i] ==  numbers[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                System.out.println(numbers[i]);
            }
        }
    }
}
