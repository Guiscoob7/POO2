package laboratorio_5.questao3;

// QUESTÃO 3 (1.5 pontos) 
// Proponha um problema em que o uso do padrão de projeto Proxy seja adequado. O 
// problema deve ser diferente dos exemplos vistos em sala de aula. Implemente o problema 
// proposto para demonstrar o funcionamento. Utilize comentários para elucidar melhor sua 
// proposta.

// Implementação concreta do documento (Subject Real no padrão Proxy)
public class DocumentoReal implements Documento {
    private String titulo;
    private String conteudo;

    // Construtor que simula um processo pesado de carregamento
    public DocumentoReal(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        System.out.println("Carregando documento real: " + titulo);

        // Simula tempo de carregamento (operacao custosa)
        try {
            Thread.sleep(1000); // Delay de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void mostrarConteudo() {
        // Exibe o conteúdo completo do documento
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }

    @Override
    public String getTitulo() {
        return titulo;  // Retorna apenas o título (operaçao leve)
    }
}