import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/13422
 */
public class no13422 {
    //
    public static void main(String[] args) throws IOException {
        //
        int T;  // 테스트케이스 개수
        int N;   // 총 집의 개수
        int M;   // 연속된 집의 개수
        int K;   // 방범 장치 최소 돈의 양
        List<Integer> houses; //집의 순서
        int sum;    // 연속된 집의 돈의 합계
        int count;  // 훔칠수 있는 경우의 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            //
            count = 0;


            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            houses = new ArrayList<>(N);

            for (int i = 0; i < N; i++) {
                houses.add(Integer.parseInt(st.nextToken()));
            }

            for (int i = 0; i < N; i++) {
                sum = 0;
                for (int j = i; j < i + M; j++) {
                    sum += houses.get(j);
                }
                count += sum < K ? 1 : 0;

            }

            System.out.println("경우의 수 : " + count);
        }


    }
}
