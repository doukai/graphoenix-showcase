package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.showcase.user.dto.annotation.UserInput1;
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
public @interface OrderMutationArguments {
  String id() default "";

  String number() default "";

  UserInput1 buyer() default @UserInput1;

  GoodInput1[] goods() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Order";

  int buyerId() default 0;

  GoodOrderRelationInput1[] goodOrderRelation() default {};

  OrderInput1 input() default @OrderInput1;

  OrderExpression1 where() default @OrderExpression1;

  String $id() default "";

  String $number() default "";

  String $buyer() default "";

  String $goods() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $buyerId() default "";

  String $goodOrderRelation() default "";

  String $input() default "";

  String $where() default "";
}
