package com.mattfirtion.mapper.cucumber.stepdefs;

import com.mattfirtion.mapper.MapitApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MapitApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
