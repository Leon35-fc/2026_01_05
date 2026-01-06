void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Scrivi l'altezza del rettangolo");
    String altezza = sc.nextLine();
    System.out.println("Scrivi la larghezza del rettangolo");
    String larghezza = sc.nextLine();
    System.out.println("Il perimetro del rettangolo è:");
    System.out.println( perimetroRettangolo( altezza, larghezza));
    System.out.println("Scrivi un numero");
    String num = sc.nextLine();
    System.out.println( eDispari(num));
    System.out.println("Scrivi 3 numeri separati da uno spazio");
    String lati = sc.nextLine();
    System.out.println( erone(lati));
}
    public static double perimetroRettangolo(String h, String w){
        return (Float.parseFloat(h) + Float.parseFloat(w)) * 2;
    }

    public static int eDispari(String num){
        int resto = Integer.parseInt(num)%2;
        if(resto != 0) {
            System.out.println("Il numero è dispari");
          return 1;
        } else {
            System.out.println("Il numero è pari");
          return 0;
        }
    }

    public static double erone(String str){

        String[] lati = str.split(" ");
        int a = Integer.parseInt(lati[0]);
        int b = Integer.parseInt(lati[1]);
        int c = Integer.parseInt(lati[2]);

        double sp = (a + b + c)/2;
        double area = Math.sqrt(sp*(sp - a)*(sp - b)*(sp - c));
        return area;
    }

