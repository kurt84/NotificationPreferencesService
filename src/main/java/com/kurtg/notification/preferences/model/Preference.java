package com.kurtg.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Preference {
    private String customerId;
    private Boolean smsPreferenceFlag;
    private Boolean emailPreferenceFlag;
    private String phoneNumber;
    private String emailAddress;

    public Preference(String customerId, Boolean smsPreferenceFlag, Boolean emailPreferenceFlag, String phoneNumber, String emailAddress) {
        this.customerId = customerId;
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
}
