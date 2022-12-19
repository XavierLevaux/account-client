package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A transaction and the resulting balance.
 */
@Schema(description = "A transaction and the resulting balance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class Transaction   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("transactionDate")
  private String transactionDate = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  /**
   * The type of the transaction.
   */
  public enum TypeEnum {
    DEBIT("debit"),
    
    CREDIT("credit");

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

  public Transaction id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier.
   * @return id
   **/
  @Schema(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, description = "The unique identifier.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Transaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * The transaction date
   * @return transactionDate
   **/
  @Schema(example = "Thu Sep 01 02:00:00 CEST 2022", required = true, description = "The transaction date")
      @NotNull

    public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Transaction details(String details) {
    this.details = details;
    return this;
  }

  /**
   * The details of the transaction
   * @return details
   **/
  @Schema(example = "Location: The Bakery Brussels, payment with Fitbit Pay.", description = "The details of the transaction")
  
    public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Transaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transaction.
   * @return type
   **/
  @Schema(example = "debit", required = true, description = "The type of the transaction.")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.transactionDate, transaction.transactionDate) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.details, transaction.details) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.type, transaction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionDate, date, details, amount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
