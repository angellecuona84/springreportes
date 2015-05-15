package com.dao;

import com.clases.*;

import java.util.List;

/**
 * Created by Angel Luis on 05/04/2015.
 */
public interface FiguraDAO {

    public List<Figura> getFiguras();
    public double areaTotal();
    public double perimetroTotal();
    public void eliminarFiguraPos(int valor);
    public void adicionarCuadrado(int valor) throws Exception;
    public WorkSpace obtenerAreaTrabajo(String id);

    //public prueba.webservice.WorkSpace obtenerAreaTrabajoServicio(int id);
}
