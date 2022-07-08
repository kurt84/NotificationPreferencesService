package com.kurtg.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class PreferenceRequest {

    private String customerId;

    @Override
    public String toString() {
        return "NotificationPreferencesRequest{" +
                "customerId='" + customerId + '\'' +
                '}';
    }
}
