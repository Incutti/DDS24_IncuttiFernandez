import java.util.*;

public class Documento {
    private Map<String, List<String>> datos;
    private String nombre;

    public Documento() {
        nombre="";
        datos=new Map<String, List<String>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public List<String> get(Object key) {
                return null;
            }

            @Override
            public List<String> put(String key, List<String> value) {
                return null;
            }

            @Override
            public List<String> remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends List<String>> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<List<String>> values() {
                return null;
            }

            @Override
            public Set<Entry<String, List<String>>> entrySet() {
                return null;
            }
        };

    }

    public Documento(Map<String, List<String>> datos, String nombre) {
        this.datos = datos;
        this.nombre = nombre;
    }

    public Map<String, List<String>> getDatos() {
        return datos;
    }

    public void setDatos(Map<String, List<String>> datos) {
        this.datos = datos;
    }

    public void agregarDatos(String key, String nombre, String apellido, String edad){
        List<String> datosLista= Collections.unmodifiableList(new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        });
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
