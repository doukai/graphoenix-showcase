package io.graphoenix.showcase.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation {
  private Order order;

  private Collection<Order> orderList;

  private Good good;

  private Collection<Good> goodList;

  private Product product;

  private Collection<Product> productList;

  private Merchant merchant;

  private Collection<Merchant> merchantList;

  private GoodOrderRelation goodOrderRelation;

  private Collection<GoodOrderRelation> goodOrderRelationList;

  private GoodProductRelation goodProductRelation;

  private Collection<GoodProductRelation> goodProductRelationList;

  private GoodMerchantRelation goodMerchantRelation;

  private Collection<GoodMerchantRelation> goodMerchantRelationList;

  private MerchantPartners merchantPartners;

  private Collection<MerchantPartners> merchantPartnersList;

  private MerchantDirector merchantDirector;

  private Collection<MerchantDirector> merchantDirectorList;

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

  public MerchantPartners getMerchantPartners() {
    return this.merchantPartners;
  }

  public void setMerchantPartners(MerchantPartners merchantPartners) {
    this.merchantPartners = merchantPartners;
  }

  public Collection<MerchantPartners> getMerchantPartnersList() {
    return this.merchantPartnersList;
  }

  public void setMerchantPartnersList(Collection<MerchantPartners> merchantPartnersList) {
    this.merchantPartnersList = merchantPartnersList;
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
}
