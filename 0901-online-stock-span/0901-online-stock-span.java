import java.util.*;

class StockSpanner {

    // Each element stores:
    // [price, span]
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        // Today's span is at least 1
        int span = 1;

        // Remove all previous prices <= current price
        // and add their already-calculated spans
        while (!st.isEmpty() && st.peek()[0] <= price) {

            span += st.peek()[1];
            st.pop();
        }

        // Store current price with its total span
        st.push(new int[]{price, span});

        return span;
    }
}