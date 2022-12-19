package com.mybank.account.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SavingAccount extends Account implements Parsable {
    /** interest rate */
    private Long _interestRate;
    /**
     * Instantiates a new SavingAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SavingAccount() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SavingAccount
     */
    @javax.annotation.Nonnull
    public static SavingAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SavingAccount();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("interestRate", (n) -> { this.setInterestRate(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interestRate property value. interest rate
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getInterestRate() {
        return this._interestRate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("interestRate", this.getInterestRate());
    }
    /**
     * Sets the interestRate property value. interest rate
     * @param value Value to set for the interestRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterestRate(@javax.annotation.Nullable final Long value) {
        this._interestRate = value;
    }
}
