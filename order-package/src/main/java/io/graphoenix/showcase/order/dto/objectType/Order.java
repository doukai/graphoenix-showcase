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
import java.util.Collection;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Order implements Meta {
  @Id
  private String id;

  @NonNull
  private String number;

  private User buyer;

  private Collection<Good> goods;

  private Boolean isDeprecated;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename;

  private Integer buyerId;

  private Collection<GoodOrderRelation> goodOrderRelation;

  private Good goodsAggregate;

  private GoodConnection goodsConnection;

  private GoodOrderRelation goodOrderRelationAggregate;

  private GoodOrderRelationConnection goodOrderRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer numberCount;

  private String numberMax;

  private String numberMin;

  private Integer buyerIdCount;

  private Integer buyerIdSum;

  private Integer buyerIdAvg;

  private Integer buyerIdMax;

  private Integer buyerIdMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public User getBuyer() {
    return this.buyer;
  }

  public void setBuyer(User buyer) {
    this.buyer = buyer;
  }

  public Collection<Good> getGoods() {
    return this.goods;
  }

  public void setGoods(Collection<Good> goods) {
    this.goods = goods;
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

  public Integer getBuyerId() {
    return this.buyerId;
  }

  public void setBuyerId(Integer buyerId) {
    this.buyerId = buyerId;
  }

  public Collection<GoodOrderRelation> getGoodOrderRelation() {
    return this.goodOrderRelation;
  }

  public void setGoodOrderRelation(Collection<GoodOrderRelation> goodOrderRelation) {
    this.goodOrderRelation = goodOrderRelation;
  }

  public Good getGoodsAggregate() {
    return this.goodsAggregate;
  }

  public void setGoodsAggregate(Good goodsAggregate) {
    this.goodsAggregate = goodsAggregate;
  }

  public GoodConnection getGoodsConnection() {
    return this.goodsConnection;
  }

  public void setGoodsConnection(GoodConnection goodsConnection) {
    this.goodsConnection = goodsConnection;
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

  public Integer getNumberCount() {
    return this.numberCount;
  }

  public void setNumberCount(Integer numberCount) {
    this.numberCount = numberCount;
  }

  public String getNumberMax() {
    return this.numberMax;
  }

  public void setNumberMax(String numberMax) {
    this.numberMax = numberMax;
  }

  public String getNumberMin() {
    return this.numberMin;
  }

  public void setNumberMin(String numberMin) {
    this.numberMin = numberMin;
  }

  public Integer getBuyerIdCount() {
    return this.buyerIdCount;
  }

  public void setBuyerIdCount(Integer buyerIdCount) {
    this.buyerIdCount = buyerIdCount;
  }

  public Integer getBuyerIdSum() {
    return this.buyerIdSum;
  }

  public void setBuyerIdSum(Integer buyerIdSum) {
    this.buyerIdSum = buyerIdSum;
  }

  public Integer getBuyerIdAvg() {
    return this.buyerIdAvg;
  }

  public void setBuyerIdAvg(Integer buyerIdAvg) {
    this.buyerIdAvg = buyerIdAvg;
  }

  public Integer getBuyerIdMax() {
    return this.buyerIdMax;
  }

  public void setBuyerIdMax(Integer buyerIdMax) {
    this.buyerIdMax = buyerIdMax;
  }

  public Integer getBuyerIdMin() {
    return this.buyerIdMin;
  }

  public void setBuyerIdMin(Integer buyerIdMin) {
    this.buyerIdMin = buyerIdMin;
  }
}
