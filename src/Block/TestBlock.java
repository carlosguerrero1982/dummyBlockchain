package Block;

public class TestBlock {
    public static void main(String[] args) {
        Blockchain bc = new Blockchain();
        Block b = new Block("0x200",new java.util.Date(),"<transaction>");
        Block bi = new Block("0x200",new java.util.Date(),"<transaction>");
        Block bd= new Block("0x200",new java.util.Date(),"<transaction>");

        bc.addBlock(b);
        bc.addBlock(bi);
        bc.addBlock(bd);
        bc.displayChain();
        bc.isValid();
    }
}
