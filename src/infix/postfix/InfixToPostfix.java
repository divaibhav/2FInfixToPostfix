package infix.postfix;

import java.util.Stack;

public class InfixToPostfix {
    public String infixToPostfix(String infixString){
        String postfix = "";
               
        return postfix;
    }
    private boolean isOperator(char character){
        boolean response = false;
        switch (character){
            case '^':
            case '/':
            case '*':
            case '+':
            case '-':
                response = true;
        }

        return response;
    }
    private int precedence(char operator){
        int response = 0;
        switch (operator) {
            case '^':
                response = 3;
                break;
            case '/':
            case '*':
                response = 2;
                break;
            case '+':
            case '-':
                response = 1;
        }

        return response;
    }
}
