package laboratorio_5.questao2;

// QUESTÃO 2 (1 ponto) Um carro possui os seguintes objetos: ● motor ● cinto de segurança ● porta ● farol ● rádio Toda vez que o carro é dirigido, o motorista deve ligar o motor, trancar as portas, travar o cinto de segurança, acender o farol, ligar o rádio e sintonizar o rádio em sua estação preferida. Para finalizar uma corrida e desligar o carro, deve-se desligar o motor, destrancar as portas, destravar o cinto de segurança, apagar o farol e desligar o rádio. Implemente o problema utilizando o padrão de projeto Fachada. Utilize o método main para demonstrar o funcionamento.

// Classe principal que demonstra o uso da Fachada para controle simplificado de um carro
public class AppCarro {
    
    public static void main(String[] args) {
        // Cria a fachada que irá gerenciar todos os subsistemas do carro
        CarroFacade carro = new CarroFacade();
        
        // Inicia todos os sistemas do carro com uma única chamada
        carro.iniciarCorrida("Estação FM 101.1");  // Passa a estação de rádio preferida
        
        System.out.println("\n--- Corrida em andamento ---\n");

        // Desliga todos os sistemas do carro com uma única chamada
        carro.finalizarCorrida();
    }
}
