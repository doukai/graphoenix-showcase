package io.graphoenix.showcase.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import io.graphoenix.showcase.user.dto.objectType.User;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class MerchantUserRelation implements Meta {
  @Id
  private String id;

  private String merchantRef;

  private Merchant merchantRefType;

  private Integer userRef;

  private User userRefType;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer merchantRefCount;

  private String merchantRefMax;

  private String merchantRefMin;

  private Integer userRefCount;

  private Integer userRefSum;

  private Integer userRefAvg;

  private Integer userRefMax;

  private Integer userRefMin;

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

  public Merchant getMerchantRefType() {
    return this.merchantRefType;
  }

  public void setMerchantRefType(Merchant merchantRefType) {
    this.merchantRefType = merchantRefType;
  }

  public Integer getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Integer userRef) {
    this.userRef = userRef;
  }

  public User getUserRefType() {
    return this.userRefType;
  }

  public void setUserRefType(User userRefType) {
    this.userRefType = userRefType;
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

  public Integer getMerchantRefCount() {
    return this.merchantRefCount;
  }

  public void setMerchantRefCount(Integer merchantRefCount) {
    this.merchantRefCount = merchantRefCount;
  }

  public String getMerchantRefMax() {
    return this.merchantRefMax;
  }

  public void setMerchantRefMax(String merchantRefMax) {
    this.merchantRefMax = merchantRefMax;
  }

  public String getMerchantRefMin() {
    return this.merchantRefMin;
  }

  public void setMerchantRefMin(String merchantRefMin) {
    this.merchantRefMin = merchantRefMin;
  }

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Integer getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Integer userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Integer getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Integer userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Integer getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Integer userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Integer getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Integer userRefMin) {
    this.userRefMin = userRefMin;
  }
}
