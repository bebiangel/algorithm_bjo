import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    //
    public static void main(String[] args) {
        //
        int[] A = {0, 3, 7, 5, 4, 11, 1};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        //
        ArrayList<Integer> map = new ArrayList<>(A.length);
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) return 0;
                if (A[i] < A[j]) {
                    for (int k : A) {
                        if (k > A[i] && k < A[j]) {
                            System.out.println(k + ", " + A[i] + ", " + A[j]);
                            map.add(Math.abs(A[i] - A[j]));
                        }
                    }
                } else {
                    for (int k : A) {
                        if (k < A[i] && k > A[j]) {
                            map.add(Math.abs(A[i] - A[j]));
                        }
                    }
                }
            }
        }

        System.out.println(map);
        Collections.sort(map);

        return map.get(0);
    }

}
