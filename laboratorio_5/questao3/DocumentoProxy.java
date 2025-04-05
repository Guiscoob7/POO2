package laboratorio_5.questao3;

// Proxy para controle de acesso a documentos
public class DocumentoProxy implements Documento {
    private DocumentoReal documentoReal;  // Objeto real que será criado sob demanda
    final private String titulo;
    final private String conteudo;
    final private String usuario;
    final private String nivelAcesso;

    public DocumentoProxy(String titulo, String conteudo, String usuario, String nivelAcesso) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.usuario = usuario;
        this.nivelAcesso = nivelAcesso;
    }
    
    @Override
    public void mostrarConteudo() {
        if (verificarAcesso()){
            // Cria o objeto real apenas quando necessário (lazy initialization)
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(titulo, conteudo);
            }
            documentoReal.mostrarConteudo();

            registrarAcesso(usuario, titulo);  // Log de acesso
        }
        else {
            System.out.println("Acesso negado ao documento: " + titulo + " para o usuário: " + usuario);
        }
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    // Verifica se usuário tem permissão para acessar o documento
    private boolean verificarAcesso() {
        if (titulo.toLowerCase().contains("confidencial")) {
            return nivelAcesso.equals("alto");  // Somente acesso alto para documentos confidenciais
        }
        return true;  // Documentos não confidenciais são acessíveis a todos
    }

    // Registra o acesso ao documento
    private void registrarAcesso(String usuario, String titulo){
        System.out.println("Acesso ao documento: " + titulo + " registrado para o usuário: " + usuario);
    }
}