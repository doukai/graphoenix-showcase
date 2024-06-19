package io.graphoenix.showcase.order.api;

import io.graphoenix.showcase.order.dto.objectType.Merchant;
import io.graphoenix.showcase.order.dto.objectType.Order;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Source;

@GraphQLApi
@ApplicationScoped
public class OrderApi {

    public Boolean error(@Source Order order) {
        throw new RuntimeException("error");
    }

    public Boolean error(@Source Merchant merchant) {
        throw new RuntimeException("error");
    }
}
