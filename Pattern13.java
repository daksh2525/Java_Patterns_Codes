package Revision;

public class Pattern13 {
   public static void main(String[] args) {
    int row = 1;
    int n = 5;
    int star = 1;
    while (row<=n) {
        int i = 1;
        while (i<=star) {
            System.out.print("* ");
            i++;
        }
        // next line prev
        row++;
        star++;
       System.out.println("");
    }
   }
}
