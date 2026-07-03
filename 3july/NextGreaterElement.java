import java.util.*;

class NextGreaterElement {

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> at = new ArrayList<>();

        int n = arr.length;

        st.push(n - 1);
        at.add(-1);

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                at.add(-1);
            } else {
                at.add(arr[st.peek()]);
            }

            st.push(i);
        }

        Collections.reverse(at);
        return at;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = nextLargerElement(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}