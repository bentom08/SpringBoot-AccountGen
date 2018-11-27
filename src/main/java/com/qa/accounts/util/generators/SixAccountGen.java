package com.qa.accounts.util.generators;

import com.qa.accounts.util.constants.Constants;

public class SixAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.SIX_DIGIT_ACCOUNT); }

}