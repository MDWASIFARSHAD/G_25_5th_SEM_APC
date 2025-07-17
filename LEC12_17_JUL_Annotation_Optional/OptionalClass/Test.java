package Optional_17_07;

import java.util.Optional;

class Test {
    private String name;
    private String email;

    public Test(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public static void main(String[] args) {
        Test t = new Test("Wasif", null);
        String e = t.getEmail().orElse("Not available");
        System.out.println(e); 
    }
}
