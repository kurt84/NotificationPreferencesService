package com.kurtg.notification.preferences.repositories;

import com.kurtg.notification.preferences.entities.NotificationPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferencesRepo extends JpaRepository<NotificationPreferences, Long>{
    NotificationPreferences findByCustomerid(String customerid);
}

