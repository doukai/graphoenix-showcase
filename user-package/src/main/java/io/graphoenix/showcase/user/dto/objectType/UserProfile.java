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
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class UserProfile implements Meta {
  @Id
  private String id;

  private Integer userId;

  private User user;

  private String email;

  private String address;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "UserProfile";

  private Collection<UserUserProfileRelation> userUserProfileRelation;

  private UserUserProfileRelation userUserProfileRelationAggregate;

  private UserUserProfileRelationConnection userUserProfileRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer emailCount;

  private String emailMax;

  private String emailMin;

  private Integer addressCount;

  private String addressMax;

  private String addressMin;

  private Integer userIdCount;

  private Integer userIdSum;

  private Integer userIdAvg;

  private Integer userIdMax;

  private Integer userIdMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
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

  public Collection<UserUserProfileRelation> getUserUserProfileRelation() {
    return this.userUserProfileRelation;
  }

  public void setUserUserProfileRelation(
      Collection<UserUserProfileRelation> userUserProfileRelation) {
    this.userUserProfileRelation = userUserProfileRelation;
  }

  public UserUserProfileRelation getUserUserProfileRelationAggregate() {
    return this.userUserProfileRelationAggregate;
  }

  public void setUserUserProfileRelationAggregate(
      UserUserProfileRelation userUserProfileRelationAggregate) {
    this.userUserProfileRelationAggregate = userUserProfileRelationAggregate;
  }

  public UserUserProfileRelationConnection getUserUserProfileRelationConnection() {
    return this.userUserProfileRelationConnection;
  }

  public void setUserUserProfileRelationConnection(
      UserUserProfileRelationConnection userUserProfileRelationConnection) {
    this.userUserProfileRelationConnection = userUserProfileRelationConnection;
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

  public Integer getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Integer emailCount) {
    this.emailCount = emailCount;
  }

  public String getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(String emailMax) {
    this.emailMax = emailMax;
  }

  public String getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(String emailMin) {
    this.emailMin = emailMin;
  }

  public Integer getAddressCount() {
    return this.addressCount;
  }

  public void setAddressCount(Integer addressCount) {
    this.addressCount = addressCount;
  }

  public String getAddressMax() {
    return this.addressMax;
  }

  public void setAddressMax(String addressMax) {
    this.addressMax = addressMax;
  }

  public String getAddressMin() {
    return this.addressMin;
  }

  public void setAddressMin(String addressMin) {
    this.addressMin = addressMin;
  }

  public Integer getUserIdCount() {
    return this.userIdCount;
  }

  public void setUserIdCount(Integer userIdCount) {
    this.userIdCount = userIdCount;
  }

  public Integer getUserIdSum() {
    return this.userIdSum;
  }

  public void setUserIdSum(Integer userIdSum) {
    this.userIdSum = userIdSum;
  }

  public Integer getUserIdAvg() {
    return this.userIdAvg;
  }

  public void setUserIdAvg(Integer userIdAvg) {
    this.userIdAvg = userIdAvg;
  }

  public Integer getUserIdMax() {
    return this.userIdMax;
  }

  public void setUserIdMax(Integer userIdMax) {
    this.userIdMax = userIdMax;
  }

  public Integer getUserIdMin() {
    return this.userIdMin;
  }

  public void setUserIdMin(Integer userIdMin) {
    this.userIdMin = userIdMin;
  }
}
