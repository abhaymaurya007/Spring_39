package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj14I18nMvcApplication {

    	  //To activate  I18n on the application
	@Bean(name="localeResolver")  //fixed bean id
	public    SessionLocaleResolver  createResolver() {
		SessionLocaleResolver  resolver=new SessionLocaleResolver();
		//resolver.setDefaultLocale(new Locale("en","US"));
		resolver.setDefaultLocale(Locale.of("en", "US"));
		return resolver;
	}
	
	// To activate  locale  for each request
	@Bean(name="lci")
	public   LocaleChangeInterceptor  createLCI() {
		LocaleChangeInterceptor  interceptor=new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj14I18nMvcApplication.class, args);
	}

}
