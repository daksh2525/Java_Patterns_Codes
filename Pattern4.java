package Revision;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;
        while (row<=n) {
           int i = 1;
           while (i<=space) {
             System.out.print("  ");
              i++;
           }
           int j = 1;
           while (j<=star) {
             System.out.print("* ");
             j++;
           }
           // next line prev
           space--;
           star++;
           row++;
           System.out.println("");

        }
    }
}
