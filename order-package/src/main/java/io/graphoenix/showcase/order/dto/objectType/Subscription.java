package io.graphoenix.showcase.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Subscription {
  private Order order;

  private Collection<Order> orderList;

  private OrderConnection orderConnection;

  private Good good;

  private Collection<Good> goodList;

  private GoodConnection goodConnection;

  private Product product;

  private Collection<Product> productList;

  private ProductConnection productConnection;

  private Merchant merchant;

  private Collection<Merchant> merchantList;

  private MerchantConnection merchantConnection;

  private GoodOrderRelation goodOrderRelation;

  private Collection<GoodOrderRelation> goodOrderRelationList;

  private GoodOrderRelationConnection goodOrderRelationConnection;

  private GoodProductRelation goodProductRelation;

  private Collection<GoodProductRelation> goodProductRelationList;

  private GoodProductRelationConnection goodProductRelationConnection;

  private GoodMerchantRelation goodMerchantRelation;

  private Collection<GoodMerchantRelation> goodMerchantRelationList;

  private GoodMerchantRelationConnection goodMerchantRelationConnection;

  private MerchantUserRelation merchantUserRelation;

  private Collection<MerchantUserRelation> merchantUserRelationList;

  private MerchantUserRelationConnection merchantUserRelationConnection;

  private MerchantOrganizationRelation merchantOrganizationRelation;

  private Collection<MerchantOrganizationRelation> merchantOrganizationRelationList;

  private MerchantOrganizationRelationConnection merchantOrganizationRelationConnection;

  private MerchantDirector merchantDirector;

  private Collection<MerchantDirector> merchantDirectorList;

  private MerchantDirectorConnection merchantDirectorConnection;

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Collection<Order> getOrderList() {
    return this.orderList;
  }

  public void setOrderList(Collection<Order> orderList) {
    this.orderList = orderList;
  }

  public OrderConnection getOrderConnection() {
    return this.orderConnection;
  }

  public void setOrderConnection(OrderConnection orderConnection) {
    this.orderConnection = orderConnection;
  }

  public Good getGood() {
    return this.good;
  }

  public void setGood(Good good) {
    this.good = good;
  }

  public Collection<Good> getGoodList() {
    return this.goodList;
  }

  public void setGoodList(Collection<Good> goodList) {
    this.goodList = goodList;
  }

  public GoodConnection getGoodConnection() {
    return this.goodConnection;
  }

  public void setGoodConnection(GoodConnection goodConnection) {
    this.goodConnection = goodConnection;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Collection<Product> getProductList() {
    return this.productList;
  }

  public void setProductList(Collection<Product> productList) {
    this.productList = productList;
  }

  public ProductConnection getProductConnection() {
    return this.productConnection;
  }

  public void setProductConnection(ProductConnection productConnection) {
    this.productConnection = productConnection;
  }

  public Merchant getMerchant() {
    return this.merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }

  public Collection<Merchant> getMerchantList() {
    return this.merchantList;
  }

  public void setMerchantList(Collection<Merchant> merchantList) {
    this.merchantList = merchantList;
  }

  public MerchantConnection getMerchantConnection() {
    return this.merchantConnection;
  }

  public void setMerchantConnection(MerchantConnection merchantConnection) {
    this.merchantConnection = merchantConnection;
  }

  public GoodOrderRelation getGoodOrderRelation() {
    return this.goodOrderRelation;
  }

  public void setGoodOrderRelation(GoodOrderRelation goodOrderRelation) {
    this.goodOrderRelation = goodOrderRelation;
  }

  public Collection<GoodOrderRelation> getGoodOrderRelationList() {
    return this.goodOrderRelationList;
  }

  public void setGoodOrderRelationList(Collection<GoodOrderRelation> goodOrderRelationList) {
    this.goodOrderRelationList = goodOrderRelationList;
  }

  public GoodOrderRelationConnection getGoodOrderRelationConnection() {
    return this.goodOrderRelationConnection;
  }

  public void setGoodOrderRelationConnection(
      GoodOrderRelationConnection goodOrderRelationConnection) {
    this.goodOrderRelationConnection = goodOrderRelationConnection;
  }

  public GoodProductRelation getGoodProductRelation() {
    return this.goodProductRelation;
  }

  public void setGoodProductRelation(GoodProductRelation goodProductRelation) {
    this.goodProductRelation = goodProductRelation;
  }

  public Collection<GoodProductRelation> getGoodProductRelationList() {
    return this.goodProductRelationList;
  }

  public void setGoodProductRelationList(Collection<GoodProductRelation> goodProductRelationList) {
    this.goodProductRelationList = goodProductRelationList;
  }

  public GoodProductRelationConnection getGoodProductRelationConnection() {
    return this.goodProductRelationConnection;
  }

  public void setGoodProductRelationConnection(
      GoodProductRelationConnection goodProductRelationConnection) {
    this.goodProductRelationConnection = goodProductRelationConnection;
  }

  public GoodMerchantRelation getGoodMerchantRelation() {
    return this.goodMerchantRelation;
  }

  public void setGoodMerchantRelation(GoodMerchantRelation goodMerchantRelation) {
    this.goodMerchantRelation = goodMerchantRelation;
  }

  public Collection<GoodMerchantRelation> getGoodMerchantRelationList() {
    return this.goodMerchantRelationList;
  }

  public void setGoodMerchantRelationList(
      Collection<GoodMerchantRelation> goodMerchantRelationList) {
    this.goodMerchantRelationList = goodMerchantRelationList;
  }

  public GoodMerchantRelationConnection getGoodMerchantRelationConnection() {
    return this.goodMerchantRelationConnection;
  }

  public void setGoodMerchantRelationConnection(
      GoodMerchantRelationConnection goodMerchantRelationConnection) {
    this.goodMerchantRelationConnection = goodMerchantRelationConnection;
  }

  public MerchantUserRelation getMerchantUserRelation() {
    return this.merchantUserRelation;
  }

  public void setMerchantUserRelation(MerchantUserRelation merchantUserRelation) {
    this.merchantUserRelation = merchantUserRelation;
  }

  public Collection<MerchantUserRelation> getMerchantUserRelationList() {
    return this.merchantUserRelationList;
  }

  public void setMerchantUserRelationList(
      Collection<MerchantUserRelation> merchantUserRelationList) {
    this.merchantUserRelationList = merchantUserRelationList;
  }

  public MerchantUserRelationConnection getMerchantUserRelationConnection() {
    return this.merchantUserRelationConnection;
  }

  public void setMerchantUserRelationConnection(
      MerchantUserRelationConnection merchantUserRelationConnection) {
    this.merchantUserRelationConnection = merchantUserRelationConnection;
  }

  public MerchantOrganizationRelation getMerchantOrganizationRelation() {
    return this.merchantOrganizationRelation;
  }

  public void setMerchantOrganizationRelation(
      MerchantOrganizationRelation merchantOrganizationRelation) {
    this.merchantOrganizationRelation = merchantOrganizationRelation;
  }

  public Collection<MerchantOrganizationRelation> getMerchantOrganizationRelationList() {
    return this.merchantOrganizationRelationList;
  }

  public void setMerchantOrganizationRelationList(
      Collection<MerchantOrganizationRelation> merchantOrganizationRelationList) {
    this.merchantOrganizationRelationList = merchantOrganizationRelationList;
  }

  public MerchantOrganizationRelationConnection getMerchantOrganizationRelationConnection() {
    return this.merchantOrganizationRelationConnection;
  }

  public void setMerchantOrganizationRelationConnection(
      MerchantOrganizationRelationConnection merchantOrganizationRelationConnection) {
    this.merchantOrganizationRelationConnection = merchantOrganizationRelationConnection;
  }

  public MerchantDirector getMerchantDirector() {
    return this.merchantDirector;
  }

  public void setMerchantDirector(MerchantDirector merchantDirector) {
    this.merchantDirector = merchantDirector;
  }

  public Collection<MerchantDirector> getMerchantDirectorList() {
    return this.merchantDirectorList;
  }

  public void setMerchantDirectorList(Collection<MerchantDirector> merchantDirectorList) {
    this.merchantDirectorList = merchantDirectorList;
  }

  public MerchantDirectorConnection getMerchantDirectorConnection() {
    return this.merchantDirectorConnection;
  }

  public void setMerchantDirectorConnection(MerchantDirectorConnection merchantDirectorConnection) {
    this.merchantDirectorConnection = merchantDirectorConnection;
  }
}
