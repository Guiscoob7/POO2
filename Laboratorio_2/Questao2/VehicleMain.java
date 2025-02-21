/*🚗 QUESTÃO 2 (1.5 pontos) 
Considere o domínio das fábricas de veículos. Considere que um veículo possui o seguinte 
comportamento padrão: ligar, rodar e parar. Considere a interface IVehicle, que possui os 
seguintes métodos: 
public void start(); 
public void drive(); 
public void stop(); 
Considere a interface de fabricante de veículos IVehicleMaker, que possui o seguinte 
método: 
public IVehicle makeVehicle(String modelo); 
Existem vários fabricantes de veículos (IVehicleMaker) e cada um deles possui o seu 
grupo de modelos. 
Por exemplo, dois fabricantes são a Toyota e a Honda. A Toyota possui o Corolla, a Hilux e 
o Etios. A Honda possui o City, o Civic e o Fit. Existem no mercado diferentes fabricantes 
(IVehicleMaker) cujo papel básico é fabricar veículos (makeVehicle). 
Crie o código Java mínimo que implementa as classes mencionadas e escreve um método 
main() simples que demonstre seu funcionamento.  
Considere e aplique um padrão Factory e um padrão Singleton no exemplo. 
Comente seu código, indicando o porquê do uso de cada padrão de projeto.*/

/**
 * 🚗 Interface que define o comportamento padrão de um veículo.
 */
interface IVehicle {
    public void start(); // 🚦 Ligar o veículo
    public void drive(); // 🛣️ Rodar com o veículo
    public void stop(); // 🛑 Parar o veículo
}

/**
 * 🏭 Interface que define o comportamento de um fabricante de veículos.
 */
interface IVehicleMaker {
    public IVehicle makeVehicle(String modelo); // 🚗 Método para fabricar um veículo
}

/**
 * 🚗 Implementação concreta de um veículo Toyota.
 */
class ToyotaVehicle implements IVehicle {
    private final String modelo; // Modelo do veículo Toyota
    
    public ToyotaVehicle(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void start() {
        System.out.println("🚦 Toyota " + modelo + " ligando com tecnologia Toyota... 🍏");
    }
    
    @Override
    public void drive() {
        System.out.println("🛣️ Toyota " + modelo + " rodando com eficiência de combustível... ⛽");
    }
    
    @Override
    public void stop() {
        System.out.println("🛑 Toyota " + modelo + " parando com sistema de freios ABS... 🛑");
    }
}

/**
 * 🚗 Implementação concreta de um veículo Honda.
 */
class HondaVehicle implements IVehicle {
    private final String modelo; // Modelo do veículo Honda
    
    public HondaVehicle(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void start() {
        System.out.println("🚦 Honda " + modelo + " ligando com tecnologia VTEC... 🍏");
    }
    
    @Override
    public void drive() {
        System.out.println("🛣️ Honda " + modelo + " rodando com alto desempenho... �");
    }
    
    @Override
    public void stop() {
        System.out.println("🛑 Honda " + modelo + " parando com sistema de frenagem inteligente... 🛑");
    }
}

/**
 * 🏭 Implementação da fábrica Toyota utilizando o padrão Singleton.
 * O padrão Singleton garante que exista apenas uma instância da fábrica Toyota
 * em toda a aplicação, economizando recursos e centralizando a criação de veículos Toyota.
 */
class Toyota implements IVehicleMaker {
    // Instância única da classe Toyota
    private static Toyota instance;
    
    // Construtor privado para evitar instanciação direta
    private Toyota() {
        System.out.println("🏭 Criando fábrica Toyota (Singleton)... 🍏");
    }
    
    // Método estático para obter a instância única da fábrica
    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }
    
