package org.example;

public class VerifyParenthesis {
    public static boolean checkParenthesis(String parenthesis) {
        int closeBracketCount = 0;
        int openBracketCount = 0;
        for (int i = 0; i < parenthesis.length(); i++) {
            if (closeBracketCount > openBracketCount) {
                System.out.println("works till here");
                return false;

            }
            if (parenthesis.charAt(i) == '(') {
                openBracketCount++;
            }
            if (parenthesis.charAt(i) == ')') {
                closeBracketCount++;
            }

        }

        if (openBracketCount != closeBracketCount) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String parenthesis = "((())()";
        boolean res = checkParenthesis(parenthesis);
        System.out.println(res);
    }
}
