package com.azouakan.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvironmentServiceDevUat implements EnvironmentService {
    @Override
    public String getEnv() {
        return "UAT";
    }
}
