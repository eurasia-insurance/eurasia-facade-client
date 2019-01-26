package tech.lapsa.eurasia.facade;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import tech.lapsa.eurasia.domain.CompanyPointOfSale;

public interface CompanyPointOfSaleFacade extends EJBConstants {

    public static final String BEAN_NAME = "CompanyPointOfSaleFacadeBean";

    @Local
    public interface CompanyPointOfSaleFacadeLocal extends CompanyPointOfSaleFacade {
    }

    @Remote
    public interface CompanyPointOfSaleFacadeRemote extends CompanyPointOfSaleFacade {
    }

    List<CompanyPointOfSale> findAll();
    List<CompanyPointOfSale> findAllAvailable();

}