package io.graphoenix.showcase.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
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
public class GoodInput implements MetaInput {
  private String id;

  private Integer quantity;

  private OrderInput order;

  private ProductInput product;

  private MerchantInput merchant;

  @DefaultValue("false")
  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  @DefaultValue("\"Good\"")
  private String __typename = "Good";

  private Collection<GoodOrderRelationInput> goodOrderRelation;

  private Collection<GoodProductRelationInput> goodProductRelation;

  private Collection<GoodMerchantRelationInput> goodMerchantRelation;

  private GoodExpression where;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderInput getOrder() {
    return this.order;
  }

  public void setOrder(OrderInput order) {
    this.order = order;
  }

  public ProductInput getProduct() {
    return this.product;
  }

  public void setProduct(ProductInput product) {
    this.product = product;
  }

  public MerchantInput getMerchant() {
    return this.merchant;
  }

  public void setMerchant(MerchantInput merchant) {
    this.merchant = merchant;
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

  public Collection<GoodOrderRelationInput> getGoodOrderRelation() {
    return this.goodOrderRelation;
  }

  public void setGoodOrderRelation(Collection<GoodOrderRelationInput> goodOrderRelation) {
    this.goodOrderRelation = goodOrderRelation;
  }

  public Collection<GoodProductRelationInput> getGoodProductRelation() {
    return this.goodProductRelation;
  }

  public void setGoodProductRelation(Collection<GoodProductRelationInput> goodProductRelation) {
    this.goodProductRelation = goodProductRelation;
  }

  public Collection<GoodMerchantRelationInput> getGoodMerchantRelation() {
    return this.goodMerchantRelation;
  }

  public void setGoodMerchantRelation(Collection<GoodMerchantRelationInput> goodMerchantRelation) {
    this.goodMerchantRelation = goodMerchantRelation;
  }

  public GoodExpression getWhere() {
    return this.where;
  }

  public void setWhere(GoodExpression where) {
    this.where = where;
  }
}
