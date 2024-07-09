import java.util.*;

public class Documento {
    private HashMap<String, List<String>> datos;
    private String nombre;

    public Documento() {
        nombre="";
        datos=new HashMap<>();
    }

    public Documento(HashMap<String, List<String>> datos, String nombre) {
        this.datos = datos;
        this.nombre = nombre;
    }

    public HashMap<String, List<String>> getDatos() {
        return datos;
    }

    public void setDatos(HashMap<String, List<String>> datos) {
        this.datos = datos;
    }

    public void agregarDatos(String key, String nombre, String apellido, String edad){
        List<String> datosLista=new ArrayList<>();
        datosLista.add(nombre); datosLista.add(apellido); datosLista.add(edad);
        datos.put(key, datosLista);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
