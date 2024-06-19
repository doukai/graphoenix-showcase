package io.graphoenix.showcase.user.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.showcase.user.dto.enumType.RoleType;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class RoleTypeExpression {
  @DefaultValue("EQ")
  private Operator opr = Operator.EQ;

  private RoleType val;

  private Collection<RoleType> arr;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public RoleType getVal() {
    return this.val;
  }

  public void setVal(RoleType val) {
    this.val = val;
  }

  public Collection<RoleType> getArr() {
    return this.arr;
  }

  public void setArr(Collection<RoleType> arr) {
    this.arr = arr;
  }
}
