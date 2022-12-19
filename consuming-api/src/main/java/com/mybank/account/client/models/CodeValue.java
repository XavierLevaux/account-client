package com.mybank.account.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** code and value object */
public class CodeValue implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** the code identifer of the codeValue */
    private String _codeId;
    /** the code list identifier */
    private String _codeListId;
    /**
     * Instantiates a new CodeValue and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CodeValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CodeValue
     */
    @javax.annotation.Nonnull
    public static CodeValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CodeValue();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the codeId property value. the code identifer of the codeValue
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeId() {
        return this._codeId;
    }
    /**
     * Gets the codeListId property value. the code list identifier
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeListId() {
        return this._codeListId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(2);
        deserializerMap.put("codeId", (n) -> { this.setCodeId(n.getStringValue()); });
        deserializerMap.put("codeListId", (n) -> { this.setCodeListId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("codeId", this.getCodeId());
        writer.writeStringValue("codeListId", this.getCodeListId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the codeId property value. the code identifer of the codeValue
     * @param value Value to set for the codeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeId(@javax.annotation.Nullable final String value) {
        this._codeId = value;
    }
    /**
     * Sets the codeListId property value. the code list identifier
     * @param value Value to set for the codeListId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCodeListId(@javax.annotation.Nullable final String value) {
        this._codeListId = value;
    }
}
