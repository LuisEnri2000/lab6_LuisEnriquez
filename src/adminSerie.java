
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class adminSerie {
    ArrayList<Serie> listaSeries = new ArrayList();
    File archivo = null;

    public adminSerie() {
    }
    
    public adminSerie(String ruta) {
        archivo = new File(ruta);
    }

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
        
            for (Serie t : listaSeries) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getDuracion() + ";");
                bw.write(t.getCateg() + ";");
                bw.write(t.getActores() + ";");
                bw.write(t.getTemp() + ";");
                bw.write(t.getProd() + ";");
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
        
        listaSeries = new ArrayList();
        if (archivo.exists()) {
            try {
                f = new File("./series.txt");
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
                    int temp = Integer.parseInt(al[4]);
                    String compa = al[5];
                    String idioma = al[6];
                    boolean dob = al[7].equals("true")? true:false;
                    boolean sub = al[8].equals("true")? true:false;

                    Serie s = new Serie(nombre,duracion,categ,actores,temp,compa,idioma,dob,sub);
                    listaSeries.add(s);
                }
                
                br.close();
                fr.close();
                
            } catch (Exception e) {
                
            }
            
        }
        
        
    }
    
    
}
