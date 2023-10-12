package br.com.fiuza;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(
    tags = {
        @Tag(
            name = "Student Menu", 
            description = "This API has Students details")
    }, 
    info = @Info(
        title = "Swagger with quarkus", 
        version = "1.0.1", 
        contact = @Contact(
                    name = "Swagger", 
                    url = "", 
                    email = ""), 
        license = @License(
                    name = "", 
                    url = "")
        )
)

public class CustonAPI extends Application {

}