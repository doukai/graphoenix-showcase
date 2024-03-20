package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.showcase.user.dto.annotation.OrganizationInput1;
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
public @interface MerchantInput {
  String id() default "";

  String name() default "";

  OrganizationInput1 organization() default @OrganizationInput1;

  UserInput1[] customerServices() default {};

  OrganizationInput1[] partners() default {};

  UserInput1 director() default @UserInput1;

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

  MerchantUserRelationInput1[] merchantUserRelation() default {};

  MerchantOrganizationRelationInput1[] merchantOrganizationRelation() default {};

  MerchantDirectorInput1[] merchantDirector() default {};

  MerchantExpression1 where() default @MerchantExpression1;

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

  String $merchantUserRelation() default "";

  String $merchantOrganizationRelation() default "";

  String $merchantDirector() default "";

  String $where() default "";
}
