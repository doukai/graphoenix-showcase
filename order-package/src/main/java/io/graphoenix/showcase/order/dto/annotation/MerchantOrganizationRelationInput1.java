package io.graphoenix.showcase.order.dto.annotation;

import io.graphoenix.showcase.user.dto.annotation.OrganizationInput2;
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
public @interface MerchantOrganizationRelationInput1 {
  String id() default "";

  String merchantRef() default "";

  MerchantInput2 merchant() default @MerchantInput2;

  int organizationRef() default 0;

  OrganizationInput2 organization() default @OrganizationInput2;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "MerchantOrganizationRelation";

  MerchantOrganizationRelationExpression2 where() default @MerchantOrganizationRelationExpression2;

  String $id() default "";

  String $merchantRef() default "";

  String $merchant() default "";

  String $organizationRef() default "";

  String $organization() default "";

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
