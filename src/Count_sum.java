import static java.lang.System.in;
public class Count_sum {
    private  String expr;
    private long result;
    public Count_sum(String expr) {
        if (expr == null) {
            this.expr = "";
        } else {
            this.expr = expr.replaceAll("\\s+", "");
        }
        this.result = evaluate();
    }
    public long getResult(){return result;}
    public String getExpr(){return expr;}
    public long evaluate(){
    String s = expr;
    int n = s.length();
    int i = 0;
    long sum = 0;
    long term;
    long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
        num = num * 10 + (s.charAt(i) - '0');
        i++;
    }
    term = num;

        while (i < n) {
        char op = s.charAt(i++);
        num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        switch (op) {
            case '*':
                term *= num;
                break;
            case '+':
                sum += term;
                term = num;
                break;
            case '-':
                sum += term;
                term = -num;
                break;
            default:
                return 0;
        }
    }

        return sum + term;
}
@Override
public String toString() {
    return expr + " = " + result;
}
}


