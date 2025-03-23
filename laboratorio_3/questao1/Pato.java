package laboratorio_3.questao1;

// QUESTÃO 1 (0.5 ponto) 
// Seja o contexto de habilidades de aves. Uma ave é capaz de: 
// ● void voar() 
// ● void emitirSom() 
// Considere que o Pato é uma ave capaz de grasnar e voar, e que o Pavao é uma ave capaz 
// de cantar, mas não é capaz de voar. Considere também as espécies PatoDomestico e 
// PavaoAzul de Pato e Pavao, respectivamente. Utilizando o padrão de projeto Adapter, 
// implemente em Java o problema das aves. Crie uma classe Main que contém o método 
// main para mostrar o funcionamento.

class Pato {
    public void grasnar() {
        System.out.println("Pato grasnando");
    }
    
    public void voarPato() {
        System.out.println("Pato voando");
    }
}

