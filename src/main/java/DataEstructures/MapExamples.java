package DataEstructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapExamples {

    public static void main(String []args){

        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(1,"pruebaMap"); // Añade un elemento al Map
        nombreMap.get(1); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.containsKey(1); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue("pruebaMap"); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.remove(1); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.put(1,"prb1"); // Añade un elemento al Map
        nombreMap.put(2,"prb2"); // Añade un elemento al Map
        nombreMap.put(3,"prb3"); // Añade un elemento al Map
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map
        nombreMap.clear(); // Borra todos los componentes del Map

        nombreMap.put(1,"LamBorghini");
        nombreMap.put(2,"Ferrari");
        nombreMap.put(3,"Audi");
        nombreMap.put(4,"Mercedes Benz");
        nombreMap.put(5,"BMW");
        nombreMap.put(6,"KIA");
        nombreMap.put(7,"Porshe");
        nombreMap.put(8,"Toyota");
        nombreMap.put(9,"Honda");
        nombreMap.put(10,"Bugatti");
        nombreMap.put(11,"Volkswagen");
        nombreMap.put(12,"Ford");
        nombreMap.put(13,"Aston Martin");
        nombreMap.put(14,"Maserati");
        nombreMap.put(15,"Jaguar");
        nombreMap.put(16,"Rolls Royce");
        nombreMap.put(17,"Nissan");
        nombreMap.put(18,"Chevrolet");
        nombreMap.put(19,"Bentley");
        nombreMap.put(20,"Volvo");


        /* Initialize HashMap FORMA1*/
        Map<Integer, String> mapMarcasAutos = new HashMap<Integer, String>(){
            {
                put(1,"Hyundai");
                put(2,"Chevrolet");
                put(3,"KIA");
                put(4,"Nissan");
                put(5,"Citroen");
                put(6,"Renault");
            }
        };
        /* Initialize HashMap FORMA1*/

        /*  Imprimir valores con Iterator   */

        Iterator it = nombreMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + nombreMap.get(key));
        }


    }

}
