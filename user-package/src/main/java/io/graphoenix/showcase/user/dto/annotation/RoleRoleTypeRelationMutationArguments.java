package io.graphoenix.showcase.user.dto.annotation;

import io.graphoenix.showcase.user.dto.enumType.RoleType;
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
public @interface RoleRoleTypeRelationMutationArguments {
  String id() default "";

  String roleRef() default "";

  RoleInput1 role() default @RoleInput1;

  RoleType roleTypeRef() default RoleType.ADMIN;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "RoleRoleTypeRelation";

  RoleRoleTypeRelationInput1 input() default @RoleRoleTypeRelationInput1;

  RoleRoleTypeRelationExpression1 where() default @RoleRoleTypeRelationExpression1;

  String $id() default "";

  String $roleRef() default "";

  String $role() default "";

  String $roleTypeRef() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $input() default "";

  String $where() default "";
}
