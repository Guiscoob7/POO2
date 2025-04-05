package laboratorio_5.questao2;

// QUESTÃO 2 (1 ponto) Um carro possui os seguintes objetos: ● motor ● cinto de segurança ● porta ● farol ● rádio Toda vez que o carro é dirigido, o motorista deve ligar o motor, trancar as portas, travar o cinto de segurança, acender o farol, ligar o rádio e sintonizar o rádio em sua estação preferida. Para finalizar uma corrida e desligar o carro, deve-se desligar o motor, destrancar as portas, destravar o cinto de segurança, apagar o farol e desligar o rádio. Implemente o problema utilizando o padrão de projeto Fachada. Utilize o método main para demonstrar o funcionamento.

// Fachada que simplifica a interação com os subsistemas complexos do carro
public class CarroFacade {
    final private Motor motor;
    final private CintoDeSeguranca cintoDeSeguranca;
    final private Porta porta;
    final private Farol farol;
    final private Radio radio;

    // Inicializa todos os subsistemas do carro
    public CarroFacade() {
        this.motor = new Motor();
        this.cintoDeSeguranca = new CintoDeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    // Método único para preparar o carro para corrida (encapsula várias operações)
    public void iniciarCorrida(String estacaoPreferida) {
        System.out.println("--- Iniciando a corrida ---");
        motor.ligar();
        porta.trancar();
        cintoDeSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoPreferida);  // Configura estação preferida
        System.out.println("--- Corrida iniciada ---");
    }

    // Método único para desligar todos os sistemas do carro
    public void finalizarCorrida() {
        System.out.println("--- Finalizando a corrida ---");
        motor.desligar();
        porta.destrancar();
        cintoDeSeguranca.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("--- Corrida finalizada ---");
    }
}