package intitutoinnova;

public class Alumno {

    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private char nivelSocioeconomico;
    private String tipoBeca;

    public Alumno(String nombre, String tipoDocumento, String numeroDocumento,
            char nivelSocioeconomico, String tipoBeca) {

        setNombre(nombre);
        setTipoDocumento(tipoDocumento);
        setNumeroDocumento(numeroDocumento);
        setNivelSocioeconomico(nivelSocioeconomico);
        setTipoBeca(tipoBeca);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío.");
        }

        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {

        if (!tipoDocumento.equalsIgnoreCase("DNI")
                && !tipoDocumento.equalsIgnoreCase("CRT")) {

            throw new IllegalArgumentException(
                    "El documento debe ser DNI o CRT.");
        }

        this.tipoDocumento = tipoDocumento.toUpperCase();
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {

        if (numeroDocumento == null
                || !numeroDocumento.matches("\\d+")) {

            throw new IllegalArgumentException(
                    "El documento solo debe contener números.");
        }

        if (tipoDocumento.equals("DNI")
                && numeroDocumento.length() != 8) {

            throw new IllegalArgumentException(
                    "El DNI debe tener exactamente 8 dígitos.");
        }

        if (tipoDocumento.equals("CRT")
                && numeroDocumento.length() != 11) {

            throw new IllegalArgumentException(
                    "El Carné de Residencia Temporal debe tener 11 dígitos.");
        }

        this.numeroDocumento = numeroDocumento;
    }

    public char getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(char nivel) {

        nivel = Character.toUpperCase(nivel);

        if (nivel != 'A'
                && nivel != 'B'
                && nivel != 'C') {

            throw new IllegalArgumentException(
                    "El nivel socioeconómico debe ser A, B o C.");
        }

        this.nivelSocioeconomico = nivel;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {

        if (!tipoBeca.equalsIgnoreCase("Ninguna")
                && !tipoBeca.equalsIgnoreCase("Parcial")
                && !tipoBeca.equalsIgnoreCase("Total")) {

            throw new IllegalArgumentException(
                    "La beca debe ser Ninguna, Parcial o Total.");
        }

        this.tipoBeca = tipoBeca;
    }

    public double calcularPension() {
        return 0;
    }

    @Override
    public String toString() {

        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", nivelSocioeconomico=" + nivelSocioeconomico +
                ", tipoBeca='" + tipoBeca + '\'' +
                '}';
    }
}