package com.scaler.lld.inheritance;

public class Client {

    public static void main(String[] args) {
        TA ta = new TA();

        ta.name = "Naman";

        Mentor mentor = new Mentor();
        mentor.name = "Naman";

        Student st = new Student();
        st.psp = 81.0;
        st.name = "Naman";
        st.pauseBatch();
        st.changeName("Sudhanshu");
        st.printUserId();
    }
}
