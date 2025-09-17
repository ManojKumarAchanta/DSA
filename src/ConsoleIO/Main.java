package ConsoleIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
//        System.out.println("Enter a number: ");
//        int num =System.in.read();
////        System.out.println( num - 48);
//
//        InputStreamReader isr = new InputStreamReader(System.in);
//        //BufferedReader
//        BufferedReader br = new BufferedReader(isr);
        //buffered reader can be used to read String
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        System.out.println(x);
        int i = 0;
        int j = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            j = 18 / i;
        }
        //when ever you want to close a resource then we use finally
        finally {
//            System.out.println("bye");
            assert br != null;
            br.close();
        }

        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in));){

            int num = Integer.parseInt(br.readLine());
            j = 18 / i;
        }
    }
}
