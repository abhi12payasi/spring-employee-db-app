package com.app.bean;

import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

public class CustomPropertyResource extends ResourcePropertySource {

    public CustomPropertyResource(String location) throws IOException {
        super(location);
    }
}
