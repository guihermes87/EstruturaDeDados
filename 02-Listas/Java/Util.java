public class Util {
    /**
     * método para validar o CPF, verificando se tem 11 dígitos e se todos são numéricos
     * @param cpf - numero identificador da pessoa fisica
     * @return true se o CPF for válido, false caso contrário.
     */
    public static boolean cpfValido(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
