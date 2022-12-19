package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mybank.account.api.model.Transaction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class InlineResponse200   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("items")
  @Valid
  private List<Transaction> items = null;

  public InlineResponse200 page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * The index of the current page of items.
   * @return page
   **/
  @Schema(example = "1", description = "The index of the current page of items.")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public InlineResponse200 size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The number of items to be retrieved
   * @return size
   **/
  @Schema(example = "20", description = "The number of items to be retrieved")
  
    public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public InlineResponse200 items(List<Transaction> items) {
    this.items = items;
    return this;
  }

  public InlineResponse200 addItemsItem(Transaction itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of resource items.
   * @return items
   **/
  @Schema(description = "Array of resource items.")
      @Valid
    public List<Transaction> getItems() {
    return items;
  }

  public void setItems(List<Transaction> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.page, inlineResponse200.page) &&
        Objects.equals(this.size, inlineResponse200.size) &&
        Objects.equals(this.items, inlineResponse200.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
