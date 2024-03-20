package io.graphoenix.showcase.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Subscription {
  OrderSubscriptionArguments order() default @OrderSubscriptionArguments;

  OrderListSubscriptionArguments orderList() default @OrderListSubscriptionArguments;

  OrderConnectionSubscriptionArguments orderConnection(
      ) default @OrderConnectionSubscriptionArguments;

  GoodSubscriptionArguments good() default @GoodSubscriptionArguments;

  GoodListSubscriptionArguments goodList() default @GoodListSubscriptionArguments;

  GoodConnectionSubscriptionArguments goodConnection() default @GoodConnectionSubscriptionArguments;

  ProductSubscriptionArguments product() default @ProductSubscriptionArguments;

  ProductListSubscriptionArguments productList() default @ProductListSubscriptionArguments;

  ProductConnectionSubscriptionArguments productConnection(
      ) default @ProductConnectionSubscriptionArguments;

  MerchantSubscriptionArguments merchant() default @MerchantSubscriptionArguments;

  MerchantListSubscriptionArguments merchantList() default @MerchantListSubscriptionArguments;

  MerchantConnectionSubscriptionArguments merchantConnection(
      ) default @MerchantConnectionSubscriptionArguments;

  GoodOrderRelationSubscriptionArguments goodOrderRelation(
      ) default @GoodOrderRelationSubscriptionArguments;

  GoodOrderRelationListSubscriptionArguments goodOrderRelationList(
      ) default @GoodOrderRelationListSubscriptionArguments;

  GoodOrderRelationConnectionSubscriptionArguments goodOrderRelationConnection(
      ) default @GoodOrderRelationConnectionSubscriptionArguments;

  GoodProductRelationSubscriptionArguments goodProductRelation(
      ) default @GoodProductRelationSubscriptionArguments;

  GoodProductRelationListSubscriptionArguments goodProductRelationList(
      ) default @GoodProductRelationListSubscriptionArguments;

  GoodProductRelationConnectionSubscriptionArguments goodProductRelationConnection(
      ) default @GoodProductRelationConnectionSubscriptionArguments;

  GoodMerchantRelationSubscriptionArguments goodMerchantRelation(
      ) default @GoodMerchantRelationSubscriptionArguments;

  GoodMerchantRelationListSubscriptionArguments goodMerchantRelationList(
      ) default @GoodMerchantRelationListSubscriptionArguments;

  GoodMerchantRelationConnectionSubscriptionArguments goodMerchantRelationConnection(
      ) default @GoodMerchantRelationConnectionSubscriptionArguments;

  MerchantUserRelationSubscriptionArguments merchantUserRelation(
      ) default @MerchantUserRelationSubscriptionArguments;

  MerchantUserRelationListSubscriptionArguments merchantUserRelationList(
      ) default @MerchantUserRelationListSubscriptionArguments;

  MerchantUserRelationConnectionSubscriptionArguments merchantUserRelationConnection(
      ) default @MerchantUserRelationConnectionSubscriptionArguments;

  MerchantOrganizationRelationSubscriptionArguments merchantOrganizationRelation(
      ) default @MerchantOrganizationRelationSubscriptionArguments;

  MerchantOrganizationRelationListSubscriptionArguments merchantOrganizationRelationList(
      ) default @MerchantOrganizationRelationListSubscriptionArguments;

  MerchantOrganizationRelationConnectionSubscriptionArguments merchantOrganizationRelationConnection(
      ) default @MerchantOrganizationRelationConnectionSubscriptionArguments;

  MerchantDirectorSubscriptionArguments merchantDirector(
      ) default @MerchantDirectorSubscriptionArguments;

  MerchantDirectorListSubscriptionArguments merchantDirectorList(
      ) default @MerchantDirectorListSubscriptionArguments;

  MerchantDirectorConnectionSubscriptionArguments merchantDirectorConnection(
      ) default @MerchantDirectorConnectionSubscriptionArguments;
}
