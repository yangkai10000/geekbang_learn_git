package org.geektimes.projects.user.orm.jpa;

import org.apache.derby.jdbc.EmbeddedDataSource;
import org.geektimes.projects.user.domain.User;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class JpaDemo {

    @PersistenceContext(name = "emf")
    private EntityManager entityManager;

    @Resource(name = "primaryDataSource")
    private DataSource dataSource;

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("emf", getProperties());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = new User();
        user.setName("小马哥");
        user.setPassword("******");
        user.setEmail("mercyblitz@gmail.com");
        user.setPhoneNumber("123456789");
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();

        System.out.println(entityManager.find(User.class, 1L));
    }

    private static Map getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        properties.put("hibernate.id.new_generator_mappings", false);
        properties.put("hibernate.connection.datasource", getDataSource());
        return properties;
    }

    private static Object getDataSource() {
        EmbeddedDataSource dataSource = new EmbeddedDataSource();
        dataSource.setDatabaseName("F:\\Derby\\db-derby-10.14.2.0-bin\\bin\\db\\user-platform");
        dataSource.setCreateDatabase("create");
        return dataSource;
    }
}
