package io.graphoenix.showcase.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.showcase.user.dto.enumType.RoleType;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Role implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  @NonNull
  private Collection<RoleType> roleType;

  private Collection<User> users;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Role";

  private Collection<RoleRoleTypeRelation> roleRoleTypeRelation;

  private Collection<RoleUserRelation> roleUserRelation;

  private User usersAggregate;

  private UserConnection usersConnection;

  private RoleRoleTypeRelation roleRoleTypeRelationAggregate;

  private RoleRoleTypeRelationConnection roleRoleTypeRelationConnection;

  private RoleUserRelation roleUserRelationAggregate;

  private RoleUserRelationConnection roleUserRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Collection<RoleType> getRoleType() {
    return this.roleType;
  }

  public void setRoleType(Collection<RoleType> roleType) {
    this.roleType = roleType;
  }

  public Collection<User> getUsers() {
    return this.users;
  }

  public void setUsers(Collection<User> users) {
    this.users = users;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<RoleRoleTypeRelation> getRoleRoleTypeRelation() {
    return this.roleRoleTypeRelation;
  }

  public void setRoleRoleTypeRelation(Collection<RoleRoleTypeRelation> roleRoleTypeRelation) {
    this.roleRoleTypeRelation = roleRoleTypeRelation;
  }

  public Collection<RoleUserRelation> getRoleUserRelation() {
    return this.roleUserRelation;
  }

  public void setRoleUserRelation(Collection<RoleUserRelation> roleUserRelation) {
    this.roleUserRelation = roleUserRelation;
  }

  public User getUsersAggregate() {
    return this.usersAggregate;
  }

  public void setUsersAggregate(User usersAggregate) {
    this.usersAggregate = usersAggregate;
  }

  public UserConnection getUsersConnection() {
    return this.usersConnection;
  }

  public void setUsersConnection(UserConnection usersConnection) {
    this.usersConnection = usersConnection;
  }

  public RoleRoleTypeRelation getRoleRoleTypeRelationAggregate() {
    return this.roleRoleTypeRelationAggregate;
  }

  public void setRoleRoleTypeRelationAggregate(RoleRoleTypeRelation roleRoleTypeRelationAggregate) {
    this.roleRoleTypeRelationAggregate = roleRoleTypeRelationAggregate;
  }

  public RoleRoleTypeRelationConnection getRoleRoleTypeRelationConnection() {
    return this.roleRoleTypeRelationConnection;
  }

  public void setRoleRoleTypeRelationConnection(
      RoleRoleTypeRelationConnection roleRoleTypeRelationConnection) {
    this.roleRoleTypeRelationConnection = roleRoleTypeRelationConnection;
  }

  public RoleUserRelation getRoleUserRelationAggregate() {
    return this.roleUserRelationAggregate;
  }

  public void setRoleUserRelationAggregate(RoleUserRelation roleUserRelationAggregate) {
    this.roleUserRelationAggregate = roleUserRelationAggregate;
  }

  public RoleUserRelationConnection getRoleUserRelationConnection() {
    return this.roleUserRelationConnection;
  }

  public void setRoleUserRelationConnection(RoleUserRelationConnection roleUserRelationConnection) {
    this.roleUserRelationConnection = roleUserRelationConnection;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }
}
