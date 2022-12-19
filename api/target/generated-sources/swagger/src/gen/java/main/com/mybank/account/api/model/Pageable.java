package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * minimal Pageable query parameters following SpringBoot Standards.
 */
@Schema(description = "minimal Pageable query parameters following SpringBoot Standards.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class Pageable   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = 20;

  public Pageable page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * A page (or offset), the start position of the concerned list of data.
   * minimum: 1
   * @return page
   **/
  @Schema(description = "A page (or offset), the start position of the concerned list of data.")
  
  @Min(1)  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Pageable size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The number of items to be retrieved. Note that a default pageSize MUST be set.
   * minimum: 1
   * maximum: 2000
   * @return size
   **/
  @Schema(description = "The number of items to be retrieved. Note that a default pageSize MUST be set.")
  
  @Min(1) @Max(2000)   public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.page, pageable.page) &&
        Objects.equals(this.size, pageable.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
