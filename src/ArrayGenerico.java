import java.util.ArrayList;
import java.util.List;

public class ArrayGenerico<T> {
    //3. Crear una clase genérica para almacenar tanto los pilotos como los tags en un
    //arraylist. Las opciones de esta clase genérica son agregar, eliminar y recuperar según
    //posición. 20 pts.
    public List<T> lista;

    public ArrayGenerico() {
        lista = new ArrayList<>();
    }

    public ArrayGenerico(List<T> lista) {
        this.lista = lista;
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public boolean agregar(T t) {
        return lista.add(t);
    }

    public boolean eliminar(T t) {
        return lista.remove(t);
    }

    public T recuperarPosicion(int pos) {
        return lista.get(pos);
    }

    @Override
    public String toString() {
        return "ArrayGenerico{" +
                "lista=" + lista +
                '}';
    }
}
