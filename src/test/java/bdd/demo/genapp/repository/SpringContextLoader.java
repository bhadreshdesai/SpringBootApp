package bdd.demo.genapp.repository;

import io.cucumber.java.Before;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class SpringContextLoader {
    @Before
    public void setUpSpringContext() {
    }
}
