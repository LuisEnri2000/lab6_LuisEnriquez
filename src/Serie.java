
class Serie {
    String nombre;
    int duracion;
    String categ;
    String actores;
    int temp;
    String prod;
    String idioma;
    boolean dob;
    boolean sub;

    
    
    public Serie() {
    }

    public Serie(String nombre, int duracion, String categ, String actores, int temp, String prod, String idioma, boolean dob, boolean sub) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categ = categ;
        this.actores = actores;
        this.temp = temp;
        this.prod = prod;
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

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
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
        return nombre;
    }
    
    
}
