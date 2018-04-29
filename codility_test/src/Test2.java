import java.util.Stack;

public class Test2 {
    //
    public static void main(String[] args) {
        //
        int[] A = {2, 2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        int result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        //
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < A.length - 1; i++) {
            //
            if (A[i] > A[i + 1]) {
                if (stack.isEmpty()) {
                    stack.push(A[i]);
                    count++;
                } else {
                    if (stack.peek() < A[i]) {
                        stack.clear();
                        stack.push(A[i]);
                        count++;
                    } else {
                        stack.push(A[i]);
                    }
                }
            } else if (A[i] < A[i + 1]) {
                if (stack.isEmpty()) {
                    stack.push(A[i]);
                    count++;
                } else {
                    if (stack.peek() > A[i]) {
                        stack.clear();
                        stack.push(A[i]);
                        count++;
                    } else {
                        stack.push(A[i]);
                    }
                }
            } else {
                if (stack.isEmpty()) {
                    stack.push(A[i]);
                    count++;
                } else {
                    stack.push(A[i]);
                }
            }

        }
        return count;
    }
}
