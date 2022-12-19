package com.mybank.account.client;

import accounts.AccountsRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import com.mybank.account.client.accounts.item.AccountsItemRequestBuilder;
import com.mybank.account.client.savingaccounts.SavingAccountsRequestBuilder;
import com.mybank.account.client.savingaccounts.item.SavingAccountsItemRequestBuilder;

import java.util.HashMap;
import java.util.Objects;
/** The main entry point of the SDK, exposes the configuration and the fluent API. */
public class GetAccountApiClient {
    /** The accounts property */
    @javax.annotation.Nonnull
    public AccountsRequestBuilder accounts() {
        return new AccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The savingAccounts property */
    @javax.annotation.Nonnull
    public SavingAccountsRequestBuilder savingAccounts() {
        return new SavingAccountsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Gets an item from the getaccountclient.apiclient.accounts.item collection
     * @param id Unique identifier of the item
     * @return a AccountsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccountsItemRequestBuilder accounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new AccountsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new com.mybank.account.client.GetAccountApiClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetAccountApiClient(@javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(requestAdapter);
        this.pathParameters = new HashMap<>();
        this.urlTemplate = "{+baseurl}";
        this.requestAdapter = requestAdapter;
        ApiClientBuilder.registerDefaultSerializer(JsonSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(TextSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(JsonParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(TextParseNodeFactory.class);
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://defl-tst.belwired.net/core-banking/payments");
        }
    }
    /**
     * Gets an item from the getaccountclient.apiclient.savingAccounts.item collection
     * @param id Unique identifier of the item
     * @return a SavingAccountsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SavingAccountsItemRequestBuilder savingAccounts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SavingAccountsItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
