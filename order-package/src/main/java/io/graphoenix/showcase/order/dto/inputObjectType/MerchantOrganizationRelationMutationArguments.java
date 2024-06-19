package io.graphoenix.showcase.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.showcase.user.dto.inputObjectType.OrganizationInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class MerchantOrganizationRelationMutationArguments implements MetaInput {
  private String id;

  private String merchantRef;

  private MerchantInput merchant;

  private Integer organizationRef;

  private OrganizationInput organization;

  @DefaultValue("false")
  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"MerchantOrganizationRelation\"")
  private String __typename = "MerchantOrganizationRelation";

  private MerchantOrganizationRelationInput input;

  private MerchantOrganizationRelationExpression where;

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

  public Integer getOrganizationRef() {
    return this.organizationRef;
  }

  public void setOrganizationRef(Integer organizationRef) {
    this.organizationRef = organizationRef;
  }

  public OrganizationInput getOrganization() {
    return this.organization;
  }

  public void setOrganization(OrganizationInput organization) {
    this.organization = organization;
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

  public MerchantOrganizationRelationInput getInput() {
    return this.input;
  }

  public void setInput(MerchantOrganizationRelationInput input) {
    this.input = input;
  }

  public MerchantOrganizationRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(MerchantOrganizationRelationExpression where) {
    this.where = where;
  }
}
