package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.showcase.user.dto.annotation.UserInput2;
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
public @interface MerchantDirectorInput1 {
  String id() default "";

  String merchantId() default "";

  MerchantInput2 merchant() default @MerchantInput2;

  int userId() default 0;

  UserInput2 user() default @UserInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "MerchantDirector";

  MerchantDirectorExpression2 where() default @MerchantDirectorExpression2;

  String $id() default "";

  String $merchantId() default "";

  String $merchant() default "";

  String $userId() default "";

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

  String $where() default "";
}
