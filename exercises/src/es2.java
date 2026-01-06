

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ciao inserisci una stringa");
    String firstLine = sc.nextLine();
    System.out.println("Ciao inserisci una seconda stringa");
    String  secondLine= sc.nextLine();
    System.out.println("Ciao inserisci l'ultima stringa");
    String thirdLine = sc.nextLine();

    String[] arr = {firstLine, secondLine, thirdLine};
    String[] arrReverse = {thirdLine, secondLine, firstLine};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arrReverse));
}