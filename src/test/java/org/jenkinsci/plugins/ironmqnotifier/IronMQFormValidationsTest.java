package org.jenkinsci.plugins.ironmqnotifier;

import hudson.util.FormValidation;
import org.junit.Assert;
import org.junit.Test;

public class IronMQFormValidationsTest {


    @Test
    public void Valid_Queue_Name_Should_Pass() {

        FormValidation testResult;
        FormValidation expectedResult = FormValidation.ok();

        IronMQFormValidations testValidations = new IronMQFormValidations();


        testResult = testValidations.isValidQueueName("testTest");


        Assert.assertEquals(expectedResult, testResult);

    }

    @Test
    public void ExpirySeconds_Greater_Than_Zero_Should_Pass() {

        FormValidation testResult;
        FormValidation expectedResult = FormValidation.ok();

        IronMQFormValidations testValidations = new IronMQFormValidations();


        testResult = testValidations.isValidExpirySeconds(new Long(10005));


        Assert.assertEquals(expectedResult, testResult);

    }

}
