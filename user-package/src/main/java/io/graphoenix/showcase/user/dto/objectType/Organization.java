package io.graphoenix.showcase.user.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
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
public class Organization implements Meta {
  @Id
  private String id;

  private Integer parentId;

  @NonNull
  private String name;

  private Organization above;

  private Collection<User> users;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Collection<OrganizationUserRelation> organizationUserRelation;

  private User usersAggregate;

  private UserConnection usersConnection;

  private OrganizationUserRelation organizationUserRelationAggregate;

  private OrganizationUserRelationConnection organizationUserRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer parentIdCount;

  private Integer parentIdSum;

  private Integer parentIdAvg;

  private Integer parentIdMax;

  private Integer parentIdMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getParentId() {
    return this.parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Organization getAbove() {
    return this.above;
  }

  public void setAbove(Organization above) {
    this.above = above;
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
    this.isDeprecated = isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<OrganizationUserRelation> getOrganizationUserRelation() {
    return this.organizationUserRelation;
  }

  public void setOrganizationUserRelation(
      Collection<OrganizationUserRelation> organizationUserRelation) {
    this.organizationUserRelation = organizationUserRelation;
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

  public OrganizationUserRelation getOrganizationUserRelationAggregate() {
    return this.organizationUserRelationAggregate;
  }

  public void setOrganizationUserRelationAggregate(
      OrganizationUserRelation organizationUserRelationAggregate) {
    this.organizationUserRelationAggregate = organizationUserRelationAggregate;
  }

  public OrganizationUserRelationConnection getOrganizationUserRelationConnection() {
    return this.organizationUserRelationConnection;
  }

  public void setOrganizationUserRelationConnection(
      OrganizationUserRelationConnection organizationUserRelationConnection) {
    this.organizationUserRelationConnection = organizationUserRelationConnection;
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

  public Integer getParentIdCount() {
    return this.parentIdCount;
  }

  public void setParentIdCount(Integer parentIdCount) {
    this.parentIdCount = parentIdCount;
  }

  public Integer getParentIdSum() {
    return this.parentIdSum;
  }

  public void setParentIdSum(Integer parentIdSum) {
    this.parentIdSum = parentIdSum;
  }

  public Integer getParentIdAvg() {
    return this.parentIdAvg;
  }

  public void setParentIdAvg(Integer parentIdAvg) {
    this.parentIdAvg = parentIdAvg;
  }

  public Integer getParentIdMax() {
    return this.parentIdMax;
  }

  public void setParentIdMax(Integer parentIdMax) {
    this.parentIdMax = parentIdMax;
  }

  public Integer getParentIdMin() {
    return this.parentIdMin;
  }

  public void setParentIdMin(Integer parentIdMin) {
    this.parentIdMin = parentIdMin;
  }
}
