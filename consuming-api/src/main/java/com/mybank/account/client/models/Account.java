package com.mybank.account.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** An account in the context of a bank, created by the deposit of money or its equivalent and subject to withdrawel of money */
public class Account implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A descriptive description of my account */
    private String _alias;
    /** A list of balances. */
    private java.util.List<Balance> _balances;
    /** The currency property */
    private String _currency;
    /** The full name of the account holder */
    private String _holderName;
    /** The iban property */
    private String _iban;
    /** The unique identifier. */
    private String _id;
    /** The type differentiator as a Code Value.Values are listed in TCOD PA65.Possible CodeId Values are:- 1 = Savings- 2 = Payment */
    private Account_type _type;
    /**
     * Instantiates a new Account and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Account() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Account
     */
    @javax.annotation.Nonnull
    public static Account createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Account();
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
     * Gets the alias property value. A descriptive description of my account
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlias() {
        return this._alias;
    }
    /**
     * Gets the balances property value. A list of balances.
     * @return a balance
     */
    @javax.annotation.Nullable
    public java.util.List<Balance> getBalances() {
        return this._balances;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrency() {
        return this._currency;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("alias", (n) -> { this.setAlias(n.getStringValue()); });
        deserializerMap.put("balances", (n) -> { this.setBalances(n.getCollectionOfObjectValues(Balance::createFromDiscriminatorValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("holderName", (n) -> { this.setHolderName(n.getStringValue()); });
        deserializerMap.put("iban", (n) -> { this.setIban(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(Account_type::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the holderName property value. The full name of the account holder
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHolderName() {
        return this._holderName;
    }
    /**
     * Gets the iban property value. The iban property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIban() {
        return this._iban;
    }
    /**
     * Gets the id property value. The unique identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the type property value. The type differentiator as a Code Value.Values are listed in TCOD PA65.Possible CodeId Values are:- 1 = Savings- 2 = Payment
     * @return a Account_type
     */
    @javax.annotation.Nullable
    public Account_type getType() {
        return this._type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alias", this.getAlias());
        writer.writeCollectionOfObjectValues("balances", this.getBalances());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("holderName", this.getHolderName());
        writer.writeStringValue("iban", this.getIban());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("type", this.getType());
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
     * Sets the alias property value. A descriptive description of my account
     * @param value Value to set for the alias property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlias(@javax.annotation.Nullable final String value) {
        this._alias = value;
    }
    /**
     * Sets the balances property value. A list of balances.
     * @param value Value to set for the balances property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBalances(@javax.annotation.Nullable final java.util.List<Balance> value) {
        this._balances = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final String value) {
        this._currency = value;
    }
    /**
     * Sets the holderName property value. The full name of the account holder
     * @param value Value to set for the holderName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHolderName(@javax.annotation.Nullable final String value) {
        this._holderName = value;
    }
    /**
     * Sets the iban property value. The iban property
     * @param value Value to set for the iban property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIban(@javax.annotation.Nullable final String value) {
        this._iban = value;
    }
    /**
     * Sets the id property value. The unique identifier.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the type property value. The type differentiator as a Code Value.Values are listed in TCOD PA65.Possible CodeId Values are:- 1 = Savings- 2 = Payment
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final Account_type value) {
        this._type = value;
    }
}
