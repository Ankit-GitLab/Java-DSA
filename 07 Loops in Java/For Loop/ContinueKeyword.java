public class ContinueKeyword {
   public static void main(String[] args) {
    

      for(int num = 1; num <= 50; num++){
        if(num % 3 == 0){
            continue; // skip
        }
        System.out.print(num+" ");
      }
   } 
}
