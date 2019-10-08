package model;

public class Calculate {
    private float firstOperand;
    private float secondOperand;
    private char operator;

    public Calculate(){

    }

    public Calculate(float firstOperand, float secondOperand, char operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public float getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(float firstOperand) {
        this.firstOperand = firstOperand;
    }

    public float getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(float secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public float calculate(){
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("Cant divided by 0");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
