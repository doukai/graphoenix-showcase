package io.graphoenix.showcase.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.showcase.user.dto.objectType.Organization;
import io.graphoenix.showcase.user.dto.objectType.User;
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
public class Merchant implements Meta {
  @Id
  private String id;

  @NonNull
  private String name;

  private Organization organization;

  private Collection<User> customerServices;

  private Collection<Organization> partners;

  @NonNull
  private User director;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Merchant";

  private Integer organizationId;

  private Collection<MerchantUserRelation> merchantUserRelation;

  private Collection<MerchantOrganizationRelation> merchantOrganizationRelation;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer organizationIdCount;

  private Integer organizationIdSum;

  private Integer organizationIdAvg;

  private Integer organizationIdMax;

  private Integer organizationIdMin;

  private Boolean error;

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

  public Organization getOrganization() {
    return this.organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public Collection<User> getCustomerServices() {
    return this.customerServices;
  }

  public void setCustomerServices(Collection<User> customerServices) {
    this.customerServices = customerServices;
  }

  public Collection<Organization> getPartners() {
    return this.partners;
  }

  public void setPartners(Collection<Organization> partners) {
    this.partners = partners;
  }

  public User getDirector() {
    return this.director;
  }

  public void setDirector(User director) {
    this.director = director;
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

  public Integer getOrganizationId() {
    return this.organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public Collection<MerchantUserRelation> getMerchantUserRelation() {
    return this.merchantUserRelation;
  }

  public void setMerchantUserRelation(Collection<MerchantUserRelation> merchantUserRelation) {
    this.merchantUserRelation = merchantUserRelation;
  }

  public Collection<MerchantOrganizationRelation> getMerchantOrganizationRelation() {
    return this.merchantOrganizationRelation;
  }

  public void setMerchantOrganizationRelation(
      Collection<MerchantOrganizationRelation> merchantOrganizationRelation) {
    this.merchantOrganizationRelation = merchantOrganizationRelation;
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

  public Integer getOrganizationIdCount() {
    return this.organizationIdCount;
  }

  public void setOrganizationIdCount(Integer organizationIdCount) {
    this.organizationIdCount = organizationIdCount;
  }

  public Integer getOrganizationIdSum() {
    return this.organizationIdSum;
  }

  public void setOrganizationIdSum(Integer organizationIdSum) {
    this.organizationIdSum = organizationIdSum;
  }

  public Integer getOrganizationIdAvg() {
    return this.organizationIdAvg;
  }

  public void setOrganizationIdAvg(Integer organizationIdAvg) {
    this.organizationIdAvg = organizationIdAvg;
  }

  public Integer getOrganizationIdMax() {
    return this.organizationIdMax;
  }

  public void setOrganizationIdMax(Integer organizationIdMax) {
    this.organizationIdMax = organizationIdMax;
  }

  public Integer getOrganizationIdMin() {
    return this.organizationIdMin;
  }

  public void setOrganizationIdMin(Integer organizationIdMin) {
    this.organizationIdMin = organizationIdMin;
  }

  public Boolean getError() {
    return this.error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }
}
