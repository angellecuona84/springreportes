package com.dao;

import org.springframework.stereotype.Repository;
import com.clases.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Angel Luis on 05/04/2015.
 */
@Repository
public class FiguraDAOImpl implements FiguraDAO {

    private HashMap<String,WorkSpace> baseDatos;

    public FiguraDAOImpl() throws Exception {
        baseDatos = new HashMap<String,WorkSpace>();
        WorkSpace workSpace = new WorkSpace("Prueba", 3);
        workSpace.agregarFigura(new Triangulo(10,5,18));
        workSpace.agregarFigura(new Cuadrado(10));
        baseDatos.put("WorkSpace",workSpace);
    }

    @Override
    public List<Figura> getFiguras() {
        return (List<Figura>) baseDatos.get("WorkSpace").getFiguras();
    }

    @Override
    public double areaTotal() {
        return  baseDatos.get("WorkSpace").getAreaTotal();
    }

    @Override
    public double perimetroTotal() {
        return  baseDatos.get("WorkSpace").perimetroTotal();
    }

    @Override
    public void eliminarFiguraPos(int valor) {
        baseDatos.get("WorkSpace").eliminarFiguraPos(valor);
    }

    @Override
    public void adicionarCuadrado(int valor) throws Exception {
        baseDatos.get("WorkSpace").agregarFigura(new Cuadrado(valor));
    }

    @Override
    public WorkSpace obtenerAreaTrabajo(String id) {
        return baseDatos.get("WorkSpace");
    }

    /*@Override
    public prueba.webservice.WorkSpace obtenerAreaTrabajoServicio(int id) {
        return null;
    }*/
}
