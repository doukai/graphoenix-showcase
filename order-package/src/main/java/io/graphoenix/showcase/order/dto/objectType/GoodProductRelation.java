package io.graphoenix.showcase.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
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
public class GoodProductRelation implements Meta {
  @Id
  private String id;

  private String goodRef;

  private Good goodRefType;

  private String productRef;

  private Product productRefType;

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

  private Integer goodRefCount;

  private String goodRefMax;

  private String goodRefMin;

  private Integer productRefCount;

  private String productRefMax;

  private String productRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGoodRef() {
    return this.goodRef;
  }

  public void setGoodRef(String goodRef) {
    this.goodRef = goodRef;
  }

  public Good getGoodRefType() {
    return this.goodRefType;
  }

  public void setGoodRefType(Good goodRefType) {
    this.goodRefType = goodRefType;
  }

  public String getProductRef() {
    return this.productRef;
  }

  public void setProductRef(String productRef) {
    this.productRef = productRef;
  }

  public Product getProductRefType() {
    return this.productRefType;
  }

  public void setProductRefType(Product productRefType) {
    this.productRefType = productRefType;
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

  public Integer getGoodRefCount() {
    return this.goodRefCount;
  }

  public void setGoodRefCount(Integer goodRefCount) {
    this.goodRefCount = goodRefCount;
  }

  public String getGoodRefMax() {
    return this.goodRefMax;
  }

  public void setGoodRefMax(String goodRefMax) {
    this.goodRefMax = goodRefMax;
  }

  public String getGoodRefMin() {
    return this.goodRefMin;
  }

  public void setGoodRefMin(String goodRefMin) {
    this.goodRefMin = goodRefMin;
  }

  public Integer getProductRefCount() {
    return this.productRefCount;
  }

  public void setProductRefCount(Integer productRefCount) {
    this.productRefCount = productRefCount;
  }

  public String getProductRefMax() {
    return this.productRefMax;
  }

  public void setProductRefMax(String productRefMax) {
    this.productRefMax = productRefMax;
  }

  public String getProductRefMin() {
    return this.productRefMin;
  }

  public void setProductRefMin(String productRefMin) {
    this.productRefMin = productRefMin;
  }
}
