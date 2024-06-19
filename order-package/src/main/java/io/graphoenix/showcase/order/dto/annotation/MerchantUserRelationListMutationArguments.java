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
public @interface MerchantUserRelationListMutationArguments {
  String id() default "";

  String merchantRef() default "";

  MerchantInput1 merchant() default @MerchantInput1;

  int userRef() default 0;

  UserInput1 user() default @UserInput1;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "MerchantUserRelation";

  MerchantUserRelationInput1[] list() default {};

  MerchantUserRelationExpression1 where() default @MerchantUserRelationExpression1;

  String $id() default "";

  String $merchantRef() default "";

  String $merchant() default "";

  String $userRef() default "";

  String $user() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $list() default "";

  String $where() default "";
}
