package io.graphoenix.showcase.order.dto.objectType;

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
public class Good implements Meta {
  @Id
  private String id;

  @NonNull
  private Integer quantity;

  @NonNull
  private Order order;

  @NonNull
  private Product product;

  @NonNull
  private Merchant merchant;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Good";

  private Collection<GoodOrderRelation> goodOrderRelation;

  private Collection<GoodProductRelation> goodProductRelation;

  private Collection<GoodMerchantRelation> goodMerchantRelation;

  private GoodOrderRelation goodOrderRelationAggregate;

  private GoodOrderRelationConnection goodOrderRelationConnection;

  private GoodProductRelation goodProductRelationAggregate;

  private GoodProductRelationConnection goodProductRelationConnection;

  private GoodMerchantRelation goodMerchantRelationAggregate;

  private GoodMerchantRelationConnection goodMerchantRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer quantityCount;

  private Integer quantitySum;

  private Integer quantityAvg;

  private Integer quantityMax;

  private Integer quantityMin;

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

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Merchant getMerchant() {
    return this.merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
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

  public Collection<GoodOrderRelation> getGoodOrderRelation() {
    return this.goodOrderRelation;
  }

  public void setGoodOrderRelation(Collection<GoodOrderRelation> goodOrderRelation) {
    this.goodOrderRelation = goodOrderRelation;
  }

  public Collection<GoodProductRelation> getGoodProductRelation() {
    return this.goodProductRelation;
  }

  public void setGoodProductRelation(Collection<GoodProductRelation> goodProductRelation) {
    this.goodProductRelation = goodProductRelation;
  }

  public Collection<GoodMerchantRelation> getGoodMerchantRelation() {
    return this.goodMerchantRelation;
  }

  public void setGoodMerchantRelation(Collection<GoodMerchantRelation> goodMerchantRelation) {
    this.goodMerchantRelation = goodMerchantRelation;
  }

  public GoodOrderRelation getGoodOrderRelationAggregate() {
    return this.goodOrderRelationAggregate;
  }

  public void setGoodOrderRelationAggregate(GoodOrderRelation goodOrderRelationAggregate) {
    this.goodOrderRelationAggregate = goodOrderRelationAggregate;
  }

  public GoodOrderRelationConnection getGoodOrderRelationConnection() {
    return this.goodOrderRelationConnection;
  }

  public void setGoodOrderRelationConnection(
      GoodOrderRelationConnection goodOrderRelationConnection) {
    this.goodOrderRelationConnection = goodOrderRelationConnection;
  }

  public GoodProductRelation getGoodProductRelationAggregate() {
    return this.goodProductRelationAggregate;
  }

  public void setGoodProductRelationAggregate(GoodProductRelation goodProductRelationAggregate) {
    this.goodProductRelationAggregate = goodProductRelationAggregate;
  }

  public GoodProductRelationConnection getGoodProductRelationConnection() {
    return this.goodProductRelationConnection;
  }

  public void setGoodProductRelationConnection(
      GoodProductRelationConnection goodProductRelationConnection) {
    this.goodProductRelationConnection = goodProductRelationConnection;
  }

  public GoodMerchantRelation getGoodMerchantRelationAggregate() {
    return this.goodMerchantRelationAggregate;
  }

  public void setGoodMerchantRelationAggregate(GoodMerchantRelation goodMerchantRelationAggregate) {
    this.goodMerchantRelationAggregate = goodMerchantRelationAggregate;
  }

  public GoodMerchantRelationConnection getGoodMerchantRelationConnection() {
    return this.goodMerchantRelationConnection;
  }

  public void setGoodMerchantRelationConnection(
      GoodMerchantRelationConnection goodMerchantRelationConnection) {
    this.goodMerchantRelationConnection = goodMerchantRelationConnection;
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

  public Integer getQuantityCount() {
    return this.quantityCount;
  }

  public void setQuantityCount(Integer quantityCount) {
    this.quantityCount = quantityCount;
  }

  public Integer getQuantitySum() {
    return this.quantitySum;
  }

  public void setQuantitySum(Integer quantitySum) {
    this.quantitySum = quantitySum;
  }

  public Integer getQuantityAvg() {
    return this.quantityAvg;
  }

  public void setQuantityAvg(Integer quantityAvg) {
    this.quantityAvg = quantityAvg;
  }

  public Integer getQuantityMax() {
    return this.quantityMax;
  }

  public void setQuantityMax(Integer quantityMax) {
    this.quantityMax = quantityMax;
  }

  public Integer getQuantityMin() {
    return this.quantityMin;
  }

  public void setQuantityMin(Integer quantityMin) {
    this.quantityMin = quantityMin;
  }
}
