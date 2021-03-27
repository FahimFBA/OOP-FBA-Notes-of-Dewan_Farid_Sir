public class SwitchTest{
    public void mySwitch(int x) {
        switch (x) {
            case 1: System.out.println("RED");
            break;
            case 2: System.out.println("GREEN");
            break;
            case 3: System.out.println("BLUE");
            break;
            default: System.out.println("WHITE");
        }
    }

    public static void main(String[] args){
        SwitchTest st = new SwitchTest();
        st.mySwitch(2);
    }
}