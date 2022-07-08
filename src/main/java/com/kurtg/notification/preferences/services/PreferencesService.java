package com.kurtg.notification.preferences.services;

import com.kurtg.notification.preferences.formatters.ResponseStatus;
import com.kurtg.notification.preferences.entities.NotificationPreferences;
import com.kurtg.notification.preferences.model.Preference;
import com.kurtg.notification.preferences.model.PreferenceRequest;
import com.kurtg.notification.preferences.model.PreferenceResponse;
import com.kurtg.notification.preferences.repositories.PreferencesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

    @Autowired
    private PreferencesRepo repo;

    public PreferenceResponse ReadByCustomerId(PreferenceRequest req){
        return mapEntityToResponse(repo.findByCustomerid(req.getCustomerId()));
    }

    public PreferenceResponse Create(Preference pref){
        return mapEntityToResponse(repo.save(model2Entity(pref)));
    }

    static private Preference entity2Model(NotificationPreferences pref){
        if(pref != null)
            return new Preference(
                pref.getCustomerid(),
                pref.getSmspreferenceflag(),
                pref.getEmailpreferenceflag(),
                pref.getPhonenumber(),
                pref.getEmailaddress()
            );
        return new Preference(
                "",
                false,
                false,
                "",
                ""
        );
    }

    static private NotificationPreferences model2Entity(Preference pref){
        if(pref != null)
            return new NotificationPreferences(
                    0L,
                    pref.getCustomerId(),
                    pref.getSmsPreferenceFlag(),
                    pref.getEmailPreferenceFlag(),
                    pref.getPhoneNumber(),
                    pref.getEmailAddress()
            );
        return new NotificationPreferences(
                0L,
                "",
                false,
                false,
                "",
                ""
        );
    }

    static private PreferenceResponse mapEntityToResponse(NotificationPreferences pref){
        ResponseStatus status;
        if(pref != null){
            status = ResponseStatus.getSuccessStatus();
        } else {
            status = ResponseStatus.getFailureStatus();
        }

        return new PreferenceResponse(status, entity2Model(pref));
    }
}
