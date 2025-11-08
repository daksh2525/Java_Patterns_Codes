package Revision;

public class Pattern2 {
    public static void main(String[] args) {
        int num = 5;
        int row = 1;
        int star = 1;
        while (row<=num) {
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
