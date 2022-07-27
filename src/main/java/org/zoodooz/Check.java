package org.zoodooz;

//DO POPRAWY BO DO KOŃCA NIE DZIAŁA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Check {

    private String name;
    private String data;
    private double sum;

    public Check (String name, String data, double sum){
        this.name = name;
        this.data = data;
        this.sum = sum;
    }

    public double getSum(){
        return sum;
    }


    public String readingSum() {
        char[] array = String.valueOf(sum).toCharArray();
        System.out.println(array.length);
        String tysieczna = " ";
        String setna = " ";
        String dziesietna = " ";
        String jednostkowa = " ";
        if (array.length == 6) {
            if (array[0] == 1) {
                tysieczna = "tysiąc";
            } else if (array[0] == 2) {
                tysieczna = "dwa tysiące";
            } else if (array[0] == 3) {
                tysieczna = "trzy tysiące";
            } else if (array[0] == 4) {
                tysieczna = "cztery tysiące";
            } else if (array[0] == 5) {
                tysieczna = "pięć tysiące";
            } else if (array[0] == 6) {
                tysieczna = "sześć tysiące";
            } else if (array[0] == 7) {
                tysieczna = "siedem tysiące";
            } else if (array[0] == 8) {
                tysieczna = "osiem tysiące";
            } else if (array[0] == 9) {
                tysieczna = "dziewięć tysiące";
            }

            if (array[1] == 1) {
                setna = "sto";
            } else if (array[1] == 2) {
                setna = "dwieście";
            } else if (array[1] == 3) {
                setna = "trzysta";
            } else if (array[1] == 4) {
                setna = "czterysta";
            } else if (array[1] == 5) {
                setna = "pięćset";
            } else if (array[1] == 6) {
                setna = "sześćset";
            } else if (array[1] == 7) {
                setna = "siedemset";
            } else if (array[1] == 8) {
                setna = "osiemset";
            } else if (array[1] == 9) {
                setna = "dziewięćset";
            }

            if (array[2] == 1) {
                dziesietna = "dziesięć";
            } else if (array[2] == 2) {
                dziesietna = "dwadzieścia";
            } else if (array[2] == 3) {
                dziesietna = "Trzydzieści";
            } else if (array[2] == 4) {
                dziesietna = "czterdzieści";
            } else if (array[2] == 5) {
                dziesietna = "pięćdziesiąt";
            } else if (array[2] == 6) {
                dziesietna = "sześćdziesiąt";
            } else if (array[2] == 7) {
                dziesietna = "siedemdziesiat";
            } else if (array[2] == 8) {
                dziesietna = "osiemdziesiąt";
            } else if (array[2] == 9) {
                dziesietna = "dziewięćdziesiąt";
            }

            if (array[3] == 1) {
                jednostkowa = "jeden";
            } else if (array[3] == 2) {
                jednostkowa = "dwa";
            } else if (array[3] == 3) {
                jednostkowa = "trzy";
            } else if (array[3] == 4) {
                jednostkowa = "cztery";
            } else if (array[3] == 5) {
                jednostkowa = "pieć";
            } else if (array[3] == 6) {
                jednostkowa = "sześć";
            } else if (array[3] == 7) {
                jednostkowa = "siedem";
            } else if (array[3] == 8) {
                jednostkowa = "osiem";
            } else if (array[3] == 9) {
                jednostkowa = "dziewięć";
            }
            return tysieczna + " " + setna + " " + dziesietna + " " + jednostkowa;
        } else if (array.length == 5) {
            for (int i = 0; i < array.length; i++) {
                if (array[0] == 1) {
                    System.out.println("sto");
                } else if (array[0] == 2) {
                    System.out.println("dwieście");
                } else if (array[0] == 3) {
                    System.out.println("trzysta");
                } else if (array[0] == 4) {
                    System.out.println("czterysta");
                } else if (array[0] == 5) {
                    System.out.println("pięćset");
                } else if (array[0] == 6) {
                    System.out.println("sześćset");
                } else if (array[0] == 7) {
                    System.out.println("siedemset");
                } else if (array[0] == 8) {
                    System.out.println("osiemset");
                } else if (array[0] == 9) {
                    System.out.println("dziewięćset");
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[1] == 1) {
                    System.out.println("dziesięć");
                } else if (array[1] == 2) {
                    System.out.println("dwadzieścia");
                } else if (array[1] == 3) {
                    System.out.println("Trzydzieści");
                } else if (array[1] == 4) {
                    System.out.println("czterdzieści");
                } else if (array[1] == 5) {
                    System.out.println("pięćdziesiąt");
                } else if (array[1] == 6) {
                    System.out.println("sześćdziesiąt");
                } else if (array[1] == 7) {
                    System.out.println("siedemdziesiat");
                } else if (array[1] == 8) {
                    System.out.println("osiemdziesiąt");
                } else if (array[1] == 9) {
                    System.out.println("dziewięćdziesiąt");
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[2] == 1) {
                    System.out.println("jeden");
                } else if (array[2] == 2) {
                    System.out.println("dwa");
                } else if (array[2] == 3) {
                    System.out.println("trzy");
                } else if (array[2] == 4) {
                    System.out.println("cztery");
                } else if (array[2] == 5) {
                    System.out.println("pieć");
                } else if (array[2] == 6) {
                    System.out.println("sześć");
                } else if (array[2] == 7) {
                    System.out.println("siedem");
                } else if (array[2] == 8) {
                    System.out.println("osiem");
                } else if (array[2] == 9) {
                    System.out.println("dziewięć");
                }
            }
            return " ";
        } else if (array.length == 5) {
            for (int i = 0; i < array.length; i++) {
                if (array[0] == 1) {
                    System.out.println("dziesięć");
                } else if (array[0] == 2) {
                    System.out.println("dwadzieścia");
                } else if (array[0] == 3) {
                    System.out.println("Trzydzieści");
                } else if (array[0] == 4) {
                    System.out.println("czterdzieści");
                } else if (array[0] == 5) {
                    System.out.println("pięćdziesiąt");
                } else if (array[0] == 6) {
                    System.out.println("sześćdziesiąt");
                } else if (array[0] == 7) {
                    System.out.println("siedemdziesiat");
                } else if (array[0] == 8) {
                    System.out.println("osiemdziesiąt");
                } else if (array[0] == 9) {
                    System.out.println("dziewięćdziesiąt");
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[1] == 1) {
                    System.out.println("jeden");
                } else if (array[1] == 2) {
                    System.out.println("dwa");
                } else if (array[1] == 3) {
                    System.out.println("trzy");
                } else if (array[1] == 4) {
                    System.out.println("cztery");
                } else if (array[1] == 5) {
                    System.out.println("pieć");
                } else if (array[1] == 6) {
                    System.out.println("sześć");
                } else if (array[1] == 7) {
                    System.out.println("siedem");
                } else if (array[1] == 8) {
                    System.out.println("osiem");
                } else if (array[1] == 9) {
                    System.out.println("dziewięć");
                }
            }
            return " ";
        } else if (array.length == 3) {
            for (int i = 0; i < array.length; i++) {
                if (array[0] == 1) {
                    System.out.println("jeden");
                } else if (array[0] == 2) {
                    System.out.println("dwa");
                } else if (array[0] == 3) {
                    System.out.println("trzy");
                } else if (array[0] == 4) {
                    System.out.println("cztery");
                } else if (array[0] == 5) {
                    System.out.println("pieć");
                } else if (array[0] == 6) {
                    System.out.println("sześć");
                } else if (array[0] == 7) {
                    System.out.println("siedem");
                } else if (array[0] == 8) {
                    System.out.println("osiem");
                } else if (array[0] == 9) {
                    System.out.println("dziewięć");
                }
            }
        }
        return " ";
    }
    public void realiseCheck(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t Data: \t" + data);
        System.out.printf("Wypłacić Pani/Panu: \t " + name + "\t %.2f złotego\n", sum );
        System.out.println(readingSum());

    }
}