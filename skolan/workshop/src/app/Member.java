package app;

public class Member {

        private String name;
        private String email;
        private static final String separator = ";";

        public Member(String name, String email) {
            this(name);
            setEmail(email);
        }


        public Member(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            if (email != null && email.contains("@")) {
                this.email = email;
            }
        }

        public String toString() {
            return name + separator + email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }


        public static String getSeparator() {
            return separator;
        }

}
