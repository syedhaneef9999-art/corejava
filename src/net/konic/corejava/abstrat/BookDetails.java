package net.konic.corejava.abstrat;
abstract class Book { 
    abstract void getTitle(); 
}
class StoryBook extends Book {
    
    void getTitle() {
        System.out.println("The Jungle Book");
    }
}

public class BookDetails {

    public static void main(String[] args) {
        StoryBook sb = new StoryBook(); 
        sb.getTitle(); 
    }
}
