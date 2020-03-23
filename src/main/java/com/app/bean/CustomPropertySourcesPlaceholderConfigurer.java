package com.app.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.*;
import org.springframework.stereotype.Component;

@Component
public class CustomPropertySourcesPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer {

    @Autowired
    private Environment environment;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        super.postProcessBeanFactory(beanFactory);

        ConfigurableEnvironment cfg = (ConfigurableEnvironment) environment;

        //MutablePropertySources propertySources = cfg.getPropertySources();
//        for(PropertySource propertySource : propertySources){
//            System.out.println(propertySource);
//        }
    }
}
