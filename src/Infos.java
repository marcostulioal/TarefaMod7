/**
 * @author marco
 */
public class Infos {

    public static void main(String[] args) {
        System.out.println("Informações do produto");
        //criando um objeto e definindo a marca do fogão
        fogao novoFogao = new fogao();
        novoFogao.setMarca("Electrolux");
        novoFogao.setBocas(4);
        novoFogao.setCondicao("Novo");

        //imprimindo as informações do produto na tela
        String nomeMarca = novoFogao.getMarca();
        System.out.println("A marca do fogão é " + nomeMarca);
        int numBocas = novoFogao.getBocas();
        System.out.println("O fogão tem " + numBocas + " bocas");
        String estadoFogao = novoFogao.getCondicao();
        System.out.println("O fogão é " + estadoFogao);
    }
}