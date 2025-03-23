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

public class AppAves {
    public static void main(String[] args) {
        System.out.println("=== Demonstração do padrão Adapter para Aves ===");
        
        // Testando Pato com Adapter
        System.out.println("\n--- Pato ---");
        Pato pato = new Pato();
        Ave patoAdapter = new PatoAdapter(pato);
        patoAdapter.voar();
        patoAdapter.emitirSom();
        
        // Testando PatoDomestico com Adapter
        System.out.println("\n--- Pato Doméstico ---");
        PatoDomestico patoDomestico = new PatoDomestico();
        Ave patoDomesticoAdapter = new PatoDomesticoAdapter(patoDomestico);
        patoDomesticoAdapter.voar();
        patoDomesticoAdapter.emitirSom();
        
        // Testando Pavao com Adapter
        System.out.println("\n--- Pavão ---");
        Pavao pavao = new Pavao();
        Ave pavaoAdapter = new PavaoAdapter(pavao);
        pavaoAdapter.voar();
        pavaoAdapter.emitirSom();
        
        // Testando PavaoAzul com Adapter
        System.out.println("\n--- Pavão Azul ---");
        PavaoAzul pavaoAzul = new PavaoAzul();
        Ave pavaoAzulAdapter = new PavaoAzulAdapter(pavaoAzul);
        pavaoAzulAdapter.voar();
        pavaoAzulAdapter.emitirSom();
    }
}