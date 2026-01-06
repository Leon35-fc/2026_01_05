
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println(multiply( 5,4));
    System.out.println(concatena("ciao",5));
    System.out.println(Arrays.toString(concStr()));
}

    public static int multiply(int num_1, int num_2) {
    return num_1 * num_2;
    }

    public static String concatena(String str, int num) {
     return  str + ' ' + Integer.toString(num);
    }

    public static String[] concStr(){
        String[] arr1 = {"Sono", "un", "array", "di", "caratteri"};
        String stringa2 = "nuovo";
        String[] newArr = new String[arr1.length + 1];
        System.arraycopy(arr1, 0, newArr, 0, 2);
        newArr[2] = stringa2;
        newArr[3] = arr1[2];
        newArr[4] = arr1[3];
        newArr[5] = arr1[4];
        return newArr;
    }
