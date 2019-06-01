
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


class adminPeli {
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    File archivo = null;

    public adminPeli() {
    }
    
    public adminPeli(String ruta) {
        archivo = new File(ruta);
    }

    public ArrayList<Pelicula> getlistaPeliculas() {
        return listaPeliculas;
    }

    public void setlistaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminPeli{" + "listaPeliculas=" + listaPeliculas + '}';
    }
    
    
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
        
            for (Pelicula t : listaPeliculas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getDuracion() + ";");
                bw.write(t.getCateg() + ";");
                bw.write(t.getActores() + ";");
                bw.write(t.getDirector() + ";");
                bw.write(t.getCompa() + ";");
                bw.write(t.getIdioma() + ";");
                bw.write(t.isDob() + ";");
                bw.write(t.isSub() + "");
                bw.newLine();
            }
            bw.flush();
        
        } catch (Exception e) {
        
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        listaPeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                f = new File("./peliculas.txt");
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                boolean log = false;
                String l;

                while ((l = br.readLine()) != null) {
                    String[] al = l.split(";"); 
                    
                    String nombre = al[0];
                    int duracion = Integer.parseInt( al[1]);
                    String categ = al[2];
                    String actores = al[3];
                    String director = al[4];
                    String compa = al[5];
                    String idioma = al[6];
                    boolean dob = al[7].equals("true")? true:false;
                    boolean sub = al[8].equals("true")? true:false;

                    Pelicula p = new Pelicula(nombre,duracion,categ,actores,director,compa,idioma,dob,sub);
                    listaPeliculas.add(p);
                }
                
                br.close();
                fr.close();
                
            } catch (Exception e) {
                
            }
            
        }
        
        
    }
}
