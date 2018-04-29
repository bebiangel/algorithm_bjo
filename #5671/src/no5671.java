import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 호텔방 번호 문제
 * https://www.acmicpc.net/problem/5671
 */
public class no5671 {
    //
    public static void main(String[] args) throws IOException {
        //
        int N;
        int M;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = N; i < M; i++) {
            //
            if (i < 10) {
                count++;
            } else {
                count += isDuplicate(i) ? 0 : 1;
            }
        }

        System.out.println("방의 개수 : " + count);
    }

    public static boolean isDuplicate(int number) {
        //
        boolean duplicate = false;
        List<Integer> array = new ArrayList<>();
        while (number > 0) {
            array.add(number % 10);
            number /= 10;
        }
        Collections.sort(array);

        for (int i = 0; i < array.size() - 1; i++) {
            duplicate = array.get(i).equals(array.get(i + 1));
        }

        return duplicate;
    }
}