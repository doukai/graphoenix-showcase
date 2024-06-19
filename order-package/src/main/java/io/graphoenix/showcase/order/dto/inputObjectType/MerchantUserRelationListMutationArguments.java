package io.graphoenix.showcase.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.showcase.user.dto.inputObjectType.UserInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class MerchantUserRelationListMutationArguments implements MetaInput {
  private String id;

  private String merchantRef;

  private MerchantInput merchant;

  private Integer userRef;

  private UserInput user;

  @DefaultValue("false")
  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"MerchantUserRelation\"")
  private String __typename = "MerchantUserRelation";

  private Collection<MerchantUserRelationInput> list;

  private MerchantUserRelationExpression where;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMerchantRef() {
    return this.merchantRef;
  }

  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }

  public MerchantInput getMerchant() {
    return this.merchant;
  }

  public void setMerchant(MerchantInput merchant) {
    this.merchant = merchant;
  }

  public Integer getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Integer userRef) {
    this.userRef = userRef;
  }

  public UserInput getUser() {
    return this.user;
  }

  public void setUser(UserInput user) {
    this.user = user;
  }

  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
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

  public Collection<MerchantUserRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<MerchantUserRelationInput> list) {
    this.list = list;
  }

  public MerchantUserRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(MerchantUserRelationExpression where) {
    this.where = where;
  }
}
