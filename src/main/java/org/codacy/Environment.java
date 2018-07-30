package org.codacy;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:${env}.properties"
})
public interface Environment extends Config {

    String url();

    String username();

    String password();

}