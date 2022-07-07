package com.kurtg.notification.preferences.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name="notification_preferences")
@Getter
@Setter
public class NotificationPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerid;
    private Boolean smspreferenceflag;
    private Boolean emailpreferenceflag;
    private String phonenumber;
    private String emailaddress;

    public NotificationPreferences(){}

    public NotificationPreferences(Long id, String customerid, Boolean smspreferenceflag, Boolean emailpreferenceflag, String phonenumber, String emailaddress) {
        this.id = id;
        this.customerid = customerid;
        this.smspreferenceflag = smspreferenceflag;
        this.emailpreferenceflag = emailpreferenceflag;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
}
