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
public @interface Mutation {
  OrderMutationArguments order() default @OrderMutationArguments;

  OrderListMutationArguments orderList() default @OrderListMutationArguments;

  GoodMutationArguments good() default @GoodMutationArguments;

  GoodListMutationArguments goodList() default @GoodListMutationArguments;

  ProductMutationArguments product() default @ProductMutationArguments;

  ProductListMutationArguments productList() default @ProductListMutationArguments;

  MerchantMutationArguments merchant() default @MerchantMutationArguments;

  MerchantListMutationArguments merchantList() default @MerchantListMutationArguments;

  GoodOrderRelationMutationArguments goodOrderRelation(
      ) default @GoodOrderRelationMutationArguments;

  GoodOrderRelationListMutationArguments goodOrderRelationList(
      ) default @GoodOrderRelationListMutationArguments;

  GoodProductRelationMutationArguments goodProductRelation(
      ) default @GoodProductRelationMutationArguments;

  GoodProductRelationListMutationArguments goodProductRelationList(
      ) default @GoodProductRelationListMutationArguments;

  GoodMerchantRelationMutationArguments goodMerchantRelation(
      ) default @GoodMerchantRelationMutationArguments;

  GoodMerchantRelationListMutationArguments goodMerchantRelationList(
      ) default @GoodMerchantRelationListMutationArguments;

  MerchantUserRelationMutationArguments merchantUserRelation(
      ) default @MerchantUserRelationMutationArguments;

  MerchantUserRelationListMutationArguments merchantUserRelationList(
      ) default @MerchantUserRelationListMutationArguments;

  MerchantOrganizationRelationMutationArguments merchantOrganizationRelation(
      ) default @MerchantOrganizationRelationMutationArguments;

  MerchantOrganizationRelationListMutationArguments merchantOrganizationRelationList(
      ) default @MerchantOrganizationRelationListMutationArguments;

  MerchantDirectorMutationArguments merchantDirector() default @MerchantDirectorMutationArguments;

  MerchantDirectorListMutationArguments merchantDirectorList(
      ) default @MerchantDirectorListMutationArguments;
}
