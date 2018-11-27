package com.qa.accounts.util.generators;

import com.qa.accounts.util.constants.Constants;

public class TenAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.TEN_DIGIT_ACCOUNT); }

}
