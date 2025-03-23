package laboratorio_3.questao3;

// QUESTÃO 3 (1 ponto) Proponha um problema em que o uso do padrão de projeto Adapter (Wrapper) seja adequado. O problema deve ser diferente dos exemplos vistos em sala de aula. Implemente o problema proposto para demonstrar o funcionamento.
// Você foi contratado para desenvolver um sistema de catálogo de flores para uma floricultura que trabalha tanto com flores nacionais quanto com flores importadas. O sistema já possui uma interface FloresNacionais, que define métodos para exibir a descrição, obter o preço e a cor das flores nacionais. No entanto, a floricultura agora deseja incluir flores importadas em seu catálogo, mas as flores importadas seguem uma interface diferente (ImportedFlower), que possui métodos com nomes e funcionalidades distintas.

// Requisitos:
// Flores Nacionais:
// O sistema já possui uma interface FloresNacionais com os métodos:
// void exibirDescricao(): Exibe a descrição da flor.
// double obterPreco(): Retorna o preço da flor.
// String obterCor(): Retorna a cor da flor.
// As classes Rosa e Margarida já implementam essa interface.
// Flores Importadas:
// As flores importadas seguem a interface ImportedFlower, que possui os métodos:
// void showDescription(): Exibe a descrição da flor.
// double getPrice(): Retorna o preço da flor.
// String getColor(): Retorna a cor da flor.
// String getOriginCountry(): Retorna o país de origem da flor.
// A classe Tulip já implementa essa interface.
// Adaptação:
// O sistema precisa ser capaz de incluir flores importadas no catálogo de flores nacionais.
// Para isso, você deve criar um Adapter que permita que uma flor importada seja tratada como uma flor nacional, adaptando a interface ImportedFlower para FloresNacionais.
// Taxa de Importação:
// O preço das flores importadas deve incluir uma taxa de importação de 30% sobre o preço original.
// Saída Esperada:
// O sistema deve exibir as informações das flores nacionais e importadas de forma consistente, incluindo descrição, cor, preço e, no caso das flores importadas, o país de origem.
// Além disso, o sistema deve demonstrar a diferença de preço entre o valor original da flor importada e o valor após a aplicação da taxa de importação.

// Classe concreta de flor importada
class Tulip implements ImportedFlower {
    private String country;
    
    public Tulip(String country) {
        this.country = country;
    }
    
    @Override
    public void showDescription() {
        System.out.println("Tulip: Elegant flower native to Central Asia and Turkey.");
    }
    
    @Override
    public double getPrice() {
        return 22.75;
    }
    
    @Override
    public String getColor() {
        return "Pink";
    }
    
    @Override
    public String getOriginCountry() {
        return country;
    }
}