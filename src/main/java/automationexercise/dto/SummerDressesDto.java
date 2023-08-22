package automationexercise.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SummerDressesDto {

    private String size;
    private String color;
    private String property;
    private String compositions;
    private String styles;
    private String availability;
    private String condition;


}
