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

// Adapter para usar a CalculadoraBinaria implementando a interface Calculadora
class CalculadoraAdapter implements Calculadora {
    private CalculadoraBinaria calculadoraBinaria;
    
    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }
    
    @Override
    public int somar(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultado = calculadoraBinaria.somar(binA, binB);
        return Integer.parseInt(resultado, 2);
    }
    
    @Override
    public int subtrair(int a, int b) {
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resultado = calculadoraBinaria.subtrair(binA, binB);
        return Integer.parseInt(resultado, 2);
    }
    
    @Override
    public int multiplicar(int a, int b) {
        // Implementação da multiplicação usando somas sucessivas com a calculadora binária
        if (b < 0) {
            // Se b for negativo, multiplicamos a por -b e depois negamos o resultado
            return -multiplicar(a, -b);
        }
        
        int resultado = 0;
        
        for (int i = 0; i < b; i++) {
            resultado = this.somar(resultado, a);
        }
        
        return resultado;
    }
    
    // Métodos adicionais para operações binárias diretas
    public String somarBinario(String a, String b) {
        return calculadoraBinaria.somar(a, b);
    }
    
    public String subtrairBinario(String a, String b) {
        return calculadoraBinaria.subtrair(a, b);
    }
    
    public String multiplicarBinario(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int resultado = multiplicar(numA, numB);
        return Integer.toBinaryString(resultado);
    }
}