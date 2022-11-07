public class Arvore {
    private No elemento;
    private Arvore direita;
    private Arvore esquerda;

    public Arvore(){
        this.elemento = null;
        this.esquerda = null;
        this.direita = null;
    }
    public Arvore(No elemento){
        this.elemento = elemento;
        this.direita = null;
        this.esquerda = null;
        //System.out.println("Criei a ávore com o elemento " + elemento.getInfo());
    }

    // métodos
    public boolean vazia(){
        return (this.elemento == null);
    }

    public void inserir(No elemNovo){
        if (vazia()) {
            this.elemento = elemNovo;
        } else{
            Arvore novaArvore = new Arvore(elemNovo);
            if (elemNovo.getInfo() < this.elemento.getInfo()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                    //System.out.println("Inseri o elemento " + elemNovo.getInfo() + " à esquerda de " + elemento.getInfo());
                }
                else{
                    this.esquerda.inserir(elemNovo);
                }
            }
            else if (elemNovo.getInfo() > this.elemento.getInfo()) {
                if (this.direita == null) {
                    this.direita = novaArvore;
                    //System.out.println("Inseri o elemento " + elemNovo.getInfo() + " à direita de " + elemento.getInfo());
                }
                else{
                    this.direita.inserir(elemNovo);
                }
            }
        }
    }

    public boolean busca(int valor){
        if (vazia()) {
            return false;
        }
        if (this.elemento.getInfo() == valor) {
            return true;
        }
        else{
            if (valor < this.elemento.getInfo()) {
                if (this.esquerda == null) {
                    return false;
                }
                else{
                    return this.esquerda.busca(valor);
                }
            }
            else if (valor > this.elemento.getInfo()) {
                if (this.direita == null) {
                    return false;
                }
                else{
                    return this.direita.busca(valor);
                }
            }
            return false;
        }
    }

    // gets e sets
    public void setElemento(No elemento) {
        this.elemento = elemento;
    }
    public void setDireita(Arvore direita) {
        this.direita = direita;
    }
    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }
    public No getElemento() {
        return elemento;
    }
    public Arvore getDireita() {
        return direita;
    }
    public Arvore getEsquerda() {
        return esquerda;
    }
}
