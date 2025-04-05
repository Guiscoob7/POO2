package laboratorio_5.questao1;

// QUESTÃO 1 
// Imagine que você tenha um ritual para assistir filmes domingo à tarde utilizando seu home 
// theater em sua cinemateca. Você: 
// 1. liga a pipoqueira 
// 2. rebenta pipoca 
// 3. desliga as luzes 
// 4. abaixa o telão 
// 5. liga o projetor 
// 6. liga o amplificador 
// 7. ajusta o volume do som para 10 no amplificador 
// 8. liga o player 
// 9. aperta o play indicando o filme que quer assistir 
// Considere um contexto em que existam os seguintes objetos e suas funcionalidades em sua 
// cinemateca: 
// ● Amplificador (liga, ajuste de volume) 
// ● Luzes (liga, desliga) 
// ● Máquina de Pipoca (liga, desliga, arrebenta pipoca) 
// ● Projetor (liga, desliga) 
// ● Player de Streaming (liga, desliga, play em um filme) 
// ● Telão (abaixa, sobe) 
// a) Implemente o problema utilizando o padrão de projeto Fachada. 
// b) Proponha e implemente um método em sua fachada chamado fimDoFilme().

// Classe Fachada
class CinematecaFacade {
    final private Amplificador amplificador;
    final private Luzes luzes;
    final private MaquinaDePipoca maquinaDePipoca;
    final private Projetor projetor;
    final private PlayerStreaming playerStreaming;
    final private Telao telao;
    
    public CinematecaFacade(Amplificador amplificador, Luzes luzes, 
                           MaquinaDePipoca maquinaDePipoca, Projetor projetor, 
                           PlayerStreaming playerStreaming, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor = projetor;
        this.playerStreaming = playerStreaming;
        this.telao = telao;
    }
    
    public void assistirFilme(String filme) {
        System.out.println("Preparando tudo para assistir o filme...");
        maquinaDePipoca.ligar();
        maquinaDePipoca.estourarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        playerStreaming.ligar();
        playerStreaming.play(filme);
    }
    
    public void fimDoFilme() {
        System.out.println("Desligando o sistema de home theater...");
        playerStreaming.parar();
        playerStreaming.desligar();
        amplificador.desligar();
        projetor.desligar();
        telao.subir();
        luzes.ligar();
        maquinaDePipoca.desligar();
    }
}
