package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression2;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.showcase.user.dto.annotation.OrganizationExpression2;
import io.graphoenix.showcase.user.dto.annotation.UserExpression2;
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
public @interface MerchantExpression1 {
  StringExpression2 id() default @StringExpression2;

  StringExpression2 name() default @StringExpression2;

  OrganizationExpression2 organization() default @OrganizationExpression2;

  UserExpression2 customerServices() default @UserExpression2;

  OrganizationExpression2 partners() default @OrganizationExpression2;

  UserExpression2 director() default @UserExpression2;

  boolean includeDeprecated() default false;

  IntExpression2 version() default @IntExpression2;

  IntExpression2 realmId() default @IntExpression2;

  StringExpression2 createUserId() default @StringExpression2;

  StringExpression2 createTime() default @StringExpression2;

  StringExpression2 updateUserId() default @StringExpression2;

  StringExpression2 updateTime() default @StringExpression2;

  StringExpression2 createGroupId() default @StringExpression2;

  StringExpression2 __typename() default @StringExpression2;

  IntExpression2 organizationId() default @IntExpression2;

  MerchantPartnersExpression2 merchantPartners() default @MerchantPartnersExpression2;

  MerchantDirectorExpression2 merchantDirector() default @MerchantDirectorExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  MerchantExpression2[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $organization() default "";

  String $customerServices() default "";

  String $partners() default "";

  String $director() default "";

  String $includeDeprecated() default "";

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

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
