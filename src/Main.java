import Aeropuertos.Aeropuerto;
import Aeropuertos.Avion;
import Aeropuertos.Etiqueta;
import Exepcion.CapacidadAeropuertoException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static Exepcion.CapacidadAeropuertoException.filtro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //2. De la lista anterior de aeropuertos generar otra lista pasando los aeropuertos
        //cuya capacidad sea mayor a una enviada por parámetro. Cuando la capacidad sea
        //menor o igual a la enviada, lanzar una excepción custom almacenando la capacidad
        //del aeropuerto. 20 pts.

        //3. Crear una clase genérica para almacenar tanto los pilotos como los tags en un
        //arraylist. Las opciones de esta clase genérica son agregar, eliminar y recuperar según
        //posición. 20 pts.

        //4. Desde la lista genérica pasar a un hashset todos los tags. Implementar el
        //equals en la etiqueta. 20 pts.
        //Implementar un main para probar todas las funcionalidades. 10 pts.


        // Crear etiquetas

        // Crear aviones
        Avion avion1 = new Avion(1, "Lucas", 10);
        Avion avion2 = new Avion(2, "Nico", 20);
        Avion avion3 = new Avion(3, "Facundo", 30);
        Avion avion4 = new Avion(4, "Kevin", 40);

        // Crear aeropuertos
        Aeropuerto aeropuerto1 = new Aeropuerto("A1", true, "Balance 1", "Imagen 1", 100, "Aeropuerto 1");

        Aeropuerto aeropuerto2 = new Aeropuerto("A2", false, "Balance 2", "Imagen 2", 200, "Aeropuerto 2");

        Aeropuerto aeropuerto3 = new Aeropuerto("A3", true, "Balance 3", "Imagen 3", 300, "Aeropuerto 3");

        Aeropuerto aeropuerto4 = new Aeropuerto("A4", false, "Balance 4", "Imagen 4", 400, "Aeropuerto 4");

        // Agregar etiquetas a aeropuerto1
        aeropuerto1.listaEtiqueta.add(Etiqueta.DUIS);

        // Agregar etiquetas a aeropuerto2
        aeropuerto2.listaEtiqueta.add(Etiqueta.LOREM);
        aeropuerto2.listaEtiqueta.add(Etiqueta.EST);

        // Agregar etiquetas a aeropuerto3
        aeropuerto3.listaEtiqueta.add(Etiqueta.MINIM);
        aeropuerto3.listaEtiqueta.add(Etiqueta.LABORIS);

        // Agregar etiquetas a aeropuerto4
        aeropuerto4.listaEtiqueta.add(Etiqueta.FUGIAT);
        aeropuerto4.listaEtiqueta.add(Etiqueta.ALIQUA);

        // Agregar aviones a aeropuerto1
        aeropuerto1.aviones.add(avion1);

        // Agregar aviones a aeropuerto2
        // aeropuerto2.aviones.add(avion1);
        aeropuerto2.aviones.add(avion2);

        // Agregar aviones a aeropuerto3
        // aeropuerto3.aviones.add(avion1);
        //aeropuerto3.aviones.add(avion2);
        aeropuerto3.aviones.add(avion3);

        // Agregar aviones a aeropuerto4
        //aeropuerto4.aviones.add(avion1);
        //aeropuerto4.aviones.add(avion2);
        //aeropuerto4.aviones.add(avion3);
        aeropuerto4.aviones.add(avion4);

        // Imprimir información de los aeropuertos
//        System.out.println(aeropuerto1);
//        System.out.println(aeropuerto2);
//        System.out.println(aeropuerto3);
//        System.out.println(aeropuerto4);


        List<Aeropuerto> listaDeAeropuertos = new ArrayList<>();

        listaDeAeropuertos.add(aeropuerto3);
        listaDeAeropuertos.add(aeropuerto4);
        listaDeAeropuertos.add(aeropuerto2);
        listaDeAeropuertos.add(aeropuerto1);

        List<Aeropuerto> filtrada = new ArrayList<>();


        try {
            filtrada = filtro(listaDeAeropuertos, 100);
        } catch (CapacidadAeropuertoException e) {
            int capacidadExepcion = e.getCapacidad();
            System.out.println("No se agrego porque la capacidad era: " + capacidadExepcion);
        } finally {
            for (Aeropuerto a : filtrada)
                System.out.println(a.toString());
        }

        ArrayGenerico<String> listaDePilotos = new ArrayGenerico<>();
        listaDePilotos.agregar(avion1.getPiloto());
        listaDePilotos.agregar(avion1.getPiloto());
        System.out.println(listaDePilotos.toString());
        //listaDePilotos.eliminar(avion2.getPiloto());
        try {
            listaDePilotos.recuperarPosicion(0);
        } catch (Exception e) {
            System.out.println("no esta esa posicion :(");
        }
        Set<String> setDeTags = new HashSet<>();
        setDeTags.add(listaDePilotos.recuperarPosicion(0));
        setDeTags.add(listaDePilotos.recuperarPosicion(1));
        for (String s : setDeTags) {
            System.out.println(s);
        }


        // Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoAEscribir + ".json"));
//
//        gson.toJson(lista, ListaCliente.class, bufferedWriter);
//        bufferedWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivoAEscribir + ".json"));
//
//        ListaCliente listaExterna = gson.fromJson(bufferedReader, ListaCliente.class);
//        System.out.println(listaExterna);
    }
}



