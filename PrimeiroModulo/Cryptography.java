package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        String newPhrase = new String("");
        for(Integer i = 0; i < texto.length(); i += 1) {
            newPhrase += (char)(texto.charAt(i)+3);
        }

        return newPhrase;
    }

    @Override
    public String descriptografar(String texto) {
        String newPhrase = new String("");
        for(Integer i = 0; i < texto.length(); i += 1) {
            newPhrase += (char)(texto.charAt(i)+1);
        }

        return newPhrase;
    }
}
