/*📱 QUESTÃO 1 (0.5 ponto) 
Considere o domínio de celulares. Existem as empresas fabricantes de celulares, por 
exemplo: Apple e Samsung. E cada fabricante é capaz de construir diferentes modelos de 
celulares, por exemplo: Galaxy8, Galaxy 20, IPhoneX e IPhoneS. 
Construa um programa Java, capaz de reproduzir o cenário acima. Seu programa deve: 
● conter uma classe Main, que demonstrará o funcionamento 🚀
● conter uma interface FabricanteCelular, com o método: 
○ public Celular constroiCelular( String modelo ); 
● conter uma interface Celular, com os métodos: 
○  public void fazLigacao(); 
○ public void tiraFoto(); 
● utilizar o padrão de projeto Fábrica para construção de celulares; 🏭
● utilizar o padrão de projeto Singleton para criação de fabricantes. 🛠️
*/

// Interface que define o comportamento de um celular
interface Celular {
    public void fazLigacao(); // 📞 Método para fazer ligações
    public void tiraFoto(); // 📸 Método para tirar fotos
}

// Interface que define o comportamento de um fabricante de celulares
interface FabricanteCelular {
    public Celular constroiCelular(String modelo); // 🏭 Método para construir um celular
}

// Classe que representa um celular da Apple (iPhone)
class IPhone implements Celular {
    private final String modelo; // Modelo do iPhone

    // Construtor que recebe o modelo do iPhone
    public IPhone(String modelo){
        this.modelo = modelo;
    }

    // Implementação do método para fazer ligações
    @Override
    public void fazLigacao() {
        System.out.println("📞 Fazendo ligação com " + modelo + " da Apple 🍏");
    }

    // Implementação do método para tirar fotos
    @Override
    public void tiraFoto() {
        System.out.println("📸 Tirando foto com " + modelo + " da Apple 🍏");
    }
}

// Classe que representa um celular da Samsung (Galaxy)
class Galaxy implements Celular {
    private final String modelo; // Modelo do Galaxy

    // Construtor que recebe o modelo do Galaxy
    public Galaxy (String modelo){
        this.modelo = modelo;
    }

    // Implementação do método para fazer ligações
    @Override
    public void fazLigacao() {
        System.out.println("📞 Fazendo ligação com " + modelo + " da Samsung 📱");
    }

    // Implementação do método para tirar fotos
    @Override
    public void tiraFoto() {
        System.out.println("📸 Tirando foto com " + modelo + " da Samsung 📱");
    }
}

// Classe que representa a fabricante Apple (usa o padrão Singleton)
class Apple implements FabricanteCelular {
    private static Apple instance; // Instância única da Apple

    // Construtor privado para evitar criação de instâncias fora da classe
    private Apple() {
        System.out.println("🍏 Criando fabricante Apple...");
    }

    // Método estático para obter a instância única da Apple (Singleton)
    public static Apple getInstace() {
        if (instance == null){
            instance = new Apple();
        }
        return instance;
    }

    // Implementação do método para construir um iPhone
    @Override
    public Celular constroiCelular(String modelo)
    {
        System.out.println("🍏 Apple fabricando iPhone modelo: " + modelo);
        return new IPhone(modelo);
    }
}

// Classe que representa a fabricante Samsung (usa o padrão Singleton)
class Samsung implements FabricanteCelular {
    private static Samsung instance; // Instância única da Samsung

    // Construtor privado para evitar criação de instâncias fora da classe
    private Samsung() {
        System.out.println("📱 Criando fabricante Samsung...");
    }
    
    // Método estático para obter a instância única da Samsung (Singleton)
    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }
    
    // Implementação do método para construir um Galaxy
    @Override
    public Celular constroiCelular(String modelo) {
        System.out.println("📱 Samsung fabricando Galaxy modelo: " + modelo);
        return new Galaxy(modelo);
    }
}

// Classe principal que demonstra o funcionamento do programa
public class CelularMain {
    public static void main(String[] args){
        // Obtendo as instâncias únicas das fabricantes (Singleton)
        FabricanteCelular apple = Apple.getInstace();
        FabricanteCelular samsung = Samsung.getInstance();

        // Construindo diferentes modelos de celulares
        Celular iphone = apple.constroiCelular("iPhone 12");
        Celular iphone2 = apple.constroiCelular("iPhone 11");
        Celular galaxy = samsung.constroiCelular("Galaxy S21");
        Celular galaxy2 = samsung.constroiCelular("Galaxy S20");

        System.out.println("\n📱 Testando funcionalidades dos celulares:");

        // Testando as funcionalidades dos iPhones
        iphone.fazLigacao();
        iphone.tiraFoto();

        iphone2.fazLigacao();
        iphone2.tiraFoto();

        // Testando as funcionalidades dos Galaxies
        galaxy.fazLigacao();
        galaxy.tiraFoto();

        galaxy2.fazLigacao();
        galaxy2.tiraFoto();

        System.out.println("\n🛠️ Testando o padrão Singleton para fabricantes:");
        // Obtendo novamente as instâncias das fabricantes
        FabricanteCelular apple2 = Apple.getInstace();
        FabricanteCelular samsung2 = Samsung.getInstance();

        // Verificando se as instâncias são as mesmas (Singleton)
        System.out.println("🍏 Apple e Apple2 são a mesma instância? " + (apple == apple2));
        System.out.println("📱 Samsung e Samsung2 são a mesma instância? " + (samsung == samsung2));
    }
}