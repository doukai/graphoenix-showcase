package io.graphoenix.showcase.user.dto.annotation;

import io.graphoenix.showcase.user.dto.enumType.Sex;
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
public @interface UserMutationArguments {
  String id() default "";

  String login() default "";

  String password() default "";

  String name() default "";

  int age() default 0;

  boolean disabled() default false;

  Sex sex() default Sex.MAN;

  UserProfileInput1 userProfile() default @UserProfileInput1;

  OrganizationInput1 organization() default @OrganizationInput1;

  RoleInput1[] roles() default {};

  String[] mobileNumbers() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "User";

  OrganizationUserRelationInput1[] organizationUserRelation() default {};

  RoleUserRelationInput1[] roleUserRelation() default {};

  UserMobileNumbersRelationInput1[] userMobileNumbersRelation() default {};

  UserInput1 input() default @UserInput1;

  UserExpression1 where() default @UserExpression1;

  String $id() default "";

  String $login() default "";

  String $password() default "";

  String $name() default "";

  String $age() default "";

  String $disabled() default "";

  String $sex() default "";

  String $userProfile() default "";

  String $organization() default "";

  String $roles() default "";

  String $mobileNumbers() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $organizationUserRelation() default "";

  String $roleUserRelation() default "";

  String $userMobileNumbersRelation() default "";

  String $input() default "";

  String $where() default "";
}
