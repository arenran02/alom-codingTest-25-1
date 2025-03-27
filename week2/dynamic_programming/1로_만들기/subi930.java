import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.min;

public class subi930 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] D = new int[N+1];

        for(int i = 2;i < N+1;i++){
            D[i] = D[i-1]+1;
            if(i%2==0) D[i] = min(D[i], D[i / 2] + 1);
            if(i%3==0) D[i] = min(D[i], D[i / 3] + 1);
        }

        System.out.println(D[N]);
    }
}