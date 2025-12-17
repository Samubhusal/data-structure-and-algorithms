import java.uilt.Scanner;
public class InfixToPostfixConversion{
    private static int getPrecedence(char op){
        switch (op){
            case'+':
            case'-':
             return 1;//Lowest precedence :Addition and Subtraction

            case'*':
            case'/':
             return 2;//Medium precedence :Multiplication and Division

            case'^':
            case'$':
             return 3;//Highest precedence :Exponentiation and Dollar sign
            default:
                return 0;//Everthing else like paranthesis
        }
    }
    public static String convertToPostfix(String infixExpression){
        //1.Create a StringBuilder to build the final postfix expression
        StringBuilder postfixResult=new StringBuilder();

        //2.Create a stack to hold operators and paranthesis
        Stack<Character> operatorStack =new Stack<>();

    }
}
/**
 * Determines the precedence of an operator
 * @param op The operator character
 * @return An integer representing the precedence  
 */