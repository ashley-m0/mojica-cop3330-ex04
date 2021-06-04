package base;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest 
{

    @Test
    public void output_string_includes_all_items(){
        App myApp = new App();
        String noun = "dog";
        String verb = "walk";
        String adj = "blue";
        String adv = "quickly";

        String expectedMessage = "Do you walk your blue dog quickly? That's hilarious!";
        String actualMessage = myApp.generateMessage(noun, verb, adj, adv);

        assertEquals(expectedMessage, actualMessage);
    }
}
