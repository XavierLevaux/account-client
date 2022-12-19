package com.mybank.account.web;

import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;
import com.microsoft.kiota.authentication.AuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import com.mybank.account.api.AccountsApi;
import com.mybank.account.api.model.Account;
import com.mybank.account.api.model.AllOfaccountType;
import com.mybank.account.client.GetAccountApiClient;
import com.mybank.account.web.mapper.AccountMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AccountsController implements AccountsApi {
    private final AccountMapper accountMapper;

    @Override
    public ResponseEntity<Account> getAccount(String id) {

        AuthenticationProvider authenticationProvider = new AnonymousAuthenticationProvider();
        OkHttpRequestAdapter requestAdapter = new OkHttpRequestAdapter(authenticationProvider);
        requestAdapter.setBaseUrl("http://localhost:8081/api");
        GetAccountApiClient getAccountApiClient = new GetAccountApiClient(requestAdapter);
        Account account;
        try {
            account = accountMapper.map(getAccountApiClient.accounts(id).get().get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
