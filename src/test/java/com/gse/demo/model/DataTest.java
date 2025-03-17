package com.gse.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class DataTest {
    private String dataUser;
    private String dataPassword;
    private String pubId;
    private String nameSubscription1;
    private String nameSubscription2;
    private String frameTime;
    private String scenario;
    private String topic;
    private String application;
    private String msjError;

}
