package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.showcase.user.dto.annotation.OrganizationInput2;
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
public @interface MerchantInput1 {
  String id() default "";

  String name() default "";

  OrganizationInput2 organization() default @OrganizationInput2;

  UserInput2[] customerServices() default {};

  OrganizationInput2[] partners() default {};

  UserInput2 director() default @UserInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Merchant";

  int organizationId() default 0;

  MerchantPartnersInput2[] merchantPartners() default {};

  MerchantDirectorInput2[] merchantDirector() default {};

  MerchantExpression2 where() default @MerchantExpression2;

  String $id() default "";

  String $name() default "";

  String $organization() default "";

  String $customerServices() default "";

  String $partners() default "";

  String $director() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $organizationId() default "";

  String $merchantPartners() default "";

  String $merchantDirector() default "";

  String $where() default "";
}
