package com.mybank.account.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * code and value object
 */
@Schema(description = "code and value object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-19T12:17:19.406169+01:00[Europe/Brussels]")


public class CodeValue   {
  @JsonProperty("codeListId")
  private String codeListId = null;

  @JsonProperty("codeId")
  private String codeId = null;

  public CodeValue codeListId(String codeListId) {
    this.codeListId = codeListId;
    return this;
  }

  /**
   * the code list identifier
   * @return codeListId
   **/
  @Schema(description = "the code list identifier")
  
    public String getCodeListId() {
    return codeListId;
  }

  public void setCodeListId(String codeListId) {
    this.codeListId = codeListId;
  }

  public CodeValue codeId(String codeId) {
    this.codeId = codeId;
    return this;
  }

  /**
   * the code identifer of the codeValue
   * @return codeId
   **/
  @Schema(description = "the code identifer of the codeValue")
  
    public String getCodeId() {
    return codeId;
  }

  public void setCodeId(String codeId) {
    this.codeId = codeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeValue codeValue = (CodeValue) o;
    return Objects.equals(this.codeListId, codeValue.codeListId) &&
        Objects.equals(this.codeId, codeValue.codeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeListId, codeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeValue {\n");
    
    sb.append("    codeListId: ").append(toIndentedString(codeListId)).append("\n");
    sb.append("    codeId: ").append(toIndentedString(codeId)).append("\n");
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
