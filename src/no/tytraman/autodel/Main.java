package no.tytraman.autodel;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            System.out.println("Veuillez cliquer dans la barre de texte dans une conversation Discord, cette barre -> (Envoyer un message à...)\nVous avez 10 secondes" +
                    " pour le faire !");
            Thread.sleep(10000);
            System.out.println("Lancement du processus, surtout, ne touchez à rien pendant ce temps, Discord doit absolument rester l'application active !\n" +
                    "Pour arrêter le processus, fermez simplement le terminal qui exécute le programme");
            while(true) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);
                Thread.sleep(100);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_A);
                Thread.sleep(100);
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                Thread.sleep(100);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(500);
                robot.keyPress(KeyEvent.VK_INSERT);
                robot.keyRelease(KeyEvent.VK_INSERT);
                Thread.sleep(100);
            }
        }catch(AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
