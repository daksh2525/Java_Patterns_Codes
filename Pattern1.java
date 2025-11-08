package Revision;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 4;
        int row = 1;
        int star = num;
        while(row<=num){
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println("");
        }
    }
}
