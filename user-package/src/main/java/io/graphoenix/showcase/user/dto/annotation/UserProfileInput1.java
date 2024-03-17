package io.graphoenix.showcase.user.dto.annotation;

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
public @interface UserProfileInput1 {
  String id() default "";

  int userId() default 0;

  UserInput2 user() default @UserInput2;

  String email() default "";

  String address() default "";

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "UserProfile";

  UserUserProfileRelationInput2[] userUserProfileRelation() default {};

  UserProfileExpression2 where() default @UserProfileExpression2;

  String $id() default "";

  String $userId() default "";

  String $user() default "";

  String $email() default "";

  String $address() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $userUserProfileRelation() default "";

  String $where() default "";
}
