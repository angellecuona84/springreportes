package com.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Entity
@Table(name="HEXAGONO")
@PrimaryKeyJoinColumn(name="ID")
public class Hexagono extends Figura{

    @Column(name="RADIO", nullable = false)
    private int radio;

    public Hexagono(int radio) {
        super();
        super.numeroLados = 6;
        this.radio = radio;
    }

    public Hexagono() {
        super.numeroLados = 6;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return numeroLados*radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getApotema(){
        return 5;
    }
}
