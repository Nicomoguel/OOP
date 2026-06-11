class Block3d{
    public static void main(String[] s){
        Block block1 = new Block(10, 10, 10);
        Block block2 = new Block(5, 4 ,3);
        Block block3 = new Block(10, 10, 10);

        if(block1.sameBlock(block3) == true) System.out.println("Block 1 and Block 3 are the same block");
        else System.out.println("Block 1 and Block 3 are different blocks");

        if(block1.sameBlock(block2) == true) System.out.println("Block 1 and Block 2 are the same block");
        else System.out.println("Block 1 and Block 2 are different blocks");
        
        if(block1.sameVolume(block2) == true) System.out.println("Block 1 and Block 2 have the same volume");
        else System.out.println("Block 1 and Block 2 have different volumes");

    }
}
