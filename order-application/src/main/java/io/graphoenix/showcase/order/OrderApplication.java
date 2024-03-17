package io.graphoenix.showcase.order;

import io.graphoenix.spi.annotation.Application;

import static io.graphoenix.core.bootstrap.App.APP;

@Application
public class OrderApplication {

    public static void main(String[] args) {
        APP.run(args);
    }
}
