import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean chave = false;
        boolean bons = false;
        boolean baratos = false;
        boolean chaveL = false;
        boolean chaveH = false;
        boolean falha = false;
        boolean ladrao = false;
        boolean mordido = false;
        boolean desmaio = false;
        boolean falido = false;

        System.out.println("Escolha seu personagem:");
        System.out.println("Luca:                Henry:");
        System.out.println("Energia = 50         Energia = 100");
        System.out.println("Dinheiro = 500       Dinheiro = 200");

        while (chaveL == false && chaveH == false){
            System.out.println("Digite 'Luca' ou 'Henry'");
            String x = input.nextLine();
            if (x.equalsIgnoreCase("Luca")){
                chaveL = true;
            }
            else if(x.equalsIgnoreCase("Henry")){
                chaveH = true;
            }
            else{
                System.out.println("Opção inválida");
            }
        }
        
        Persona Henry = new Persona("Henry", 100, 200);
        Persona Luca = new Persona("Luca", 50, 500);

        while (falha == false){
            System.out.print("O natal está chegando e você mal ver a hora de comprar presentes para as pessaos que você ama, ou seja, seu pai, sua irmã e ");
            System.out.print("a garota que você gosta, você sai de casa para comprar os presentes, porém você se depara com uma velhinha que anda com uma ");
            System.out.print("grande bolsa de compras, você normalmente não ajudaria, mas como é quase natal, seria uma boa ação ajudar a senhora. ");
            System.out.println("Você vai ajudar a senhora?");
            while (chave == false){
                System.out.println("Digite 'Sim' ou 'Nao'");
                String y = input.nextLine();
                if (y.equalsIgnoreCase("Sim")){
                    System.out.print("Você contaminado pelo espírito natalino ajuda a senhora com as compras, mas carregar te faz ficar cansado, ");
                    System.out.println("o que te faz perder energia");
                    if(chaveH == true){
                        Henry.cansaso(20);
                        System.out.println("Energia atual: " + Henry.energia);
                    }
                    else if (chaveL == true){
                        Luca.cansaso(20);
                        System.out.println("Energia atual: " + Luca.energia);
                    }
                    System.out.println("Em agradecimento a senhora te presenteia com 100 dinheiros");
                    if(chaveH == true){
                        Henry.gastar(-100);
                        System.out.println("Dinheiro atual: " + Henry.dinheiro);
                    }
                    else if (chaveL == true){
                        Luca.gastar(-100);
                        System.out.println("Dinheiro atual: " + Luca.dinheiro);
                    }
                    chave = true;
                }
                else if (y.equalsIgnoreCase("Nao")){
                    System.out.println("Você passa pela senhora sem ajuda-la");
                    chave = true;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            chave = false;
            System.out.print("Seguindo o seu caminho você encontra uma máquina que vende refrigerantes, incluindo o seu favorito, só por algum motivo ele ");
            System.out.print("tá custando cerca de 200 dinheiros, deve ser um erro de programação, você liga para a empressa que cuida da máquina, ");
            System.out.println("mas eles só poderam enviar alguém amanha, só que você está com muita vontade de tomar o refrigerante, o que você vai fazer? ");
            while (chave == false){
                System.out.println("Digite 'Ir embora' , 'Comprar' ou 'Roubar'");
                String z = input.nextLine();
                if (z.equalsIgnoreCase("ir embora")){
                    System.out.println("Você decide ir embora, largando a mão de tomar o refrigerante");
                    chave = true;
                }
                else if(z.equalsIgnoreCase("comprar")){
                    System.out.println("Você não aguenta a vontade e compra o refrigerante caro do mesmo jeito");
                    if(chaveH == true){
                        Henry.gastar(200);
                        System.out.println("Dinheiro atual: " + Henry.dinheiro);
                    }
                    else if (chaveL == true){
                        Luca.gastar(200);
                        System.out.println("Dinheiro atual: " + Luca.dinheiro);
                    }
                    System.out.println("Ao tomar o refrigerante, você recupera parte da sua energia");
                    if(chaveH == true){
                        Henry.cansaso(10);
                        System.out.println("Energia atual: " + Henry.energia);
                    }
                    else if (chaveL == true){
                        Luca.cansaso(10);
                        System.out.println("Energia atual: " + Luca.energia);
                    }
                    if (Henry.dinheiro == 0){
                        break;
                    }
                    chave = true;
                }
                else if(z.equalsIgnoreCase("Roubar")){
                    ladrao = true;
                    falha = true;
                    System.out.println("Na tentativa de roubar o refigerante um policial passa no exato momento em que você quebra o vidro da máquina e te prende");
                    break;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            if (Henry.dinheiro == 0 || Luca.dinheiro == 0){
                System.out.println("Você ficou sem dinheiro e não tem onde arranjar mais");
                falido = true;
                break;
            }
            if (ladrao == true){
                break;
            }
            chave = false;
            System.out.print("Quase chegando perto da loja, você esculta uns latidos atrás de você, ao olhar 3 cachorros estão correndo atrás de você ");
            System.out.println("Você vai correr ou andar normalmente?");
            while (chave == false){
                System.out.println("Digite 'Correr' ou 'Andar'");
                String v = input.nextLine();
                if(v.equalsIgnoreCase("correr")){
                    System.out.print("Você começa a correr na direção da loja de presentes, você consegue entrar antes dos cachorros te pegarem, mas a ");
                    System.out.print("corrida te fez cansar");
                    chave = true;
                    if(chaveH == true){
                        Henry.cansaso(30);
                        System.out.println("Energia atual: " + Henry.energia);
                    }
                    else if (chaveL == true){
                        Luca.cansaso(30);
                        System.out.println("Energia atual: " + Luca.energia);
                    }
                    if(Luca.energia == 0 || Henry.energia == 0){
                        System.out.print("Você se esforçou tanto que sua energia acabou o que te faz cansar e desmaiar na loja, acordando no hospital ");
                        System.out.print("só no dia de amanha, assim perdendo a chance de comprar os presentes");
                        desmaio = true;
                        break;
                    }
                }
                else if(v.equalsIgnoreCase("andar")){
                    System.out.print("Você decide não se preocupar com os cachorros, porém eles realmente queriam saber o seu gosto e te mordem todo ");
                    System.out.print("Por sorte algumas pessoas da rua te ajudam, mas você está tão ferido que foi necessario que você fosse ao ");
                    System.out.println("hospital para se tratar");
                    mordido = true;
                    break;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            if (mordido == true){
                break;
            }
            if (desmaio == true){
                break;
            }
            chave = false;
            System.out.print("Com você protegido dentro da loja, os cachorros vão embora, você e recebido pela atendente da loja, porém já tem em mente o ");
            System.out.print("que vai comprar, entretanto as coisas estão com um preço muito caro, mas você compra os presentes mais baratos, ");
            System.out.println("porém de uma qualidade menor");
            while (chave == false){
                System.out.println("Presentes Baratos = 300 dinheiros");
                System.out.println("Bons Presentes = 800 dinheiros");
                System.out.println("Digite 'Bons' ou 'Baratos'");
                String w = input.nextLine();
                if (w.equalsIgnoreCase("Bons") && chaveH == true && Henry.dinheiro >= 400){
                    System.out.println("Você compra bons presentes e volta para casa");
                    chave = true;
                    bons = true;
                }
                else if (w.equalsIgnoreCase("Baratos") && chaveH == true && Henry.dinheiro >= 200){
                    System.out.println("Você compra os presentes baratos e volta para casa");
                    chave = true;
                    baratos = true;
                }
                if (w.equalsIgnoreCase("Bons") && chaveL == true && Luca.dinheiro >= 400){
                    System.out.println("Você compra bons presentes e volta para casa");
                    chave = true;
                    bons = true;
                }
                else if (w.equalsIgnoreCase("Baratos") && chaveL == true && Luca.dinheiro >= 200){
                    System.out.println("Você compra os presentes baratos e volta para casa");
                    chave = true;
                    baratos = true;
                }
                else if (Luca.dinheiro < 200 || Henry.dinheiro < 200){
                    System.out.println("Você não tem dinheiro suficiente");
                    falido = true;
                    break;
                }
                else{
                    System.out.println("Opção inválida");
                }
            }
            falha = true;
        }
        if (ladrao == true){
            System.out.println("Ao ser pego, Você perde qualquer chance em conseguir comprar presentes para o natal");
        }
        if (mordido == true){
            System.out.print("Você acorda cheio de curativos, gazes e pontos no hospital, você não consegue mexer nem mesmo um dedo que começa a doer, ");
            System.out.println("assim não tendo chance para voce comprar os presentes");
        }
        if (falido == true){
            System.out.println("Você Triste por não ter dinheiro volta para casa quase chorando");
        }
        if (baratos == true){
            System.out.print("Você volta para casa com os presentes embrulhados, a noite de natal chega e começa a entrega dos presentes, todos recebem os ");
            System.out.println("seus presentes, porém todos ficam com uma cara de decepção, assim estragando a entrega dos presentes");
        }
        else if (bons == true){
            System.out.print("Você volta para casa com os presentes embrulhados, a noite de natal chega e começa a entrega dos presentes, todos recebem os ");
            System.out.print("seus presentes, todos ficam felizes com a entrega dos presentes, incluindo a menina que você gosta, que acba dando um beijo ");
            System.out.print("na sua bochecha");
        }
        System.out.println("Fim!");
    }
}