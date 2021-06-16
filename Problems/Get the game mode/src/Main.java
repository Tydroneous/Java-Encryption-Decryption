class Problem {
    public static void main(String[] args) {
        String word = "default";
        for (int i = 0; i <= args.length - 1; i += 2) {
            if (args[i].equals("mode")) {
                word = args[i + 1];
            }
        }
        System.out.println(word);
    }
}