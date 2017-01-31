package nl.sogeti.webshop.service;

import nl.sogeti.webshop.product.CatFood;

import javax.ejb.Stateless;

/**
 * Created by ikikuchi on 13-1-2017.
 */
@Stateless
public class CatFoodService extends AbstractCrudRepository<CatFood> {


    @Override
    protected Class<CatFood> getEntityClass(){
        return CatFood.class;

    }
}