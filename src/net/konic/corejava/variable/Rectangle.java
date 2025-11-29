package net.konic.corejava.variable;
/*8) Product Discount System

Instance variable: price

Method readPrice() → local Scanner

Method getDiscount() → return discounted price

Display final amount.
*/

class Rectangle {

    int length, width; 

    // set both dimensions
    void setDimensions(int l, int w) {
        length = l;
        width = w;
    }

    // calculate area
    int getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        
    }
}

