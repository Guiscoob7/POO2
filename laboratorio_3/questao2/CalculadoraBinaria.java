package laboratorio_3.questao2;

// QUESTÃO 2 (1.5 pontos) 
// Implemente o padrão estrutural Adapter em Java no contexto de uma calculadora, capaz de 
// executar operações com números binários e decimais. Para tanto, considere que já exista 
// uma calculadora binária no mercado, com as seguintes operações: 
// ● String somar(String a, String b) 
// ● String subtrair(String a, String b) 
// A calculadora que você deve construir, é capaz de: 
// ● int somar(int a, int b) 
// ● int subtrair(int a, int b) 
// ● int multiplicar(int a, int b) 
// Para demonstrar a calculadora em funcionamento, utilize uma classe Main com o método 
// main. Sua calculadora deve executar, com sucesso, operações binárias e decimais.

// Calculadora Binária existente no mercado
class CalculadoraBinaria {
    public String somar(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 + num2;
        return Integer.toBinaryString(resultado);
    }
    
    public String subtrair(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int resultado = num1 - num2;
        return Integer.toBinaryString(resultado);
    }
}