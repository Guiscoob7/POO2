package laboratorio_5.questao3;

// QUESTÃO 3 (1.5 pontos) 
// Proponha um problema em que o uso do padrão de projeto Proxy seja adequado. O 
// problema deve ser diferente dos exemplos vistos em sala de aula. Implemente o problema 
// proposto para demonstrar o funcionamento. Utilize comentários para elucidar melhor sua 
// proposta.

// Classe de demonstração do padrão Proxy para controle de acesso a documentos
public class SistemaDocumentos {
    
    public static void main(String[] args) {
        // Cria documentos com diferentes níveis de acesso
        Documento doc1 = new DocumentoProxy("Relatório Mensal", "Dados operacionais comuns", "joao", "medio");
        Documento doc2 = new DocumentoProxy("Estratégia CONFIDENCIAL", "Plano de negócios CONFIDENCIAL para 2024", "maria", "alto");
        Documento doc3 = new DocumentoProxy("Dados CONFIDENCIAL", "Informações sigilosas", "carlos", "baixo");

        System.out.println("\n--- Tentativa de acesso aos documentos ---");

        // Testa acesso aos documentos
        doc1.mostrarConteudo();  // Acesso permitido (documento não confidencial)
        System.out.println();

        doc2.mostrarConteudo();  // Acesso permitido (usuário com nível alto)
        System.out.println();

        doc3.mostrarConteudo();  // Acesso negado (documento confidencial + usuário nível baixo)
        System.out.println();

        // Demonstra reutilização do mesmo documento (já criado)
        System.out.println("\n--- Segundo acesso ao mesmo documento ---");
        doc1.mostrarConteudo();
    }
}
