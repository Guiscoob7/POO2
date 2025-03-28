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

class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizzaBase) {
        super(pizzaBase);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.5;
    }

    @Override
    public String getIngredientes() {
        return super.getIngredientes() + "Ovo;\n";
    }
}
