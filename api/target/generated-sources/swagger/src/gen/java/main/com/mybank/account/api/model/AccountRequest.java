package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All the needed parameters to create a new account
 */
@Schema(description = "All the needed parameters to create a new account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class AccountRequest   {
  /**
   * The type of the account.
   */
  public enum TypeEnum {
    PAYMENT("payment"),
    
    SAVINGS("savings");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("currency")
  private String currency = null;

  public AccountRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the account.
   * @return type
   **/
  @Schema(example = "savings", required = true, description = "The type of the account.")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AccountRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * The account alias.
   * @return alias
   **/
  @Schema(example = "Savings for my son.", description = "The account alias.")
  
    public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public AccountRequest currency(String currency) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequest accountRequest = (AccountRequest) o;
    return Objects.equals(this.type, accountRequest.type) &&
        Objects.equals(this.alias, accountRequest.alias) &&
        Objects.equals(this.currency, accountRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, alias, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
