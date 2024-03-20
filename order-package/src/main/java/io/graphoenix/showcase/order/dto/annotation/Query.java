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
public @interface Query {
  OrderQueryArguments order() default @OrderQueryArguments;

  OrderListQueryArguments orderList() default @OrderListQueryArguments;

  OrderConnectionQueryArguments orderConnection() default @OrderConnectionQueryArguments;

  GoodQueryArguments good() default @GoodQueryArguments;

  GoodListQueryArguments goodList() default @GoodListQueryArguments;

  GoodConnectionQueryArguments goodConnection() default @GoodConnectionQueryArguments;

  ProductQueryArguments product() default @ProductQueryArguments;

  ProductListQueryArguments productList() default @ProductListQueryArguments;

  ProductConnectionQueryArguments productConnection() default @ProductConnectionQueryArguments;

  MerchantQueryArguments merchant() default @MerchantQueryArguments;

  MerchantListQueryArguments merchantList() default @MerchantListQueryArguments;

  MerchantConnectionQueryArguments merchantConnection() default @MerchantConnectionQueryArguments;

  GoodOrderRelationQueryArguments goodOrderRelation() default @GoodOrderRelationQueryArguments;

  GoodOrderRelationListQueryArguments goodOrderRelationList(
      ) default @GoodOrderRelationListQueryArguments;

  GoodOrderRelationConnectionQueryArguments goodOrderRelationConnection(
      ) default @GoodOrderRelationConnectionQueryArguments;

  GoodProductRelationQueryArguments goodProductRelation(
      ) default @GoodProductRelationQueryArguments;

  GoodProductRelationListQueryArguments goodProductRelationList(
      ) default @GoodProductRelationListQueryArguments;

  GoodProductRelationConnectionQueryArguments goodProductRelationConnection(
      ) default @GoodProductRelationConnectionQueryArguments;

  GoodMerchantRelationQueryArguments goodMerchantRelation(
      ) default @GoodMerchantRelationQueryArguments;

  GoodMerchantRelationListQueryArguments goodMerchantRelationList(
      ) default @GoodMerchantRelationListQueryArguments;

  GoodMerchantRelationConnectionQueryArguments goodMerchantRelationConnection(
      ) default @GoodMerchantRelationConnectionQueryArguments;

  MerchantUserRelationQueryArguments merchantUserRelation(
      ) default @MerchantUserRelationQueryArguments;

  MerchantUserRelationListQueryArguments merchantUserRelationList(
      ) default @MerchantUserRelationListQueryArguments;

  MerchantUserRelationConnectionQueryArguments merchantUserRelationConnection(
      ) default @MerchantUserRelationConnectionQueryArguments;

  MerchantOrganizationRelationQueryArguments merchantOrganizationRelation(
      ) default @MerchantOrganizationRelationQueryArguments;

  MerchantOrganizationRelationListQueryArguments merchantOrganizationRelationList(
      ) default @MerchantOrganizationRelationListQueryArguments;

  MerchantOrganizationRelationConnectionQueryArguments merchantOrganizationRelationConnection(
      ) default @MerchantOrganizationRelationConnectionQueryArguments;

  MerchantDirectorQueryArguments merchantDirector() default @MerchantDirectorQueryArguments;

  MerchantDirectorListQueryArguments merchantDirectorList(
      ) default @MerchantDirectorListQueryArguments;

  MerchantDirectorConnectionQueryArguments merchantDirectorConnection(
      ) default @MerchantDirectorConnectionQueryArguments;
}
