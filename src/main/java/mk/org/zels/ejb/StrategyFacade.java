/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mk.org.zels.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mk.org.zels.entity.Strategy;

/**
 *
 * @author georgy
 */
@Stateless
public class StrategyFacade extends AbstractFacade<Strategy> {

    @PersistenceContext(unitName = "mk.org.zels_ZelsMS_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StrategyFacade() {
        super(Strategy.class);
    }

}
