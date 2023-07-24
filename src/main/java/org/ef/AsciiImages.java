package org.ef;

public class AsciiImages {
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public AsciiImages() {
    }

    public void printBlanks(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void printBanner(){
        lilPause();
        System.out.println(
                "                  __  __      __     ____  _                  \n" +
                        "          __     / / / /___  / /_   / __ \\(_)_______       __ \n" +
                        "       __/ /_   / /_/ / __ \\/ __/  / / / / / ___/ _ \\   __/ /_\n" +
                        "      /_  __/  / __  / /_/ / /_   / /_/ / / /__/  __/  /_  __/\n" +
                        "       /_/    /_/ /_/\\____/\\__/  /_____/_/\\___/\\___/    /_/   \n");
    }

    public void printFlames(){
        lilPause();
        System.out.println(row1 + row2 + row3 + row4 + row5 + row6 + row7 + row8);
    }

    public void printUpsideDownFlames(){
        lilPause();
        System.out.println(row8 + row7 + row6 + row5 + row4 + row3 + row2 + row1);

    }

    public void lilPause(){
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void customPause(int pause){
        if (pause <= 2000){
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int printDieSix(int roll) {
        switch (roll) {
            case 1:

                                String rowOne1 = "      ._______.\n";
                                String rowOne2 = "    /_______ / |\n";
                                String rowOne3  = "   |         | |\n";
                                String rowOne4 = "   |    "+YELLOW+"@"+RED+"    | /\n";
                                String rowOne5 = "   |         |/\n";
                                String rowOne6 = "   \"--------\"";
                System.out.println(rowOne1 + rowOne2 + rowOne3 + rowOne4 + rowOne5 + rowOne6);
                break;
            case 2:
                                String rowTwo1 = "      ._______.\n";
                                String rowTwo2 = "    /_______ / |\n";
                                String rowTwo3 = "   |  "+YELLOW+"@"+RED+"      | |\n";
                                String rowTwo4 = "   |         | /\n";
                                String rowTwo5 = "   |      "+YELLOW+"@"+RED+"  |/\n";
                                String rowTwo6 = "   \"--------\"";
                System.out.println(rowTwo1 + rowTwo2 + rowTwo3 + rowTwo4 + rowTwo5 + rowTwo6);
                break;
            case 3:
                                String rowThr1 = "      ._______.\n";
                                String rowThr2 = "    /_______ / |\n";
                                String rowThr3 = "   |  "+YELLOW+"@"+RED+"      | |\n";
                                String rowThr4 = "   |    "+YELLOW+"@"+RED+"    | /\n";
                                String rowThr5 = "   |      "+YELLOW+"@"+RED+"  |/\n";
                                String rowThr6 = "   \"--------\"";
                System.out.println(rowThr1 + rowThr2 + rowThr3 + rowThr4 + rowThr5 + rowThr6);
                break;
            case 4:
                                String rowFou1 = "      ._______.\n";
                                String rowFou2 = "    /_______ / |\n";
                                String rowFou3 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  | |\n";
                                String rowFou4 = "   |         | /\n";
                                String rowFou5 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  |/\n";
                                String rowFou6 = "   \"--------\"";
                System.out.println(rowFou1 + rowFou2 + rowFou3 + rowFou4 + rowFou5 +rowFou6);
                break;
            case 5:
                                String rowFiv1 = "      ._______.\n";
                                String rowFiv2 = "    /_______ / |\n";
                                String rowFiv3 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  | |\n";
                                String rowFiv4 = "   |    "+YELLOW+"@"+RED+"    | /\n";
                                String rowFiv5 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  |/\n";
                                String rowFiv6 = "   \"--------\"";
                System.out.println(rowFiv1 + rowFiv2 + rowFiv3 + rowFiv4 + rowFiv5 + rowFiv6);
                break;
            case 6:
                                String rowSix1 = "      ._______.\n";
                                String rowSix2 = "    /_______ / |\n";
                                String rowSix3 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  | |\n";
                                String rowSix4 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  | /\n";
                                String rowSix5 = "   |  "+YELLOW+"@"+RED+"   "+YELLOW+"@"+RED+"  |/\n";
                                String rowSix6 = "   \"--------\"";
                System.out.println(rowSix1 + rowSix2 + rowSix3 + rowSix4 + rowSix5 + rowSix6);
                break;
        }
    return roll;
    }

    public void printTwoDice(){
        System.out.println("                \n" +RED+
                "                             .----------,           \n" +
                "                           / \\  "+ YELLOW +"@     @"+ RED +"  \\ \n" +
                "                          / "+ YELLOW +"@"+ RED +" \\  "+ YELLOW +"@     @"+ RED +"  \n" +
                "                         /     \\ _________ \\\n" +
                "                 . _______\\_ "+ YELLOW +"@"+ RED +" /           /\n" +
                "               / ____"+ YELLOW +"*"+ RED +"____ /|/      "+ YELLOW +"@"+ RED +"    /\n" +
                "              |         "+YELLOW+"@"+RED+" |"+YELLOW+"@"+RED+"| ________ / \n" +
                "              |      "+YELLOW+"@"+RED+"    | |         \n" +
                "              |           |"+YELLOW+"@"+RED+"| \n" +
                "              |  "+YELLOW+"@"+RED+"        |/       \n" +
                "               '---------'"


        );


    }


    //flame art
    String row1 = RED + "              {       ' ,                 /       ,  ,            .          \n";
    String row2 = "         .     {\\      {                { |      }               }.        \n";
    String row3 = "   '     |     / { \\{     \\}              /}      {/ }              }    \n";
    String row4 = "        {\\    / ## | ||   {/           / /|       /#\\    }        /# }   \n";
    String row5 = " }\\      {#}  ### # }{   {/ *     {}   " + YELLOW + "{ /" + RED + "##   {  {//" + YELLOW + "##" + RED + "##}}       { ##}    \n";
    String row6 = " {{    {{ /#  {{" + YELLOW + "##" + RED + "}  {#" + YELLOW + "##" + RED + "#}       /    \\##   /    {{" + YELLOW + "##" + RED + " ##   \"    {{{#} \n";
    String row7 = YELLOW +
            "  /}" + RED + "} {{" + YELLOW + "{ # ##### ||#### } " + RED + "{/ ||" + YELLOW + "{{ {   }#####" + RED + "}}}{{{" + YELLOW + "### ##" + RED + "#}}}"+ YELLOW +"     {}" + RED + "}} \n";
    String row8 = YELLOW + "#  ##   {{# ## ##    #### {{###### }}|{{#####  #####  {{######{|{{ /#/}}} \n";


}
//                        .----------,
//                      / \  @     @  \
//                     / @ \  @     @  \
//                    /     \ _________ \
//           . _______\_ @  /          /
//          / ____*____ /| /     @    /
//         |         @ |@| ________ /
//         |     @     | |
//         |  @        |@|
//         '___________'/
//
//
//                                        "   ._______.\n" +
//                                        " /_______ / |\n" +
//                                        "|         | |\n" +
//                                        "|    @    | /\n" +
//                                        "|         |/\n" +
//                                        "\"--------\n"
//                                        );