package io.graphoenix.showcase.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Conditional;
import io.graphoenix.core.dto.inputObjectType.IntExpression;
import io.graphoenix.core.dto.inputObjectType.MetaExpression;
import io.graphoenix.core.dto.inputObjectType.StringExpression;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class GoodSubscriptionArguments implements MetaExpression {
  private StringExpression id;

  private IntExpression quantity;

  private OrderExpression order;

  private ProductExpression product;

  private MerchantExpression merchant;

  @DefaultValue("false")
  private Boolean includeDeprecated = false;

  private IntExpression version;

  private IntExpression realmId;

  private StringExpression createUserId;

  private StringExpression createTime;

  private StringExpression updateUserId;

  private StringExpression updateTime;

  private StringExpression createGroupId;

  private StringExpression __typename;

  private GoodOrderRelationExpression goodOrderRelation;

  private GoodProductRelationExpression goodProductRelation;

  private GoodMerchantRelationExpression goodMerchantRelation;

  private Collection<String> groupBy;

  @DefaultValue("false")
  private Boolean not = false;

  @DefaultValue("AND")
  private Conditional cond = Conditional.AND;

  private Collection<GoodExpression> exs;

  public StringExpression getId() {
    return this.id;
  }

  public void setId(StringExpression id) {
    this.id = id;
  }

  public IntExpression getQuantity() {
    return this.quantity;
  }

  public void setQuantity(IntExpression quantity) {
    this.quantity = quantity;
  }

  public OrderExpression getOrder() {
    return this.order;
  }

  public void setOrder(OrderExpression order) {
    this.order = order;
  }

  public ProductExpression getProduct() {
    return this.product;
  }

  public void setProduct(ProductExpression product) {
    this.product = product;
  }

  public MerchantExpression getMerchant() {
    return this.merchant;
  }

  public void setMerchant(MerchantExpression merchant) {
    this.merchant = merchant;
  }

  public Boolean getIncludeDeprecated() {
    return this.includeDeprecated;
  }

  public void setIncludeDeprecated(Boolean includeDeprecated) {
    this.includeDeprecated = includeDeprecated;
  }

  public IntExpression getVersion() {
    return this.version;
  }

  public void setVersion(IntExpression version) {
    this.version = version;
  }

  @Override
  public IntExpression getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(IntExpression realmId) {
    this.realmId = (IntExpression)realmId;
  }

  @Override
  public StringExpression getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(StringExpression createUserId) {
    this.createUserId = (StringExpression)createUserId;
  }

  @Override
  public StringExpression getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(StringExpression createTime) {
    this.createTime = (StringExpression)createTime;
  }

  @Override
  public StringExpression getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(StringExpression updateUserId) {
    this.updateUserId = (StringExpression)updateUserId;
  }

  @Override
  public StringExpression getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(StringExpression updateTime) {
    this.updateTime = (StringExpression)updateTime;
  }

  @Override
  public StringExpression getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(StringExpression createGroupId) {
    this.createGroupId = (StringExpression)createGroupId;
  }

  public StringExpression get__typename() {
    return this.__typename;
  }

  public void set__typename(StringExpression __typename) {
    this.__typename = __typename;
  }

  public GoodOrderRelationExpression getGoodOrderRelation() {
    return this.goodOrderRelation;
  }

  public void setGoodOrderRelation(GoodOrderRelationExpression goodOrderRelation) {
    this.goodOrderRelation = goodOrderRelation;
  }

  public GoodProductRelationExpression getGoodProductRelation() {
    return this.goodProductRelation;
  }

  public void setGoodProductRelation(GoodProductRelationExpression goodProductRelation) {
    this.goodProductRelation = goodProductRelation;
  }

  public GoodMerchantRelationExpression getGoodMerchantRelation() {
    return this.goodMerchantRelation;
  }

  public void setGoodMerchantRelation(GoodMerchantRelationExpression goodMerchantRelation) {
    this.goodMerchantRelation = goodMerchantRelation;
  }

  public Collection<String> getGroupBy() {
    return this.groupBy;
  }

  public void setGroupBy(Collection<String> groupBy) {
    this.groupBy = groupBy;
  }

  public Boolean getNot() {
    return this.not;
  }

  public void setNot(Boolean not) {
    this.not = not;
  }

  public Conditional getCond() {
    return this.cond;
  }

  public void setCond(Conditional cond) {
    this.cond = cond;
  }

  public Collection<GoodExpression> getExs() {
    return this.exs;
  }

  public void setExs(Collection<GoodExpression> exs) {
    this.exs = exs;
  }
}
