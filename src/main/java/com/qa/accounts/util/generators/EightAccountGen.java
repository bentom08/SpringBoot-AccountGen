package com.qa.accounts.util.generators;

import com.qa.accounts.util.constants.Constants;

public class EightAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.EIGHT_DIGIT_ACCOUNT); }

}
