package com.sl.utilidades;

import com.sl.modelos.Producto;
import com.sl.modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){


        List<Producto> productoSolucion = new ArrayList<>();

        for(Producto p: productos){
            if(p.getTipoProducto().equals(tipo)){
                productoSolucion.add(p);
            }
        }
        return productoSolucion;

    }


    public List<Producto> getPorTipo2(List<Producto> productos, TipoProducto tipo){
        return productos.stream().filter(p-> p.getTipoProducto().equals(tipo)).toList();

    }


}



