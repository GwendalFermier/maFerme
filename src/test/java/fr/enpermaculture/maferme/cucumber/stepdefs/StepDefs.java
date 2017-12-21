package fr.enpermaculture.maferme.cucumber.stepdefs;

import fr.enpermaculture.maferme.MaFermeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MaFermeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
