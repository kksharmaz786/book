import java.util.Scanner;
public class Book {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Solution[] book = new Solution[n];
            if (n==0){
                System.out.println("N/A");
            }else{
                sc.nextLine().trim();
                for (int i = 0; i < n ; i = i+1) {
                    String Bookname = sc.nextLine().trim();
                    String Authorname = sc.nextLine().trim();
                    String Isbn = sc.nextLine().trim();
                    book[i] = new Solution(Bookname,Authorname,Isbn);
                }
                for (int i = 0; i <book.length ; i++) {
                    System.out.println(book[i]);
                }
                sc.close();
            }
        }
}
