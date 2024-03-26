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
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class MerchantOrganizationRelationListMutationArguments implements MetaInput {
  private String id;

  private String merchantRef;

  private MerchantInput merchantRefType;

  private Integer organizationRef;

  private OrganizationInput organizationRefType;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"MerchantOrganizationRelation\"")
  private String __typename;

  private Collection<MerchantOrganizationRelationInput> list;

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

  public MerchantInput getMerchantRefType() {
    return this.merchantRefType;
  }

  public void setMerchantRefType(MerchantInput merchantRefType) {
    this.merchantRefType = merchantRefType;
  }

  public Integer getOrganizationRef() {
    return this.organizationRef;
  }

  public void setOrganizationRef(Integer organizationRef) {
    this.organizationRef = organizationRef;
  }

  public OrganizationInput getOrganizationRefType() {
    return this.organizationRefType;
  }

  public void setOrganizationRefType(OrganizationInput organizationRefType) {
    this.organizationRefType = organizationRefType;
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

  public Collection<MerchantOrganizationRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<MerchantOrganizationRelationInput> list) {
    this.list = list;
  }

  public MerchantOrganizationRelationExpression getWhere() {
    return this.where;
  }

  public void setWhere(MerchantOrganizationRelationExpression where) {
    this.where = where;
  }
}
