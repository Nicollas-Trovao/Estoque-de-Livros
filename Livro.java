/**
 * Classe Livro representa um Livro em estoque
 * Cada objeto Livro tem: um numero de paginas e capitulos, junto com o titulo e o nome do autor
 * @author Nicollas Trovão
 */
public class Livro {

    private int paginas;
    private int capitulos;
    private String titulos;
    private String autores;

    // Getters e Setters para paginas
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Getters e Setters para capitulos
    public int getCapitulos() {
        return capitulos;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    // Getters e Setters para titulos
    public String getTitulos() {
        return titulos;
    }
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    // Getters e Setters para autores
    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }

}