class Problem {
    public static void main(String[] args) {

       // System.out.println(args.toString().indexOf("test"));
        int isValid = -1;
        for (int i = 0; i <= args.length - 1; i++) {
            if (args[i].equals("test")) {
                System.out.println(i);
                isValid = 0;
                break;
            }
        }
        if (isValid == -1) {
            System.out.println(isValid);
        }
    }
}