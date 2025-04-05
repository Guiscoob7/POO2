package laboratorio_5.questao2;

// QUESTÃO 2 (1 ponto) Um carro possui os seguintes objetos: ● motor ● cinto de segurança ● porta ● farol ● rádio Toda vez que o carro é dirigido, o motorista deve ligar o motor, trancar as portas, travar o cinto de segurança, acender o farol, ligar o rádio e sintonizar o rádio em sua estação preferida. Para finalizar uma corrida e desligar o carro, deve-se desligar o motor, destrancar as portas, destravar o cinto de segurança, apagar o farol e desligar o rádio. Implemente o problema utilizando o padrão de projeto Fachada. Utilize o método main para demonstrar o funcionamento.

// Subsistema que controla o rádio do veículo
public class Radio {
    
    // Liga o sistema de áudio do carro
    public void ligar() {
        System.out.println("Rádio ligado.");
    }
    
    // Sintoniza uma estação de rádio específica
    // @param estacao - Nome/frequência da estação a ser sintonizada
    public void sintonizar(String estacao) {
        System.out.println("Rádio sintonizado na estação: " + estacao);
    }

    // Desliga completamente o sistema de áudio
    public void desligar() {
        System.out.println("Rádio desligado.");
    }
}
