package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mybank.account.api.model.Account;
import com.mybank.account.api.model.Balance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavingAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class SavingAccount extends Account  {
  @JsonProperty("interestRate")
  private BigDecimal interestRate = null;

  public SavingAccount interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * interest rate
   * @return interestRate
   **/
  @Schema(description = "interest rate")
  
    @Valid
    public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavingAccount savingAccount = (SavingAccount) o;
    return Objects.equals(this.interestRate, savingAccount.interestRate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavingAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
