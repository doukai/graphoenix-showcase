package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression1;
import io.graphoenix.core.dto.annotation.StringExpression1;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.showcase.user.dto.annotation.UserExpression1;
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
public @interface OrderListSubscriptionArguments {
  StringExpression1 id() default @StringExpression1;

  StringExpression1 number() default @StringExpression1;

  UserExpression1 buyer() default @UserExpression1;

  GoodExpression1 goods() default @GoodExpression1;

  boolean includeDeprecated() default false;

  IntExpression1 version() default @IntExpression1;

  IntExpression1 realmId() default @IntExpression1;

  StringExpression1 createUserId() default @StringExpression1;

  StringExpression1 createTime() default @StringExpression1;

  StringExpression1 updateUserId() default @StringExpression1;

  StringExpression1 updateTime() default @StringExpression1;

  StringExpression1 createGroupId() default @StringExpression1;

  StringExpression1 __typename() default @StringExpression1;

  IntExpression1 buyerId() default @IntExpression1;

  GoodOrderRelationExpression1 goodOrderRelation() default @GoodOrderRelationExpression1;

  OrderOrderBy1 orderBy() default @OrderOrderBy1;

  String[] groupBy() default {};

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  OrderExpression1[] exs() default {};

  int first() default 0;

  int last() default 0;

  int offset() default 0;

  String after() default "";

  String before() default "";

  String $id() default "";

  String $number() default "";

  String $buyer() default "";

  String $goods() default "";

  String $includeDeprecated() default "";

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
