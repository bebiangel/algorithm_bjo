import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Task description
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(log(N));
 * expected worst-case space complexity is O(1).
 * Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 */
public class Binary {
    //
    public static void main(String[] args) throws IOException {
        //
        ArrayList<Integer> binary = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int length = 0;

        while (n > 0) {
            binary.add(n % 2);
            n /= 2;
        }
        System.out.println(binary);

        int count = 0;
        ArrayList<Integer> counts = new ArrayList<>();


        for (int i = 0; i < binary.size() - 1; i++) {
            //
            if (binary.get(i) == 1) {
                counts.add(count);
                count = 1;
            } else {
                count++;
            }
        }

        Collections.reverse(counts);
        int number = counts.get(0);
        System.out.println(counts);
    }
}
