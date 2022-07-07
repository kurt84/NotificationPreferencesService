package com.kurtg.notification.preferences.formatters;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class ResponseStatus {
    @Getter
    private String status;
    @Getter
    private String statusDescription;

    private static final String success = "SUCCESS";
    private static final String failure = "FAILURE";

    private static final String successMessage = "Notification Received Successfully";
    private static final String failureMessage = "";

    private ResponseStatus(String status, String description){
        this.status = status;
        this.statusDescription = description;
    }

    public static ResponseStatus getSuccessStatus(){
        return new ResponseStatus(ResponseStatus.success, ResponseStatus.successMessage);
    }

    public static ResponseStatus getFailureStatus(){
        return new ResponseStatus(ResponseStatus.failure, ResponseStatus.failureMessage);
    }
}
