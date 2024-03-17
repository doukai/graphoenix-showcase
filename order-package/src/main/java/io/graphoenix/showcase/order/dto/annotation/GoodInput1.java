package io.graphoenix.showcase.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface GoodInput1 {
  String id() default "";

  int quantity() default 0;

  OrderInput2 order() default @OrderInput2;

  ProductInput2 product() default @ProductInput2;

  MerchantInput2 merchant() default @MerchantInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Good";

  GoodOrderRelationInput2[] goodOrderRelation() default {};

  GoodProductRelationInput2[] goodProductRelation() default {};

  GoodMerchantRelationInput2[] goodMerchantRelation() default {};

  GoodExpression2 where() default @GoodExpression2;

  String $id() default "";

  String $quantity() default "";

  String $order() default "";

  String $product() default "";

  String $merchant() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $goodOrderRelation() default "";

  String $goodProductRelation() default "";

  String $goodMerchantRelation() default "";

  String $where() default "";
}
