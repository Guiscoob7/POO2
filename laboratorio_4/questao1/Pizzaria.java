package laboratorio_4.questao1;

/*Considere o contexto de uma pizzaria. Uma pizza pode ser fabricada a partir de uma massa 
fina (MassaFinaPizza) ou de uma massa espessa (MassaEspessaPizza). As pizzas 
oferecidas no cardápio são montadas misturando os diversos ingredientes disponíveis 
(Toppings). Por exemplo, a pizza Marguerita é a combinação de uma pizza de massa fina, 
com queijo e tomate. A pizza Portuguesa contém massa espessa, queijo, ovo e tomate. 
Utilizando o padrão de projeto Decorator, implemente em Java o problema da pizzaria. 
Considere MassaFinaPizza e MassaEspessaPizza os objetos base. Como decorações 
possíveis, use Queijo, Tomate, Ovo e quaisquer outras que você desejar. Crie uma classe 
Pizzaria que contém o método main para mostrar o funcionamento.*/

public class Pizzaria {
    public static void main(String[] args){
        Pizza marguerita = new Tomate(new Queijo(new MassaFinaPizza()));
        System.out.println("Pizza Marguerita: ");
        System.out.println("Ingredientes: " + marguerita.getIngredientes());
        System.out.println("Preço: R$ " + marguerita.getPreco());

        System.out.println("\n--------------------------\n");

        Pizza portuguesa = new Ovo(new Queijo(new Tomate(new MassaEspessaPizza())));
        System.out.println("Pizza Portuguesa: ");
        System.out.println("Ingredientes: " + portuguesa.getIngredientes());
        System.out.println("Preço: R$ " + portuguesa.getPreco());

        System.out.println("\n--------------------------\n");

        Pizza especial = new Ovo(new Tomate(new Bacon(new Queijo(new MassaFinaPizza()))));
        System.out.println("Pizza Especial:");
        System.out.println("Ingredientes: " + especial.getIngredientes());
        System.out.println("Preço: R$ " + especial.getPreco());
    }
}
