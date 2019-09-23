package fr.epf.myResume;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 */
@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootConfiguration
@EnableSwagger2
public class Application {

  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class)
        .run();
  }

}
