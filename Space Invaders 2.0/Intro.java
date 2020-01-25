/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


/**
 *
 * @author cataldi.lorenzo
 */
class Intro extends Space {
  private int i = 0;
    
    void run() throws InterruptedException {
       setBackground (Color.BLACK);
       setSize(800, 600);
               
        for(i=100;i>=0;i-=1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(50);
        }

    }
      @Override
        public void paint(Graphics g) {
             g.setColor(Color.yellow);
        g.setFont(new Font("Bold", Font.PLAIN, 40+i));
        g.drawString("Space Invaders", 100+i, 100+i);
        g.setFont(new Font("Bold", Font.PLAIN, 10+i));
        g.drawString("          by Lorenzo Cataldi", 110+i+i, 110+i+i);           
        }

 
}
