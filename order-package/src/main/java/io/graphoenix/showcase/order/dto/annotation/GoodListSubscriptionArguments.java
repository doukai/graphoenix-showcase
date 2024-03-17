package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression1;
import io.graphoenix.core.dto.annotation.StringExpression1;
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
public @interface GoodListSubscriptionArguments {
  StringExpression1 id() default @StringExpression1;

  IntExpression1 quantity() default @IntExpression1;

  OrderExpression1 order() default @OrderExpression1;

  ProductExpression1 product() default @ProductExpression1;

  MerchantExpression1 merchant() default @MerchantExpression1;

  boolean includeDeprecated() default false;

  IntExpression1 version() default @IntExpression1;

  IntExpression1 realmId() default @IntExpression1;

  StringExpression1 createUserId() default @StringExpression1;

  StringExpression1 createTime() default @StringExpression1;

  StringExpression1 updateUserId() default @StringExpression1;

  StringExpression1 updateTime() default @StringExpression1;

  StringExpression1 createGroupId() default @StringExpression1;

  StringExpression1 __typename() default @StringExpression1;

  GoodOrderRelationExpression1 goodOrderRelation() default @GoodOrderRelationExpression1;

  GoodProductRelationExpression1 goodProductRelation() default @GoodProductRelationExpression1;

  GoodMerchantRelationExpression1 goodMerchantRelation() default @GoodMerchantRelationExpression1;

  GoodOrderBy1 orderBy() default @GoodOrderBy1;

  String[] groupBy() default {};

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  GoodExpression1[] exs() default {};

  int first() default 0;

  int last() default 0;

  int offset() default 0;

  String after() default "";

  String before() default "";

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

  String $orderBy() default "";

  String $groupBy() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";

  String $first() default "";

  String $last() default "";

  String $offset() default "";

  String $after() default "";

  String $before() default "";
}
