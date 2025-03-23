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

// Classe para demonstrar o funcionamento
public class AppCalculadora {
    public static void main(String[] args) {
        System.out.println("=== Demonstração do Padrão Adapter para Calculadora ===");
        
        // Criando instâncias
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();
        CalculadoraAdapter calculadora = new CalculadoraAdapter(calculadoraBinaria);
        
        // Testes com números decimais
        System.out.println("\n--- Operações Decimais (via Adapter) ---");
        int a = 10;
        int b = 5;
        
        System.out.println(a + " + " + b + " = " + calculadora.somar(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.subtrair(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiplicar(a, b));
        
        // Testes com números binários
        System.out.println("\n--- Operações Binárias (via Adapter) ---");
        String binA = "1010"; // 10 em binário
        String binB = "0101"; // 5 em binário
        
        System.out.println("Binário: " + binA + " + " + binB + " = " + calculadora.somarBinario(binA, binB));
        System.out.println("Decimal: " + Integer.parseInt(binA, 2) + " + " + Integer.parseInt(binB, 2) + 
                          " = " + Integer.parseInt(calculadora.somarBinario(binA, binB), 2));
        
        System.out.println("Binário: " + binA + " - " + binB + " = " + calculadora.subtrairBinario(binA, binB));
        System.out.println("Decimal: " + Integer.parseInt(binA, 2) + " - " + Integer.parseInt(binB, 2) + 
                          " = " + Integer.parseInt(calculadora.subtrairBinario(binA, binB), 2));
        
        System.out.println("Binário: " + binA + " * " + binB + " = " + calculadora.multiplicarBinario(binA, binB));
        System.out.println("Decimal: " + Integer.parseInt(binA, 2) + " * " + Integer.parseInt(binB, 2) + 
                          " = " + Integer.parseInt(calculadora.multiplicarBinario(binA, binB), 2));
        
        // Exemplos adicionais
        System.out.println("\n--- Exemplos Adicionais ---");
        int c = 15;
        int d = 7;
        String binC = "1111"; // 15 em binário
        String binD = "0111"; // 7 em binário
        
        System.out.println("Decimal: " + c + " + " + d + " = " + calculadora.somar(c, d));
        System.out.println("Binário: " + binC + " + " + binD + " = " + calculadora.somarBinario(binC, binD));
        
        System.out.println("Decimal: " + c + " - " + d + " = " + calculadora.subtrair(c, d));
        System.out.println("Binário: " + binC + " - " + binD + " = " + calculadora.subtrairBinario(binC, binD));
        
        System.out.println("Decimal: " + c + " * " + d + " = " + calculadora.multiplicar(c, d));
        System.out.println("Binário: " + binC + " * " + binD + " = " + calculadora.multiplicarBinario(binC, binD));
    }
}
