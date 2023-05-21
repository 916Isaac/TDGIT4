public class PasswordVerify {
    private boolean correcto;
    private String mensaje;

    public PasswordVerify(boolean correcto, String mensaje) {
        this.correcto = correcto;
        this.mensaje = mensaje;
    }
    public PasswordVerify(boolean correcto) {
        this.correcto = correcto;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static PasswordVerify passwordVerify(String pass){
        String regex = "^(?=.*[A-Z])(?=.*(?=(.*\\d){2}))(?=.*[!@#$%^&*()_+={}\\[\\]:;'\",.<>/?])(?=\\S+$).{8,}$";
        String mensajeDeError = "";

        if (!pass.matches(regex)) {
            if (!pass.matches(".{8,}")) {
                mensajeDeError += "La contrasenya ha de tenir almenys 8 caràcters,";
            }
            if (!pass.matches("^(?=.*\\d.*\\d)[^\\d\\n]*\\d[^\\d\\n]*\\d[^\\d\\n]*$")) {
                mensajeDeError += "La contrasenya ha de contenir almenys 2 números,";
            }
            if (!pass.matches("^[^A-Z]*[A-Z][^A-Z]*$")) {
                mensajeDeError += "La contrasenya ha de contenir almenys una lletra majúscula,";
            }
            if (!pass.matches("(?=.*[!@#$%^&*()_+={}\\\\\\\\[\\\\\\\\]:;'\\\\\\\\,.<>/?])\"")){
                mensajeDeError += "La contrasenya ha de contenir almenys un caràcter especial";
            }
            System.out.println(mensajeDeError);
            return new PasswordVerify(false,mensajeDeError);
        }
        return new PasswordVerify(true,"");
    }
}