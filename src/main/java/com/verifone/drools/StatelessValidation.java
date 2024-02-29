package com.verifone.drools;

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import com.verifone.drools.repository.ApplicationRepository;
import com.verifone.drools.service.Passport;

public class StatelessValidation {

   public static void main(String[] args) {

      List<Passport> passports = ApplicationRepository.getPassports();

      KieContainer kieClasspathContainer = KieServices.Factory.get().getKieClasspathContainer();
      StatelessKieSession newStatelessKieSession = kieClasspathContainer.newStatelessKieSession("StatelessValidation");
      newStatelessKieSession.execute(passports);
   }

}
