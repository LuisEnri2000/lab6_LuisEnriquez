
class Pelicula {
    
    String nombre;
    int duracion;
    String categ;
    String actores;
    String director;
    String compa;
    String idioma;
    boolean dob;
    boolean sub;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, String categ, String actores, String director, String compa, String idioma, boolean dob, boolean sub) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categ = categ;
        this.actores = actores;
        this.director = director;
        this.compa = compa;
        this.idioma = idioma;
        this.dob = dob;
        this.sub = sub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompa() {
        return compa;
    }

    public void setCompa(String compa) {
        this.compa = compa;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isDob() {
        return dob;
    }

    public void setDob(boolean dob) {
        this.dob = dob;
    }

    public boolean isSub() {
        return sub;
    }

    public void setSub(boolean sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +"\nTD: " + duracion + "\nCategoria: " + categ + "\nActores: " + actores + "\nDirector: " + director + "\nCasa: " + compa + "\nIdioma Original: " + idioma + "\nDoblaje: " + dob + "\nSubtitlada: " + sub + "\n\n";
    }
    
    
    
}