    /**
     * 🏭 Implementação do padrão Factory Method.
     * Este método encapsula a lógica de criação de diferentes modelos de veículos Toyota.
     * Permite que novos modelos sejam adicionados sem alterar o código cliente.
     */
    @Override
    public IVehicle makeVehicle(String modelo) {
        System.out.println("🏭 Fábrica Toyota produzindo o modelo: " + modelo + " 🍏");
        
        // Validação dos modelos disponíveis
        if (modelo.equalsIgnoreCase("Corolla") || 
            modelo.equalsIgnoreCase("Hilux") || 
            modelo.equalsIgnoreCase("Etios")) {
            return new ToyotaVehicle(modelo);
        } else {
            System.out.println("❌ Modelo Toyota desconhecido: " + modelo);
            return null;
        }
    }
}

/**
 * 🏭 Implementação da fábrica Honda utilizando o padrão Singleton.
 * O padrão Singleton garante que exista apenas uma instância da fábrica Honda
 * em toda a aplicação, economizando recursos e centralizando a criação de veículos Honda.
 */
class Honda implements IVehicleMaker {
    // Instância única da classe Honda
    private static Honda instance;
    
    // Construtor privado para evitar instanciação direta
    private Honda() {
        System.out.println("🏭 Criando fábrica Honda (Singleton)... 🍏");
    }
    
    // Método estático para obter a instância única da fábrica
    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }
    
    /**
     * 🏭 Implementação do padrão Factory Method.
     * Este método encapsula a lógica de criação de diferentes modelos de veículos Honda.
     * Permite que novos modelos sejam adicionados sem alterar o código cliente.
     */
    @Override
    public IVehicle makeVehicle(String modelo) {
        System.out.println("🏭 Fábrica Honda produzindo o modelo: " + modelo + " 🍏");
        
        // Validação dos modelos disponíveis
        if (modelo.equalsIgnoreCase("City") || 
            modelo.equalsIgnoreCase("Civic") || 
            modelo.equalsIgnoreCase("Fit")) {
            return new HondaVehicle(modelo);
        } else {
            System.out.println("❌ Modelo Honda desconhecido: " + modelo);
            return null;
        }
    }
}

/**
 * 🚗 Classe principal que demonstra o funcionamento do sistema.
 */
public class VehicleMain {
    public static void main(String[] args) {
        System.out.println("=== 🚗 Demonstração do Sistema de Fabricação de Veículos ===\n");
        
        // Obtendo as instâncias únicas das fábricas (padrão Singleton)
        IVehicleMaker toyotaMaker = Toyota.getInstance();
        IVehicleMaker hondaMaker = Honda.getInstance();
        
        // Fabricando veículos usando o padrão Factory
        System.out.println("\n--- 🏭 Fabricando veículos Toyota ---");
        IVehicle corolla = toyotaMaker.makeVehicle("Corolla");
        IVehicle hilux = toyotaMaker.makeVehicle("Hilux");
        IVehicle etios = toyotaMaker.makeVehicle("Etios");
        
        System.out.println("\n--- 🏭 Fabricando veículos Honda ---");
        IVehicle civic = hondaMaker.makeVehicle("Civic");
        IVehicle city = hondaMaker.makeVehicle("City");
        IVehicle fit = hondaMaker.makeVehicle("Fit");
        
        // Testando os veículos Toyota
        System.out.println("\n--- 🚗 Testando Toyota Corolla ---");
        testVehicle(corolla);
        
        System.out.println("\n--- 🚗 Testando Toyota Hilux ---");
        testVehicle(hilux);
        
        // Testando os veículos Honda
        System.out.println("\n--- 🚗 Testando Honda Civic ---");
        testVehicle(civic);
        
        System.out.println("\n--- 🚗 Testando Honda Fit ---");
        testVehicle(fit);

        System.out.println("\n--- 🚗 Testando Honda City ---");
        testVehicle(city);

        System.out.println("\n--- 🚗 Testando Toyota Etios ---");
        testVehicle(etios);
        
        // Demonstração do padrão Singleton
        System.out.println("\n--- 🛠️ Demonstração do Padrão Singleton ---");
        IVehicleMaker anotherToyota = Toyota.getInstance();
        IVehicleMaker anotherHonda = Honda.getInstance();
        
        System.out.println("toyotaMaker e anotherToyota são a mesma instância? " + 
                          (toyotaMaker == anotherToyota));
        System.out.println("hondaMaker e anotherHonda são a mesma instância? " + 
                          (hondaMaker == anotherHonda));
    }
    
    /**
     * 🚗 Método auxiliar para testar um veículo.
     */
    private static void testVehicle(IVehicle vehicle) {
        if (vehicle != null) {
            vehicle.start();
            vehicle.drive();
            vehicle.stop();
        }
    }
}