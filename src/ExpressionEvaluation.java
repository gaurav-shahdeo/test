import java.util.Stack;

public class ExpressionEvaluation {

    public static void main(String args[]) {
        // String to evaluate
        String expr = "1+2-3/1";
        int result = evaluateExpression(expr);

    }

    private static int evaluateExpression(String expr) {

        Stack<Character> operators = new Stack<>();
        Stack<Integer> values = new Stack<>();

        for(int i = 0; i < expr.length(); i++) {
            Character curChar = expr.charAt(i);
            if(isOperator(curChar)) {
                operators.push(curChar);
            } else {
                values.push(Integer.parseInt("" + curChar));
            }
        }
        System.out.println(operators + "  " + values);

        return 0;
    }

    private static boolean isOperator(Character curChar) {
        switch(curChar) {
            case '+' :
            case '-' :
            case '*' :
            case '/' : return true;
            default: return false;
        }
    }
}
