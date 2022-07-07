package com.kurtg.notification.preferences.controllers;

import com.kurtg.notification.preferences.model.Preference;
import com.kurtg.notification.preferences.model.PreferenceRequest;
import com.kurtg.notification.preferences.model.PreferenceResponse;
import com.kurtg.notification.preferences.services.PreferencesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/notification/preferences")
@Api("Preferences")
public class PreferencesController {

    @Autowired
    private PreferencesService preferencesService;

    @GetMapping("/{customerId}")
    @ApiOperation(value = "Get preferences for customer id", response = PreferenceResponse.class)
    public PreferenceResponse get(@PathVariable("customerId") String customerId) {
        PreferenceRequest req = new PreferenceRequest();
        req.setCustomerId(customerId);
        return preferencesService.ReadByCustomerId(req);
    }

    @PostMapping
    @ApiOperation(value = "Get preferences for customer id", response = PreferenceResponse.class)
    public PreferenceResponse postFunction1(@RequestBody PreferenceRequest req) {
        return preferencesService.ReadByCustomerId(req);
    }


//    @PostMapping(consumes="application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public com.kurtg.notification.preferences.model.Preference post(@RequestBody com.kurtg.notification.preferences.model.Preference pref) {
////        return preferencesService.save(pref);
//        return pref;
//    }
}