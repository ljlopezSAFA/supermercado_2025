package com.sl.utilidades;

import com.sl.modelos.Cliente;

public class UtilidadesCliente {


    public  static boolean esDniValido(Cliente cliente){

        String dni = cliente.getDni();


        //1º TENGA 9 DIGITOS
        if(dni.length() != 9){
            return false;
        }
        //2º LOS 8 PRIMEROS SEAN LETRAS
        String dni8digitos = dni.substring(0,7);
        if( !dni8digitos.matches("[0-9]*")){
            return  false;
        }

        //3º LA ULTIMA LETRA SEA UN NÚMERO
        String dniUltimoDigito = dni.substring(8);
        if(!dniUltimoDigito.matches("[A-Za-z]*")){
            return false;
        }


        return true;


    }

}
