package com.kurtg.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Preference {
    @Getter
    private String customerId;
    @Getter
    private Boolean smsPreferenceFlag;
    @Getter
    private Boolean emailPreferenceFlag;
    @Getter
    private String emailAddress;
    @Getter
    private String phoneNumber;

    public Preference(String customerId, Boolean smsPreferenceFlag, Boolean emailPreferenceFlag, String emailAddress, String phoneNumber) {
        this.customerId = customerId;
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
}
