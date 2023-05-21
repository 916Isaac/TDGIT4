import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PasswordVerifyTest {

    @Test
    public void testPasswordVerify1() {
        String input = "";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de tenir almenys 8 caràcters,La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys una lletra majúscula,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify2() {
        String input = "hola";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de tenir almenys 8 caràcters,La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys una lletra majúscula,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify3() {
        String input = "holacaracola";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys una lletra majúscula,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify4() {
        String input = "holA";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de tenir almenys 8 caràcters,La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify5() {
        String input = "hola!";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de tenir almenys 8 caràcters,La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys una lletra majúscula");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify14() {
        String input = "hola12A";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de tenir almenys 8 caràcters,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify15() {
        String input = "holacaracola12";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de contenir almenys una lletra majúscula,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify17() {
        String input = "holacaracolA";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de contenir almenys 2 números,La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify21() {
        String input = "holacaracola12A";
        PasswordVerify expectedOutput = new PasswordVerify(false, "La contrasenya ha de contenir almenys un caràcter especial");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify22() {
        String input = "holacaracola12A!";
        PasswordVerify expectedOutput = new PasswordVerify(true,"");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
    @Test
    public void testPasswordVerify23() {
        String input = "#P4blit0cl4v0uncl4vit0#";
        PasswordVerify expectedOutput = new PasswordVerify(true,"");

        PasswordVerify actualOutput = PasswordVerify.passwordVerify(input);

        assertEquals(expectedOutput.isCorrecto(), actualOutput.isCorrecto());
        assertEquals(expectedOutput.getMensaje(), actualOutput.getMensaje());
    }
}

