import java.util.*;

public class Exer107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] expression = sc.nextLine().split(" ");
        try {
            ExpressionTree tree = new ExpressionTree(expression);
            tree.printInfix();
            System.out.println(" = " + tree.eval());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static class ExpressionTree {
        private Node root;
        private Iterator<String> iterator;

        public ExpressionTree(String[] expression) {
            iterator = Arrays.asList(expression).iterator();
            root = createPrefix();
        }

        private Node createPrefix() {
            if (!iterator.hasNext()) {
                throw new IllegalArgumentException("Invalid expression");
            }
            String value = iterator.next();
            Node node = new Node(value);
            if (isOperator(value)) {
                node.left = createPrefix();
                node.right = createPrefix();
            }
            return node;
        }

        public void printInfix() {
            printInfix(root);
        }

        private void printInfix(Node node) {
            if (node != null) {
                if (isOperator(node.value)) {
                    System.out.print("(");
                }
                printInfix(node.left);
                System.out.print(node.value);
                printInfix(node.right);
                if (isOperator(node.value)) {
                    System.out.print(")");
                }
            }
        }

        private boolean isOperator(String value) {
            return "+-*/".contains(value);
        }

        public int eval() {
            return eval(root);
        }

        private int eval(Node node) {
            if (isOperator(node.value)) {
                int left = eval(node.left);
                int right = eval(node.right);
                switch (node.value) {
                    case "+":
                        return left + right;
                    case "-":
                        return left - right;
                    case "*":
                        return left * right;
                    case "/":
                        if (right == 0) {
                            throw new IllegalArgumentException("Division by zero");
                        }
                        return left / right;
                }
            }
            return Integer.parseInt(node.value);
        }

        private class Node {
            private String value;
            private Node left;
            private Node right;

            public Node(String value) {
                this.value = value;
            }
        }
    }
}