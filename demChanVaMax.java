public static String demChanVaMax(String s) {
    if (s == null || s.trim().isEmpty()) return "0 0";
    String[] parts = s.trim().split("\\s+");
    int countEven = 0;
    int max = Integer.MIN_VALUE;
    for (String p : parts) {
        if (!p.isEmpty()) {
            int num = Integer.parseInt(p);
            if (num % 2 == 0) {
                countEven++;
            }
            if (num > max) {
                max = num;
            }
        }
    }
    return countEven + " " + max;
}