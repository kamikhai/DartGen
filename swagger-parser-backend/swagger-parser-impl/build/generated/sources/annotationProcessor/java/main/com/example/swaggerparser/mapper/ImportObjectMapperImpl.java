package com.example.swaggerparser.mapper;

import com.example.swaggerparser.dto.ImportObject;
import com.example.swaggerparser.dto.ImportObject.ImportObjectBuilder;
import com.example.swaggerparser.entity.TypeMapping;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-26T21:02:19+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.jar, environment: Java 11.0.8 (Oracle Corporation)"
)
@Component
public class ImportObjectMapperImpl implements ImportObjectMapper {

    @Override
    public ImportObject toDto(TypeMapping typeMapping) {
        if ( typeMapping == null ) {
            return null;
        }

        ImportObjectBuilder importObject = ImportObject.builder();

        importObject.name( typeMapping.getFlutterType() );
        importObject.importClass( typeMapping.getImportClass() );

        return importObject.build();
    }
}
