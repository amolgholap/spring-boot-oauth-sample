
package com.ge.pw.pmo.sfdc.config;

import com.ge.predix.uaa.token.lib.FastTokenServices;
import com.ge.predix.uaa.token.lib.FastTokenServicesCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amol Gholap.
 */
//@Profile("predix-local")
//@Configuration
//@EnableResourceServer
//@EnableWebSecurity
public class SecurityConfig {//extends ResourceServerConfigurerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);

  //  @Value("${vcap.services.power-env-service.credentials.VALID_SCOPE}")
    private String validScope = "uaa.resource";

   // @Value("${vcap.services.power-env-service.credentials.GLOBAL_UAA}")
    private String issuerId = "https://159aa01e-6d94-49a7-992a-748f24550dcc.predix-uaa.run.asv-pr.ice.predix.io/oauth/token";;
    //private String issuerId = "https://159aa01e-6d94-49a7-992a-748f24550dcc.predix-uaa.run.asv-pr.ice.predix.io/oauth/check_token";;

   // @Value("${app.maxSkewSeconds}")
    private int maxSkewSeconds = 600;

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().requestMatchers()
//                .antMatchers("/service/**").and().authorizeRequests()
//                .antMatchers(HttpMethod.PUT, "/service/**/platform/register").permitAll().antMatchers("/service/**")
//                .access("#oauth2.hasScope('" + validScope + "')");
//    }

//    @Bean
//    public FastTokenServices setFastTokenBean() {
//        FastTokenServices tokenService = new FastTokenServicesCreator().newInstance();
//        tokenService.setUseHttps(true);
//        tokenService.setStoreClaims(true);
//        List<String> uaaList = new ArrayList<>();
//        // Trusted UUA Url so we can validate token
//        LOGGER.debug("Issuer ID: '" + issuerId + "'");
//        uaaList.add(issuerId);
//        tokenService.setTrustedIssuers(uaaList);
//        tokenService.setMaxAcceptableClockSkewSeconds(maxSkewSeconds);
//        return tokenService;
//    }
}
