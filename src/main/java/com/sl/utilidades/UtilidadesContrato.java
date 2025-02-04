package com.sl.utilidades;

import com.sl.modelos.Contrato;
import com.sl.modelos.TipoContrato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesContrato {


    /**
     * Que devuelve un mapa con cada tipo de contrato y el número de
     * contratos que hay de este tipo.
     *
     * @param contratos
     * @return
     */
    public static Map<TipoContrato, Integer> getNumContratosPorTipo(List<Contrato> contratos) {

        Map<TipoContrato, Integer> mapaSolucion = new HashMap<>();

        for (Contrato c : contratos) {
            if (mapaSolucion.containsKey(c.getTipoContrato())) {
                Integer numFolios = mapaSolucion.get(c.getTipoContrato());
                mapaSolucion.put(c.getTipoContrato(), numFolios + 1);
            } else {
                mapaSolucion.put(c.getTipoContrato(), 1);
            }

        }
        return mapaSolucion;

    }


    /**
     * Que devuelve un mapa con los tipo de contrato y la lista con todos los
     * contratos que tienen dicho tipo
     *
     * @param contratos
     * @return
     */
    public Map<TipoContrato, List<Contrato>> getListContratosPorTipo(List<Contrato> contratos) {

        Map<TipoContrato, List<Contrato>> mapaSolucion = new HashMap<>();

        for (Contrato c : contratos) {

            if (mapaSolucion.containsKey(c.getTipoContrato())) {
                mapaSolucion.get(c.getTipoContrato()).add(c);

            } else {
                mapaSolucion.put(c.getTipoContrato(), new ArrayList<>(List.of(c)));

            }


        }

        return mapaSolucion;

    }


}
