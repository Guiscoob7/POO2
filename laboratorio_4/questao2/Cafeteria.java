package laboratorio_4.questao2;

/*Implemente o padrão estrutural Decorator em Java no problema de uma Cafeteria. Existem 
dois objetos base: Espresso e Decaf. Cada decoração adicionada ao objeto base deve 
afetar o custo e a descrição da bebida, acessíveis pelos métodos getPreco() e 
getDescricao(), respectivamente. A String impressa pelo getDescricao() deve ser inteligível 
em língua portuguesa. Como decorações possíveis, use Leite, Canela, Chocolate, e 
quaisquer outras que você desejar. Crie uma classe Cafeteria que contém o método main 
para mostrar o funcionamento.*/

// Classe principal para demonstração
public class Cafeteria {
    public static void main(String[] args) {
        // Criando um Espresso simples
        Bebida bebida1 = new Expresso();
        System.out.println("Bebida 1:");
        System.out.println("Descrição: " + bebida1.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", bebida1.getPreco());
        
        // Criando um Espresso com Leite e Canela
        Bebida bebida2 = new Leite(new Canela(new Expresso()));
        System.out.println("Bebida 2:");
        System.out.println("Descrição: " + bebida2.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", bebida2.getPreco());
        
        // Criando um Decaf com Chocolate e Caramelo
        Bebida bebida3 = new Chocolate(new Caramelo(new Descafeinado()));
        System.out.println("Bebida 3:");
        System.out.println("Descrição: " + bebida3.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", bebida3.getPreco());
    }
}
