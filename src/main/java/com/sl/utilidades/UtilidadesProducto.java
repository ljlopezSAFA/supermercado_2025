package com.sl.utilidades;

import com.sl.modelos.Almacen;
import com.sl.modelos.Producto;
import com.sl.modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public static List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){

        List<Producto> productoSolucion = new ArrayList<>();

        for(Producto p: productos){
            if(p.getTipoProducto().equals(tipo)){
                productoSolucion.add(p);
            }
        }
        return productoSolucion;

    }



    public static List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){


        List<Producto> solucion = new ArrayList<>();


        for(Producto p:  productos){

            //SI el producto (p) cumple que su almacén es el mismo -> almacen
            if(p.getAlmacen().equals(almacen)) {
                solucion.add(p);
            }

        }

        return solucion;


    }





}



