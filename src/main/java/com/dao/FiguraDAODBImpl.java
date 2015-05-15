package com.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.clases.*;

import java.util.List;

/**
 * Created by Angel Luis on 19/04/2015.
 */
@Repository("FiguraDAODBImpl")
@Transactional
public class FiguraDAODBImpl extends AbstractDAO implements FiguraDAO {
    @Override
    public List<Figura> getFiguras() {
        Criteria criteria = getSession().createCriteria(Figura.class);
        return (List<Figura>) criteria.list();
    }

    @Override
    public double areaTotal() {
        return 0;
    }

    @Override
    public double perimetroTotal() {
        return 0;
    }

    @Override
    public void eliminarFiguraPos(int id) {
        /*Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("ssn",ssn));
        return (Employee) criteria.uniqueResult();*/

        Criteria criteria = getSession().createCriteria(Figura.class);
        criteria.add(Restrictions.eq("id", id));
        delete(criteria.uniqueResult());
    }

    @Override
    public void adicionarCuadrado(int valor) throws Exception {
        Criteria criteria = getSession().createCriteria(WorkSpace.class);
        criteria.add(Restrictions.eq("id", 1));
        Cuadrado cuadrado = new Cuadrado(valor);
        WorkSpace a = (WorkSpace) criteria.uniqueResult();
        cuadrado.setWorkSpace(a);
        persist(cuadrado);
    }

    @Override
    public WorkSpace obtenerAreaTrabajo(String id) {
        Criteria criteria = getSession().createCriteria(WorkSpace.class);
        criteria.add(Restrictions.eq("id", 1));
        return (WorkSpace) criteria.uniqueResult();
    }

   /* @Override
    public prueba.webservice.WorkSpace obtenerAreaTrabajoServicio(int id) {
        WorkSpace temp = this.obtenerAreaTrabajo(id+"");
        prueba.webservice.WorkSpace result = new prueba.webservice.WorkSpace();
        result.setId(temp.getId());
        result.setLimiteFigura(temp.getLimiteFigura());
        result.setNombre(temp.getNombre());
        return result;
    }*/
}
