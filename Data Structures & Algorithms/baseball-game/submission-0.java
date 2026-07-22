
class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {

                int first = stack.pop();
                int second = stack.peek();

                int sum = first + second;

                stack.push(first);   // Restore the top element
                stack.push(sum);

            }
            else if (op.equals("D")) {

                stack.push(stack.peek() * 2);

            }
            else if (op.equals("C")) {

                stack.pop();

            }
            else {

                stack.push(Integer.parseInt(op));

            }
        }

        int ans = 0;

        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}