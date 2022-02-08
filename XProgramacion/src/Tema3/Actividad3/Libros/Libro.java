package Tema3.Actividad3.Libros;

public class Libro {
    private int id;
    private String titulo, autor, editorial;

    public Libro(){}

    public Libro(int id, String titulo, String autor, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String imprimirlibro(){
        return "Libro con Id " +this.id+ ", con titulo "+this.titulo+ ", autor "+this.autor+" y editorial"+this.editorial+".";
    }
}
