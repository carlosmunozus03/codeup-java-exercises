public class StringExercise {
    public static void main(String[] args) {
        //1.-

        String dontNeed = "We don't need no education\n" +
                "We don't need no thought control \n";
        System.out.println(dontNeed);

        String check = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(check);

        String inWindows = "In windows, the main drive is usually C:\\\n";
        System.out.println(inWindows);

        String backslashes = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(backslashes);
    }

    //2.-
//    public class Bob {
//        public static void main(String[] args) {
//
//        }
//
//        private final static String DEFAULT_RESPONSE = "Whatever.";
//        private final static String WHOA_RESPONSE = "Whoa, chill out!";
//        private final static String SURE_RESPONSE = "Sure.";
//        private final static String INDIGNANT_RESPONSE = "Fine. Be that way!";
//
//        public String hey(String request) {
//            if (request.trim().length() == 0) return INDIGNANT_RESPONSE;
//            if (isYelling(request)) return WHOA_RESPONSE;
//            if (request.endsWith("?")) return SURE_RESPONSE;
//            return DEFAULT_RESPONSE;
//        }
//
//        private boolean isYelling(String request) {
//            String yelled = request.toUpperCase();
//            String whispered = request.toLowerCase();
//            return !request.equals(whispered) && request.equals(yelled);
//        }
//    }

}