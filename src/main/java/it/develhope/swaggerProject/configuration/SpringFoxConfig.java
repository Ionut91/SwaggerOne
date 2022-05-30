package it.develhope.swaggerProject.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo(
                        "Swagger example",
                        "Example swagger",
                        "1.0.0",
                        "https://didattica.polito.it/mail/termini.html",
                        new Contact("Ionut","https://blackweb.ro/","i.adjudeanu@yahoo.com"),
                        "PoliTo",
                        "https://www.polito.it/",
                        Collections.emptyList()

                )).tags(new Tag("Name Controller","The name controller"));
    }

}
