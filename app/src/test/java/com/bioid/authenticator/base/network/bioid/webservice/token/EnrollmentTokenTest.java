package com.bioid.authenticator.base.network.bioid.webservice.token;

import com.bioid.authenticator.base.network.bioid.webservice.token.EnrollmentToken;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

@RunWith(MockitoJUnitRunner.class)
public class EnrollmentTokenTest {

    @Test
    public void testEqualsAndHashCode_adhereToContract() throws Exception {
        EqualsVerifier.forClass(EnrollmentToken.class).withRedefinedSuperclass().suppress(Warning.NULL_FIELDS).verify();
    }
}