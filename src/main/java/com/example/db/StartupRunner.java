package com.example.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class StartupRunner implements CommandLineRunner,InitializingBean {
    protected static final Logger logger = LoggerFactory.getLogger(StartupRunner.class);

    @Autowired
    private DataSource ds;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("Datasource: " + ds.toString());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(ds);
    }
}