public class Test1 {
    //
     static final int HEAD = 0;
     static final int TAIL = 1;

    public static void main(String[] args) {
        //
        int[] a = {1, 0, 0, 1, 0, 0};
        int result = solution(a);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        //
        int headCount = 0;
        int tailCount = 0;
        for (int i : A) {
            if (i == HEAD) headCount++;
            else tailCount++;
        }

        System.out.println(headCount + ", " + tailCount);

        if (headCount < tailCount) return headCount;
        else return tailCount;
    }
}
