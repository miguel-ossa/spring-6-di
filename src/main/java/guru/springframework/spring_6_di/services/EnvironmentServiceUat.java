package guru.springframework.spring_6_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "User Acceptance Testing";
    }
}
