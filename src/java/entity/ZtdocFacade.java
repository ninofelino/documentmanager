/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dinov
 */
@Stateless
public class ZtdocFacade extends AbstractFacade<Ztdoc> {

    @PersistenceContext(unitName = "documentmanagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZtdocFacade() {
        super(Ztdoc.class);
    }
    
}
