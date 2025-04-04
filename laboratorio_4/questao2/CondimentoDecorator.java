package laboratorio_4.questao2;

/*Implemente o padrão estrutural Decorator em Java no problema de uma Cafeteria. Existem 
dois objetos base: Espresso e Decaf. Cada decoração adicionada ao objeto base deve 
afetar o custo e a descrição da bebida, acessíveis pelos métodos calculaCusto() e 
getDescricao(), respectivamente. A String impressa pelo getDescricao() deve ser inteligível 
em língua portuguesa. Como decorações possíveis, use Leite, Canela, Chocolate, e 
quaisquer outras que você desejar. Crie uma classe Cafeteria que contém o método main 
para mostrar o funcionamento.*/

public class CondimentoDecorator implements Bebida {
    protected Bebida bebidaBase;

    public CondimentoDecorator(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }

    @Override
    public String getDescricao() {
        return bebidaBase.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebidaBase.getPreco();
    }
}
