package com.kodecta.academy.commonmodule;



import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Component
public class RequestTrackerProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date TrackTime;
    private String requestBody;
    private String requestMethod;
    private String authorizationHeader;

    public RequestTrackerProjection(){

    }

    public RequestTrackerProjection(String requestBody, String requestMethod, String authorizationHeader){
        this.TrackTime = new Date();
        this.requestBody = requestBody;
        this.requestMethod=requestMethod;
        this.authorizationHeader=authorizationHeader;
    }



}
