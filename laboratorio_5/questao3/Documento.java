package laboratorio_5.questao3;

// QUESTÃO 3 (1.5 pontos) 
// Proponha um problema em que o uso do padrão de projeto Proxy seja adequado. O 
// problema deve ser diferente dos exemplos vistos em sala de aula. Implemente o problema 
// proposto para demonstrar o funcionamento. Utilize comentários para elucidar melhor sua 
// proposta.

// Interface que define o contrato para todos os documentos
interface Documento {
    void mostrarConteudo();  // Método para exibir o conteúdo do documento
    String getTitulo();      // Método para obter o título do documento
}

