package ua.spalah.spring.di.java.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.spalah.spring.di.java.dao.ClientDao;

@Repository
@Qualifier("hibernate")
public class ClientDaoHibernate implements ClientDao {

    @Override
    public String getProvider() {
        return "I'm based on Hibernate";
    }
}
