/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.mybus.client;

import com.sjsu.mybus.model.Bus;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aldok
 */
@Stateless
public class BusFacade extends AbstractFacade<Bus> {
    @PersistenceContext(unitName = "MyBusClientPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BusFacade() {
        super(Bus.class);
    }
    
}
