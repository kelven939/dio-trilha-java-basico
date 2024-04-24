public class OperadoresJava {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // Operadores relacionais
        boolean maiorQue = a > b;
        boolean menorQue = a < b;
        boolean igual = a == b;
        boolean diferente = a != b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;

        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);

        // Operadores lógicos
        boolean x = true;
        boolean y = false;
        boolean resultadoE = x && y;
        boolean resultadoOU = x || y;
        boolean resultadoNao = !x;

        System.out.println("Resultado do E lógico: " + resultadoE);
        System.out.println("Resultado do OU lógico: " + resultadoOU);
        System.out.println("Resultado do NÃO lógico: " + resultadoNao);
    }
}