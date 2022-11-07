public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(1));
        arvore.inserir(new No(8));
        arvore.inserir(new No(15));
        arvore.inserir(new No(12));
        arvore.inserir(new No(18));

        System.out.println("O elemento 5 " + (arvore.busca(5) ? "existe" : "não existe"));
        System.out.println("O elemento 1 "  + (arvore.busca(1) ? "existe" : "não existe"));
        System.out.println("O elemento 14 " + (arvore.busca(14) ? "existe" : "não existe"));
    }
}
