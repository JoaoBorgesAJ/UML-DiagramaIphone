public class Iphone implements ReprodutorMusical, RealizarChamada, NavegarInternet {
    private boolean reproduzindo;
    private boolean emChamada;
    private boolean navegadorAberto;
    private int volume;

    public Iphone() {
        reproduzindo = false;
        emChamada = false;
        navegadorAberto = false;
        volume = 50; // Volume Padrão
    }

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocarMusica(String musica) {
        if (!reproduzindo) {
            System.out.println("Tocando Música: " + musica);
            reproduzindo = true;
        } else {
            System.out.println("Já está tocando uma música.");
        }
    }

    public void pausarMusica() {
        if (reproduzindo) {
            System.out.println("Música pausada.");
            reproduzindo = false;
        } else {
            System.out.println("Nenhuma música está sendo tocada para pausar.");
        }
    }

    public void pararReproducao() {
        if (reproduzindo) {
            System.out.println("Música parada.");
            reproduzindo = false;
        } else {
            System.out.println("Nenhuma música está sendo tocada para parar reprodução");
        }
    }

    public void ajustarVolume() {
        this.volume += 10; // Aumenta o volume em 10 unidades
        System.out.println("Volume ajustado para " + this.volume);
    }

    // Implementação dos métodos da interface RealizarChamada
    public void fazerChamada(String numero) {
        if (!emChamada) {
            System.out.println("Chamando número " + numero);
            emChamada = true;
        } else {
            System.out.println("Você já está em uma chamada.");
        }
    }

    public void receberChamada(String numero) {
        if (!emChamada) {
            System.out.println("Recebendo chamada de " + numero);
            emChamada = true;
        } else {
            System.out.println("Você já está em uma chamada.");
        }
    }

    public void encerrarChamada() {
        if (emChamada) {
            System.out.println("Chamada encerrada.");
            emChamada = false;
        } else {
            System.out.println("Você não está em uma chamada para encerrar.");
        }
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void receberMensagem(String numero, String mensagem) {
        System.out.println("Recebendo mensagem de " + numero + ": " + mensagem);
    }

    // Implementação dos métodos da interface NavegarInternet
    public void abrirNavegador() {
        if (!navegadorAberto) {
            System.out.println("Abriu o navegador.");
            navegadorAberto = true;
        } else {
            System.out.println("Você já está com o navegador aberto.");
        }
    }

    public void fecharNavegador() {
        if (navegadorAberto) {
            System.out.println("Fechou o navegador.");
            navegadorAberto = false;
        } else {
            System.out.println("O navegador já está fechado.");
        }
    }

    public void navegarPara(String url) {
        if (navegadorAberto) {
            System.out.println("Navegando para: " + url);
        } else {
            System.out.println("Você precisa abrir o navegador antes de navegar.");
        }
    }

    public void realizarPesquisa(String termo) {
        if (navegadorAberto) {
            System.out.println("Realizando pesquisa: " + termo);
        } else {
            System.out.println("Você precisa abrir o navegador antes de pesquisar.");
        }
    }

    public void visualizarPagina(String pagina) {
        if (navegadorAberto) {
            System.out.println("Visualizando a página: " + pagina);
        } else {
            System.out.println("Você precisa abrir o navegador antes de visualizar.");
        }
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("-------------------------------------");
        iphone.fazerChamada("546546");
        iphone.receberChamada("54564");
        iphone.encerrarChamada();
        iphone.enviarMensagem("546546", "Hello, World!");
        iphone.receberMensagem("546546", "Congratulations, you have successfully logged in to");
        System.out.println("-------------------------------------");
        iphone.tocarMusica("Hust");
        iphone.ajustarVolume();
        iphone.pausarMusica();
        iphone.pararReproducao();
        System.out.println("-------------------------------------");
        iphone.abrirNavegador();
        iphone.navegarPara("https://web.dio.me/home");
        iphone.realizarPesquisa("Cursos");
        iphone.visualizarPagina("https://www.dio.me/users/joao_jp_jp996");
        iphone.fecharNavegador();

    }
}
