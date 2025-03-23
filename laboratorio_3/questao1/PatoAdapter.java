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

class PatoAdapter implements Ave {
    private Pato pato;
    
    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }
    
    @Override
    public void voar() {
        pato.voarPato();
    }
    
    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}

class PatoDomesticoAdapter implements Ave {
    private PatoDomestico patoDomestico;
    
    public PatoDomesticoAdapter(PatoDomestico patoDomestico) {
        this.patoDomestico = patoDomestico;
    }
    
    @Override
    public void voar() {
        patoDomestico.voarPato();
    }
    
    @Override
    public void emitirSom() {
        patoDomestico.grasnar();
    }
}
