package com.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Entity
@Table(name="CUADRADO")
@PrimaryKeyJoinColumn(name="ID")
public class Cuadrado extends Figura {

    @Column(name="LADO", nullable = false)
    private int lado;

    public Cuadrado() {
        super();
        super.numeroLados = 4;
    }

    public Cuadrado(int lado) {
        super();
        super.numeroLados = 4;
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return lado*4;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
