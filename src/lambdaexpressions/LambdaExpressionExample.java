package lambdaexpressions;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a+b;
        Calculator subtraction = (a, b) -> a-b;
        Calculator multiplication = (a, b) -> a*b;
        Calculator division = (a, b) -> a/b;

        System.out.println("ADD : " + addition.operate(10, 5));
        System.out.println("SUB : " + subtraction.operate(10, 5));
        System.out.println("MUL : " + multiplication.operate(10, 5));
        System.out.println("DIV : " + division.operate(10, 5));

    }
}

//Any interface with only a single abstract body can be called as functional interface
//Lambda Expressions ->
//less code
//Improves code readability
//functional programming
