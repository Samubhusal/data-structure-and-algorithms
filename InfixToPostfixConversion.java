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

        //3.Loop through every character inthe infix expression 
        for(int i=0 ;i<infixExpression.length();i++){
            char token=infixExpression.charAt(i);
        }

        //Ignore any blank spaces
        if(Character.isWhitespace(token)){
            continue;
        }

        //Case 1:The token is an operand (Letter or Digit)
        if(Character.isLetterOrDigit(token)){
            //If it is a number or a variable ,just add it directly to the postfix result
            postfixResult.append(token);
        }

        //Case 2:The token is opening paranthesis

        else if(token=='('){
            //Push '(' on to the stack.
            operatorStack.push(token);
        }

        //Case 3:The token is closing paranthesis')
        else if(token == ')'){
            //pop operators from the stack and append to the postfix result 
            // until the matching ')' is found

            while(!operatorStack.isEmpty() && operatorStack.peek()!='('){
                postfixResult.append(operatorStack.pop());
            }
            //if the stack is empty,discard/remove'('
            if(operatorStack.isEmpty() && operatorStack.peek()=='('){
            operatorStack.pop();
            }
        }

        //CASE 4:the token is an operator (+,-,*,/)
        else{
            //While the stack is not empty AND the top operator has 
            //greater or equal precendence then the current token:

            while(!operatorStack.isEmpty()&&
            getPrecedence(operatorStack.peek())>=getPrecedence(token)){
                //Crucial check: Don't push the opening paranthesis '('
                //it belongs to case 3

                if(operatorStack.peek() =='('){
                    break;
                }

                //pop the higher precendence operator and push it to the result

                postfixResult.append(operatorStack);
            }

            //Now,push the current operator on to the stack 
            operatorStack.push(token);
        }
        
    }
}
/**
 * Determines the precedence of an operator
 * @param op The operator character
 * @return An integer representing the precedence  
 */