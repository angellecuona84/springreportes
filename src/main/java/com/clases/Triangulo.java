package com.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Angel Luis on 02/04/2015.
 */
@Entity
@Table(name="TRIANGULO")
@PrimaryKeyJoinColumn(name="ID")
public class Triangulo extends Figura{

    @Column(name="BASE", nullable = false)
    private int base;

    @Column(name="ALTURA", nullable = false)
    private int altura;

    @Column(name="HIPOTENUSA", nullable = false)
    private int hipotenusa;

    public Triangulo(int base, int altura, int hipotenusa) {
        super();
        super.numeroLados = 3;
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    @Override
    public double getArea() {
        return base*altura;
    }

    @Override
    public double getPerimetro() {
        return base + altura + hipotenusa;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}
