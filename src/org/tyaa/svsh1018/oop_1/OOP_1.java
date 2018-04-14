/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.svsh1018.oop_1;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author student
 */
public class OOP_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Создали примитивную переменную,
        //записали в нее код буквы D
        char ch1 = 'D';
        //Создали ссылочную переменную,
        //записали в нее ссылку на новый объект типа Cart
        Cart cart1 = new Cart();
        //В поле id объекта типа Cart записали значение 1
        cart1.id = 1;
        //Из поля id объекта типа Cart вывели значение и распечатали в консоли
        System.out.println(cart1.id);
        
        //cart1 = null;
        //System.out.println(cart1.id);
        
        Article article1 = new Article();
        article1.id = 1;
        article1.name = "art1";
        article1.price = new BigDecimal(15);
        
        Article article2 = new Article();
        article2.id = 2;
        article2.name = "art2";
        article2.price = new BigDecimal(25);
        
        ArticleInCart articleInCart1 = new ArticleInCart();
        articleInCart1.id = 1;
        articleInCart1.cartId = 1;
        articleInCart1.articleId = 1;
        articleInCart1.quantity = 100;
        
        ArticleInCart articleInCart2 = new ArticleInCart();
        articleInCart2.id = 2;
        articleInCart2.cartId = 1;
        articleInCart2.articleId = 2;
        articleInCart2.quantity = 20;
        
        
    }
    
}
