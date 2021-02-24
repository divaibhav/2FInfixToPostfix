package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        String infix11 = "A+(B*C–(D/E^F)*G)*H";
        InfixToPostfix convertor = new InfixToPostfix();
        String postfix = convertor.infixToPostfix(infix11);
        System.out.println("postfix = " + postfix);
    }
}
