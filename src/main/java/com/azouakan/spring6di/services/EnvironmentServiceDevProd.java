package com.azouakan.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class EnvironmentServiceDevProd implements EnvironmentService {
    @Override
    public String getEnv() {
        return "PROD";
    }
}
