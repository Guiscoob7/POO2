package laboratorio_5.questao2;

// QUESTÃO 2 (1 ponto) Um carro possui os seguintes objetos: ● motor ● cinto de segurança ● porta ● farol ● rádio Toda vez que o carro é dirigido, o motorista deve ligar o motor, trancar as portas, travar o cinto de segurança, acender o farol, ligar o rádio e sintonizar o rádio em sua estação preferida. Para finalizar uma corrida e desligar o carro, deve-se desligar o motor, destrancar as portas, destravar o cinto de segurança, apagar o farol e desligar o rádio. Implemente o problema utilizando o padrão de projeto Fachada. Utilize o método main para demonstrar o funcionamento.

// Subsistema que controla o cinto de segurança do carro
class CintoDeSeguranca {
    
    // Trava o cinto de segurança (acionado ao iniciar a corrida)
    public void travar() {
        System.out.println("Cinto de segurança travado.");
    }
    
    // Destrava o cinto de segurança (acionado ao finalizar a corrida)
    public void destravar() {
        System.out.println("Cinto de segurança destravado.");
    }
}