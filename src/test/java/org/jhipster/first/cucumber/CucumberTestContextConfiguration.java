package org.jhipster.first.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.jhipster.first.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
