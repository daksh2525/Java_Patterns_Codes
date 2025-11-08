package Revision;

public class Pattern3 {
    public static void main(String[] args) {
        int num = 5;
        int row =  1;
        int star = num;
        while (row<=num) {
            int i = 1;
            while (i<=star) {
                 System.out.print("* ");
                 i++;
            }
            // next line prev
        star--;
        row++;
        System.out.println("");

           
        }
        
    }
}
