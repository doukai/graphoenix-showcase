package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression2;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.core.dto.enumType.Conditional;
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
public @interface GoodExpression1 {
  StringExpression2 id() default @StringExpression2;

  IntExpression2 quantity() default @IntExpression2;

  OrderExpression2 order() default @OrderExpression2;

  ProductExpression2 product() default @ProductExpression2;

  MerchantExpression2 merchant() default @MerchantExpression2;

  boolean includeDeprecated() default false;

  IntExpression2 version() default @IntExpression2;

  IntExpression2 realmId() default @IntExpression2;

  StringExpression2 createUserId() default @StringExpression2;

  StringExpression2 createTime() default @StringExpression2;

  StringExpression2 updateUserId() default @StringExpression2;

  StringExpression2 updateTime() default @StringExpression2;

  StringExpression2 createGroupId() default @StringExpression2;

  StringExpression2 __typename() default @StringExpression2;

  GoodOrderRelationExpression2 goodOrderRelation() default @GoodOrderRelationExpression2;

  GoodProductRelationExpression2 goodProductRelation() default @GoodProductRelationExpression2;

  GoodMerchantRelationExpression2 goodMerchantRelation() default @GoodMerchantRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  GoodExpression2[] exs() default {};

  String $id() default "";

  String $quantity() default "";

  String $order() default "";

  String $product() default "";

  String $merchant() default "";

  String $includeDeprecated() default "";

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

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
