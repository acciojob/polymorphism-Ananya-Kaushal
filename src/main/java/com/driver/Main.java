package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        System.out.println(p.Product(4,5));
        System.out.println(p.Product(4,5,6));
        System.out.println(p.Product(4.25,7.34));
    }
    static class Product
    {
        public int Product(int x,int y)
        {
            return x*y;
        }
        //Method Overlaoding
        public int Product(int x,int y,int z)
        {
            return x*y*z;
        }
        public  double Product(double x,double y)
        {
            return x*y;
        }
    }

}