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

// Componente do sistema de home theater - controla o áudio
public class MaquinaDePipoca {
    // Liga a máquina de pipoca
    void ligar() {
        System.out.println("Máquina de pipoca ligada.");
    }   
    
    // Desliga a máquina de pipoca
    void desligar() {
        System.out.println("Máquina de pipoca desligada.");
    }
    
    // Faz a pipoca estourar
    void estourarPipoca() {
        System.out.println("Pipoca estourando...");
    }
}
