package com.kurtg.notification.preferences.model;

import com.kurtg.notification.preferences.formatters.ResponseStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PreferenceResponse {
    private String status;
    private String statusDescription;
    private boolean smsPreferenceFlag;
    private boolean emailPreferenceFlag;
    private String emailAddress;
    private String phoneNumber;

    public PreferenceResponse(String status, String statusDescription, boolean smsPreferenceFlag, boolean emailPreferenceFlag, String emailAddress, String phoneNumber) {
        this.status = status;
        this.statusDescription = statusDescription;
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public PreferenceResponse(ResponseStatus status, boolean smsPreferenceFlag, boolean emailPreferenceFlag, String emailAddress, String phoneNumber) {
        this.status = status.getStatus();
        this.statusDescription = status.getStatusDescription();
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public PreferenceResponse(ResponseStatus status, Preference pref) {
        this.status = status.getStatus();
        this.statusDescription = status.getStatusDescription();
        if(pref != null) {
            this.smsPreferenceFlag = pref.getSmsPreferenceFlag();
            this.emailPreferenceFlag = pref.getEmailPreferenceFlag();
            this.emailAddress = pref.getEmailAddress();
            this.phoneNumber = pref.getPhoneNumber();
        }else{
            this.smsPreferenceFlag = false;
            this.emailPreferenceFlag = false;
            this.emailAddress = "";
            this.phoneNumber = "";
        }
    }
}
