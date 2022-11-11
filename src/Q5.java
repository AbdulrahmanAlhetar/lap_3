import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {

            int n[] = new int[3];
            String answer;
            Scanner in = new Scanner (System.in);
            System.out.println("Enter Three num");

            for (int i=0; i<3; i++) {
                System.out.print("Num #" + (i+1) + " : ");
                n[i] = in.nextInt();
            }

            answer = (n[0] == n[1] && n[0] == n[2]) ? "All the same" : (n[0] != n[1] && n[1] != n[2]) ? "All different" : "Neither" ;

            System.out.print("Answer is : " + answer);
        }

    }
