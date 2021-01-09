package SteepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mehetrr\\Project workspace\\Booking.com\\Features", 
glue= {"SteepDefinations"}, monochrome = true,
plugin= {"pretty", "C:\\Users\\mehetrr\\Project workspace\\Booking.com\\target"})
public class TestRunner {

}
