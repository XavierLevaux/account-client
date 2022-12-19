package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mybank.account.api.model.Balance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An account in the context of a bank, created by the deposit of money or its equivalent and subject to withdrawel of money
 */
@Schema(description = "An account in the context of a bank, created by the deposit of money or its equivalent and subject to withdrawel of money")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class Account   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private AllOfaccountType type = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("holderName")
  private String holderName = null;

  @JsonProperty("balances")
  @Valid
  private List<Balance> balances = null;

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier.
   * @return id
   **/
  @Schema(example = "123456789012", required = true, description = "The unique identifier.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account type(AllOfaccountType type) {
    this.type = type;
    return this;
  }

  /**
   * The type differentiator as a Code Value. Values are listed in TCOD PA65. Possible CodeId Values are: - 1 = Savings - 2 = Payment 
   * @return type
   **/
  @Schema(example = "{\"codeListId\":\"PA65\",\"codeId\":\"2\"}", description = "The type differentiator as a Code Value. Values are listed in TCOD PA65. Possible CodeId Values are: - 1 = Savings - 2 = Payment ")
  
    public AllOfaccountType getType() {
    return type;
  }

  public void setType(AllOfaccountType type) {
    this.type = type;
  }

  public Account alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * A descriptive description of my account
   * @return alias
   **/
  @Schema(example = "Savings for my son", description = "A descriptive description of my account")
  
    public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

  /**
   * The full name of the account holder
   * @return holderName
   **/
  @Schema(example = "Robert Schuman", description = "The full name of the account holder")
  
    public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public Account balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public Account addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * A list of balances.
   * @return balances
   **/
  @Schema(description = "A list of balances.")
      @Valid
    public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.alias, account.alias) &&
        Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.holderName, account.holderName) &&
        Objects.equals(this.balances, account.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, alias, iban, currency, holderName, balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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
