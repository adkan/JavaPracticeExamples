package gargabeCollector;

import java.util.Date;

class TestRecolector{

    public static void main(String[] args){

        TestRecolector test = new TestRecolector();
        test.testear();

    }
    public void testear(){
        Date fecha = null;
        for (int i = 0; i<99999999;i++){
            fecha = new Date(2011,8,7);
            fecha = null;
        }

        this.pasarGarbageCollector();
    }
    public void pasarGarbageCollector(){

        Runtime garbage = Runtime.getRuntime();
        System.out.println("Memoria libre antes de limpieza: "+ garbage.freeMemory());
        garbage.gc();
        System.out.println("Memoria libre tras la limpieza: "+ garbage.freeMemory());

        System.out.println("Total of Memory: "+ garbage.totalMemory());
        System.out.println("Max of Memory: "+ garbage.maxMemory());

        final long usedMem  = garbage.totalMemory() - garbage.freeMemory();
        System.out.println("Memory in use : "+ usedMem);


    }
}
