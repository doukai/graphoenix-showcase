package io.graphoenix.showcase.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import io.graphoenix.showcase.user.dto.inputObjectType.OrganizationInput;
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
public class MerchantListMutationArguments implements MetaInput {
  private String id;

  private String name;

  private OrganizationInput organization;

  private Collection<UserInput> customerServices;

  private Collection<OrganizationInput> partners;

  private UserInput director;

  @DefaultValue("false")
  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Merchant\"")
  private String __typename = "Merchant";

  private Integer organizationId;

  private Collection<MerchantUserRelationInput> merchantUserRelation;

  private Collection<MerchantOrganizationRelationInput> merchantOrganizationRelation;

  private Collection<MerchantInput> list;

  private MerchantExpression where;

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

  public OrganizationInput getOrganization() {
    return this.organization;
  }

  public void setOrganization(OrganizationInput organization) {
    this.organization = organization;
  }

  public Collection<UserInput> getCustomerServices() {
    return this.customerServices;
  }

  public void setCustomerServices(Collection<UserInput> customerServices) {
    this.customerServices = customerServices;
  }

  public Collection<OrganizationInput> getPartners() {
    return this.partners;
  }

  public void setPartners(Collection<OrganizationInput> partners) {
    this.partners = partners;
  }

  public UserInput getDirector() {
    return this.director;
  }

  public void setDirector(UserInput director) {
    this.director = director;
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

  public Integer getOrganizationId() {
    return this.organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public Collection<MerchantUserRelationInput> getMerchantUserRelation() {
    return this.merchantUserRelation;
  }

  public void setMerchantUserRelation(Collection<MerchantUserRelationInput> merchantUserRelation) {
    this.merchantUserRelation = merchantUserRelation;
  }

  public Collection<MerchantOrganizationRelationInput> getMerchantOrganizationRelation() {
    return this.merchantOrganizationRelation;
  }

  public void setMerchantOrganizationRelation(
      Collection<MerchantOrganizationRelationInput> merchantOrganizationRelation) {
    this.merchantOrganizationRelation = merchantOrganizationRelation;
  }

  public Collection<MerchantInput> getList() {
    return this.list;
  }

  public void setList(Collection<MerchantInput> list) {
    this.list = list;
  }

  public MerchantExpression getWhere() {
    return this.where;
  }

  public void setWhere(MerchantExpression where) {
    this.where = where;
  }
}
