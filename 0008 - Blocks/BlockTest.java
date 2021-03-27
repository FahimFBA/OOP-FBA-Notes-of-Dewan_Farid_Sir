public class BlockTest{
    public String info;

 
    public BlockTest() {
        info = "Constructors: Executed in 2nd step";
        System.out.println(info);
    }

    {
        info = "Block: Executed in 1st step";
        System.out.println(info);
    }

    public void show(){
        info = "Method: Executed in 3rd step";
        System.out.println(info);
    }

    public static void main(String[] args){
        BlockTest bt = new BlockTest();
        bt.show();
    }
}