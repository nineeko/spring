package com.neeko.section03.properties.subsection01.properties;

import com.neeko.common.Product;
import com.neeko.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // 슈퍼에 상품이 진열 되어 있다
        Product carpBread = applicationContext.getBean("carpBread", Product.class);
        Product milk = applicationContext.getBean("milk", Product.class);
        Product water = applicationContext.getBean("water", Product.class);

        // 쇼핑 카트를 꺼내 상품을 담는다
        ShoppingCart shoppingCart = applicationContext.getBean("cart", ShoppingCart.class);
        shoppingCart.addItem(carpBread);
        shoppingCart.addItem(milk);
        System.out.println("cart에 담긴 물품 : " + shoppingCart.getItem());

        // 다음 손님이 와서 쇼핑 카트를 사용한다
        ShoppingCart shoppingCart2 = applicationContext.getBean("cart", ShoppingCart.class);
        shoppingCart2.addItem(water);
        System.out.println("cart2에 담긴 상품 : " + shoppingCart2.getItem());
    }
}