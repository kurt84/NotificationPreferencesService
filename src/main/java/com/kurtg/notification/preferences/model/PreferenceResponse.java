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
    private String phoneNumber;
    private String emailAddress;

    public PreferenceResponse(String status, String statusDescription, boolean smsPreferenceFlag, boolean emailPreferenceFlag, String phoneNumber, String emailAddress) {
        this.status = status;
        this.statusDescription = statusDescription;
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public PreferenceResponse(ResponseStatus status, boolean smsPreferenceFlag, boolean emailPreferenceFlag, String phoneNumber, String emailAddress) {
        this.status = status.getStatus();
        this.statusDescription = status.getStatusDescription();
        this.smsPreferenceFlag = smsPreferenceFlag;
        this.emailPreferenceFlag = emailPreferenceFlag;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public PreferenceResponse(ResponseStatus status, Preference pref) {
        this.status = status.getStatus();
        this.statusDescription = status.getStatusDescription();
        if(pref != null) {
            this.smsPreferenceFlag = pref.getSmsPreferenceFlag();
            this.emailPreferenceFlag = pref.getEmailPreferenceFlag();
            this.phoneNumber = pref.getPhoneNumber();
            this.emailAddress = pref.getEmailAddress();
        }else{
            this.smsPreferenceFlag = false;
            this.emailPreferenceFlag = false;
            this.phoneNumber = "";
            this.emailAddress = "";
        }
    }
}
