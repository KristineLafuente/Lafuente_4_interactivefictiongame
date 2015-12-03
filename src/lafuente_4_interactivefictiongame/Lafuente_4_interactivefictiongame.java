/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_interactivefictiongame;

import java.util.Scanner;
/**
 *
 * @author Kristine
 */
public class Lafuente_4_interactivefictiongame {
    
    static String username;
    static String Input;

    /**
     * @param args the command line arguments
     */
    // this is my main method. It starts off the game.
    public static void main(String[] args) {
        // I used Scanner A in all of my methods.
     Scanner A = new Scanner(System.in);
     Scanner name = new Scanner(System.in);
         System.out.println("Please type your name");
         //The players name is used in this game.
        username = name.nextLine();
         System.out.println("In this game, your decisions will affect your outcome. You will face survival and friendship.");
         System.out.println("Will you be rich or will you die? Will you make a friend or an enemy?");
         System.out.println("Unknown: Hey, have you heard the news?");
         System.out.println("Please type A or B");
         System.out.println("A. Who are you?");
         System.out.println("B. No, what are you talking about?");
         // if you input A, then you are taken to another mathod.
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
        A();
        }
        // if you input B, then the game ends or you are taken to another method.
        if("B".equalsIgnoreCase(Input)) {
         System.out.println("Unknown: Christopher Columbus has discovered new land! Gold is said to be all over the place! You must join me on my boat!");
         System.out.println(username + ": I have a son and a job back home though, and I don't even know you. How can I put my trust in you as we travel through harsh waters?");
         System.out.println("Unknown: My name is Nial, and I am a conquistador. I promise you that you and your son can be rich if you come with me. We can discover gold; you will not need a job anymore!");
         System.out.println(username + ": Yes, I will join you on this adventure!");
         System.out.println("You are on the boat with Nial, a pig, and two guns. You have made it halfway through the waters when a huge wave knocks the boat over! Everything in the small boat including You and Nial are thrown into the water.");
         System.out.println("Nial is about ten feet away from you, and the supplies is in your reach. Nial is drowning and needs your help, but the pig and weapons are being taken by the current. Do you grab your only food source and weapons, or do you take the risk of drowning yourself to help Nial?");
         System.out.println("A. Grab pig and guns");
         System.out.println("B. Help Nial");
        
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
         System.out.println("You, the pig, and the weapons make it back on the boat. Nial is struggling to stay above the water. You know you made the right decision, but was it worth the guilt? To your surprise, Nial grabs ahold of the boat and pulls himself up. You are relieved, but you know Nial is angry.");
         System.out.println("***Nial will remember this.***");
        Explore();
        }
        if("B".equalsIgnoreCase(Input)) {
         System.out.println("You boost Nial onto the boat, but the current pulls you under water. You hear the muffled sound of Nial screaming your name. You drown and die.");
         System.out.println("GAME OVER");
        
        }
        
        }
          
        }
         // this method can make the game end or continue onto another method.
    static void A() {
     Scanner A = new Scanner(System.in);
         System.out.println("unknown: I am a conquistador, and my name is Nial.");
         System.out.println("Hi Nial, I'm " + username + ".");
         {
         System.out.println("Nial: Well " + username + ", Christopher Columbus has discovered new land across the ocean! Everyone is welcome. You must join me!");
         System.out.println(username + ": I have a son and a job back home, so what's in it for me?");
         System.out.println("Nial: Rumor has it that Christopher and his men found areas filled with gold. Come with me, and you and your son won't have a job back home. We will be rich!");
         System.out.println(username + ": Those waters are dangerous, do you even have a boat?");
         System.out.println("Nial: Of course I have a boat! didn't you hear me when I told you I am a conquistador? Before I change my mind, choose if you want to come or not." );
         System.out.println(username + ": yes, I will join you on this adventure.");
         System.out.println("You are on the boat with Nial, a pig, and two guns. You have made it halfway through the waters when a huge wave knocks the boat over! Everything in the small boat including You and Nial are thrown into the water.");
         System.out.println("Nial is about ten feet away from you, and the supplies is in your reach. Nial is drowning and needs your help, but the pig and weapons are being taken by the current. Do you grab your only food source and weapons, or do you take the risk of drowning yourself to help Nial?");
         System.out.println("A. Grab pig and guns");
         System.out.println("B. Help Nial");
        
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
         System.out.println("You, the pig, and the weapons make it back on the boat. Nial is struggling to stay above the water. You know you made the right decision, but was it worth the guilt? To your surprise, Nial grabs ahold of the boat and pulls himself up. You are relieved, but you know Nial is angry.");
         System.out.println("***Nial will remember this***");
        Explore();
        }
        // If you answer B, then the game ends.
        if("B".equalsIgnoreCase(Input)) {
         System.out.println("You boost Nial onto the boat, but the current pulls you under water. You hear the muffled sound of Nial screaming your name. You drown and die.");
         System.out.println("GAME OVER");
        }
        }
    }        
     // this method branches off to two other methods. 
    static void Explore() { 
     Scanner A = new Scanner(System.in);
         System.out.println("Other than the pig squealing, the rest of the trip was silent. You reach land and begin exploring with Nial. As You walk, you run into a tribe. They prepare their spears, bows, and arrows for battle.");
         System.out.println("A. run");
         System.out.println("B. fight");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
            Run();
        }
        if("B".equalsIgnoreCase(Input)) {
            Fight();    
    }
    }
    // in all of my other methods, i used static void.
    static void Run() {
      Scanner A = new Scanner(System.in);  
         System.out.println("You and Nial run towards the trees; Nial is ahead of you. Your clothing gets stuck on a branch, and the tribe is gaining on you. Do you call for Nial, or try to hide?");     
         System.out.println("A. Call Nial");
         System.out.println("B. Try to hide");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
         System.out.println(username + ": Nial!");
         System.out.println("Nial turns around to face you; his eyes that were wide in fear quickly sadden.");
         System.out.println("The loud sound of a branch awakens Nial from thoughts of remorse. His sad eyes squint in hatred, he turns his back, and continues running.");
         System.out.println("The tribe is now only feet away. Your eyes fill with tears; tears like the water you left Nial to drown in. How could you expect Nial to help you after you left him?");
         System.out.println("You feel hands tugging on you. They tug you away from the branch, and your shirt rips. They drag you through the dirt. They drag you through sharp branches that cause you to bleed.");
         System.out.println("They drag you to your death.");
         System.out.println("GAME OVER");
        }
        if("B".equalsIgnoreCase(Input)) {
         System.out.println("Still caught on the branch, you lower yourself behind a bush. You look towards Nial, and he has stopped running. He follows your lead and hides too.");
         System.out.println("Seconds later, the tribe is searching the area around you and Nial. They follow footsteps leading towards the bush you are behind. They are about to find you when suddenly you hear a squeal.");
         System.out.println("The pig is with Nial and the tribe heard the pig! They ignore your footprints and follow the sound of the pig.");
         Nial();
        }       
    }       
     // you can win in this method or continue the game.          
    static void Fight() {
      Scanner A = new Scanner(System.in);
         System.out.println("You take out both guns and throw one to Nial. The tribe is confused by your weaponry. How can you scare the tribe into backing out of the fight?");
         System.out.println("A. shoot your pig");
         System.out.println("B. Shoot a member of the tribe");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
          System.out.println("Your gun fires, and the pig falls to the ground. Blood stains the dirt around the pig bright red. As if on cue, all eyes of the tribe widened.");
          System.out.println("Nial broke the silence by shooting his gun once into the air. All of the tribe screamed in fear. Those who carried weapons were quick to put them on the ground.");
          System.out.println("Although the tribe were terrified, they admired your weaponry. They gave You and Nial four pieces of corn.");
          System.out.println("You and Nial spent the night around a fire eating delicious roasted corn and pig. Nial complimented your plan of shooting the pig. You and Nial began digging for gold the next day and found much of it!");
          System.out.println("You and Nial made it back home with a lot of gold. You and your son lived a rich life, and you stayed good friends with Nial!");
          System.out.println("YOU WIN!");
        }
        if("B".equalsIgnoreCase(Input)) {
          System.out.println("You put a bullet in a man standing in the crowd of people holding weapons. All at once, the tribe shrieked. A woman ran out from behind the crowd and made her way to the man who was now on the floor. She laid over him and cried.");
          System.out.println("A small girl followed the woman and looked at her dead father in shock. Tears flooded her big eyes as she called for her father.");
          System.out.println("You turn to Nial. He is looking at you with a red face and clenched teeth.");
          Argue();
        }
    }
    // this method continues or ends.
    static void Nial() {
      Scanner A = new Scanner(System.in);
         System.out.println("A. Throw a rock in the other direction");
         System.out.println("B. Stay quiet");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
         System.out.println("You grab the nearest rock and throw it as far as you can. The tribe immediately turns towards the sound of the rock hitting the ground.");
         System.out.println("After the sound of the tribes footsteps fades, Nial cames out of the bush he was hiding in. He walks over to you and frees you from the branch.");
         System.out.println("You start to thank Nial, but he stops you. He faintly smiles and thanks you for saving him from the tribe. The small smile tells you that he wants to forgive you for leaving him to drown, but he "
                 + "is still traumatized. You tell him your welcome, and you both continue walking with the pig by your side.");
         Continue(); 
        } 
        if("B".equalsIgnoreCase(Input)) {
         System.out.println("The tribe took Nial, and the pig came out running. The pig ran under the same bush you were hiding in. The tribe grabbed Nial and followed the pig.");
         System.out.println("The tribe found the pig and you.");
         System.out.println("GAME OVER");
        }      
    }
    
    static void Continue() {
      Scanner A = new Scanner(System.in);
         System.out.println("You and Nial find a place to sleep for the night.");
         System.out.println("The sun rises and you and Nial begin the day. You find a river and decide to dig around this area. You and Nial have dug into a gold mine!");
         System.out.println("A. Steal Nial's share of dirt, and steal his boat");
         System.out.println("B. Split the dirt, and ride home on the boat together");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
         System.out.println("You left Nial on the new land, and you make it back home to your son. You and your son are super rich!");
         System.out.println("YOU WIN... but you are a greedy, bad person!");
            }
        if("B".equalsIgnoreCase(Input)) {
          System.out.println("You and Nial make it back home. You and your son are rich and you and Nial are best friends!");
          System.out.println("YOU WIN!");
        }
        
        
    }
    
    static void Argue() {
      Scanner A = new Scanner(System.in);  
         System.out.println("A. I didn't know he had a wife and kid.");
         System.out.println("B. I did what I had to do");
        Input = A.nextLine();
        if("A".equalsIgnoreCase(Input)) {
          System.out.println("Nial: I should have never brought you on my boat!");
          System.out.println("With trembling hands, Nial pointed his gun at you");
          Gun();
        }
        if("B".equalsIgnoreCase(Input)) {
          System.out.println("Nial: You didn't have to kill a man!");
          Shoot();
        } 
    }
    static void Gun() {
      Scanner A = new Scanner(System.in);
          System.out.println("A. Nial, put the gun down.");
          System.out.println("B. You wouldn't kill me; you wouldn't kill your friend.");
         Input = A.nextLine();
         if("A".equalsIgnoreCase(Input)) {
          System.out.println("You hear a gunshot. You feel a sharp pain in your side; you fall to the ground.");
          System.out.println("GAME OVER");
    }
         if("B".equalsIgnoreCase(Input)) {
           Shoot();  
         } 
          
         }
    
    static void Shoot() {
      Scanner A = new Scanner(System.in);
       System.out.println("Nial: I have every reason to shoot you. You are not my friend. You would have let me drown!");
       System.out.println("A. I regret not helping you. I had no right to leave you in the water, and I'm happy you made it back on the boat.");
       System.out.println("B. If I helped you I would've died! Please just lower the gun.");
       // if you enter A, then the game ends.
      Input = A.nextLine();
      if("A".equalsIgnoreCase(Input)) {
       System.out.println("Tears run down Nial’s cheeks. He throws the gun to the side and begins to cry. The women of the man you killed runs towards the gun and grabs it.");
       System.out.println("You hear a gunshot and feel a sharp pain on your side. You fall to the ground. You see a blurry image of Nial running over to your body.");
       System.out.println("Nial is trying to say something, but you can't focus on his words. Nial's image fades into darkness.");
       System.out.println("GAME OVER");

      }
    }
}