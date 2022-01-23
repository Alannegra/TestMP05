package com.company;

public class Correo {
            String Nombre;
            int postal;

    public Correo(String nombre, int postal) {
        Nombre = nombre;
        this.postal = postal;
    }

    /**
     * @author Alan
     * @param a El nombre que le damos al recurso
     * @param num asdasdasd
     */

            void sendMessage(String a,int num){
                a = Nombre;
                num = postal;


            }
}
