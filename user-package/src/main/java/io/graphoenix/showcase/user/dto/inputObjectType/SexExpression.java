package io.graphoenix.showcase.user.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.enumType.Operator;
import io.graphoenix.showcase.user.dto.enumType.Sex;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class SexExpression {
  @DefaultValue("EQ")
  private Operator opr;

  private Sex val;

  private Collection<Sex> arr;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public Sex getVal() {
    return this.val;
  }

  public void setVal(Sex val) {
    this.val = val;
  }

  public Collection<Sex> getArr() {
    return this.arr;
  }

  public void setArr(Collection<Sex> arr) {
    this.arr = arr;
  }
}
