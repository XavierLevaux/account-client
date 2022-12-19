package com.mybank.account.web.mapper;

import com.mybank.account.api.model.Account;
import com.mybank.account.api.model.AllOfaccountType;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account map(com.mybank.account.client.models.Account from) {
        return new Account()
                .id(from.getId())
                .iban(from.getIban())
                .type(map(from.getType()));
    }

    private AllOfaccountType map(com.mybank.account.client.models.Account_type from) {
        if (from == null) {
            return null;
        }
        AllOfaccountType result = new AllOfaccountType();
        result.setCodeId(from.getCodeId());
        result.setCodeListId(from.getCodeListId());
        return result;
    }
}
