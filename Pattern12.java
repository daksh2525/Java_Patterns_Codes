package Revision;

public class Pattern12 {
    public static void main(String[] args) {
        int row = 1;
        int n = 5;
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
                if(j%2!=0){
                   System.out.print("* ");
                }
               else{
                   System.out.print("! ");
               }
               j++;
               
            }
            // next line prev
            star+=2;
            space--;
            row++;
            System.out.println("");
        }
    }
}
