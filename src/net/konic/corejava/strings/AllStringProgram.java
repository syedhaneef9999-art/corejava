package net.konic.corejava.strings;

public class AllStringProgram {

    public static void main(String[] args) {

        // Q1. String Immutability
        String password = "admin123";
        password.concat("hack");
        System.out.println("Password remains: " + password);

        // Q2. String Modification with Reassignment
        String msg = "Hello";
        msg = msg.concat(" World");
        System.out.println("Updated Message: " + msg);

        // Q3. equals() vs ==
        String u1 = "admin";
        String u2 = new String("admin");
        System.out.println("== result: " + (u1 == u2));
        System.out.println(".equals result: " + u1.equals(u2));

        // Q4. String Constant Pool
        String a = "Hotel";
        String b = "Hotel";
        System.out.println("Same memory location: " + (a == b));

        // Q5. Order ID Builder (StringBuilder)
        StringBuilder order = new StringBuilder("ORD");
        order.append(1001);
        System.out.println("Order ID: " + order);

        // Q6. Address Update (StringBuffer)
        StringBuffer address = new StringBuffer("Street 5");
        address.append(" Hyderabad");
        System.out.println("Updated Address: " + address);

        // Q7. Reverse Password
        StringBuilder revPwd = new StringBuilder("admin");
        System.out.println("Reversed Password: " + revPwd.reverse());

        // Q8. Delete OTP Last Digit
        String otp = "12345";
        otp = otp.substring(0, otp.length() - 1);
        System.out.println("Updated OTP: " + otp);

        // Q9. Insert Invoice Number
        StringBuilder invoice = new StringBuilder("Invoice Generated");
        invoice.insert(8, "101 ");
        System.out.println("Number" + invoice);

        // Q10. Email Normalization
        String email = " Admin@GMAIL.Com ";
        email = email.trim().toLowerCase();
        System.out.println("Normalized Email: " + email);

        // Q11. Username Validation
        String user = "adminUser01";
        if (user.startsWith("admin"))
            System.out.println(" Valid admin user");

        // Q12. Mask Mobile Number
        String mobile = "9876543210";
        String masked = mobile.substring(0,2) + "****" + mobile.substring(8);
        System.out.println("Masked Mobile: " + masked);

        // Q13. URL Builder
        String url = "https" + "://" + "konic.net" + "/login";
        System.out.println("URL: " + url);

        // Q14. Remove Special Characters
        String sp = "Konic@2025!";
        System.out.println("Output: " + sp.replaceAll("[^a-zA-Z0-9]", ""));

        // Q15. Word Count
        String sentence = "Welcome to Konic Technologies";
        System.out.println("Word Count: " + sentence.split(" ").length);

     // Q16. Count Character Occurrence
        String s = "programming";
        char ch = 'g';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Occurrences of 'g': " + count);

     // Q17. Palindrome Check
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

     // Q18. Remove Duplicate Characters
        String s1 = "java";
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (result.indexOf(c) == -1) {
                result = result + c;
            }
        }

        System.out.println(result);


     // Q19. First Non-Repeated Character
        String s2 = "swiss";

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            if (s2.indexOf(c) == s2.lastIndexOf(c)) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }


        // Q20. Swap Two Strings (No 3rd Variable)
        String x = "hello";
        String y = "world";
        x = x + y;
        y = x.substring(0, x.length() - y.length());
        x = x.substring(y.length());
        System.out.println("String1: " + x);
        System.out.println("String2: " + y);
    }
}

