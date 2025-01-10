import java.util.Scanner;
public class Lyrics {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String text = "";

        System.out.println("Which song would you like the lyrics of?\n1. DEVO - The 4th Dimension\n2. Huey Lewis - The Power of Love\n"
                + "3. DEVO - Growing Pains\n4. The Police - Every Breath You Take\n5. Dire Straits - Walk of Life\n"
                + "6. Jermy Budd - All That I Needed (Was You)");
        String input = key.nextLine();
        if(input.equalsIgnoreCase("1"))
        {
            text = "DEVO - The 4th Dimension\n\nI tried and tried, finally I realized\nWhy she left this 3D world behind\n\nGo\n\n"
                    + "She got tired of the same old story\nShe had a mind that would not quit\nShe'd insist a plot must exist\n"
                    + "With an ending that she could not guess\n\nShe tried hard to convince me\nThen she took off like a bright idea\n"
                    + "She believed there just had to be\nA movie that she'd never seen\n\nI watched as her fingers drew\n"
                    + "A perfect line in space\nI watched as she looked on through\nInto another place\n\n"
                    + "She found out what she'd been missing\nShe decided she could change her luck\nShe was right, life's not black and white\n"
                    + "It's something more than meets the eye\n\nI watched as her fingers drew\nA perfect line in space\n"
                    + "I watched as she walked straight through\nInto another place\n\nShe parted with convention\n"
                    + "Now she's living in the 4th dimension\nWithout me\n\nI watched as her fingers drew\nA perfect line in space\n"
                    + "I watched as she walked straight through\nInto another place\n\nI tried and tried and still I don't know why\n"
                    + "She left me no address or a way to guess\nI tried and tried, finally I realized\nWhy she left this 3D world behind\n\n"
                    + "Now she's somewhere in the 4th dimension\nShe's living in 4D\nShe found herself a new direction there\n"
                    + "She's living without me\n\nShe's living in 4D\nShe's living without me\n\nSomewhere in the 4th dimension\n"
                    + "She's living in 4D\nShe found herself a new direction there\nShe's living without me\n\n"
                    + "She's living in 4D\nShe's living without me";
        }
        else if(input.equalsIgnoreCase("2"))
        {
            text = "Huey Lewis - The Power of Love\n\nThe power of love is a curious thing\nMake a one man weep, make another man sing\n"
                    + "Change a hawk to a little white dove\nMore than a feeling, that's the power of love\n\nTougher than diamonds, rich like cream\n"
                    + "Stronger and harder than a bad girl's dream\nMake a bad one good, make a wrong one right\nPower of love will keep you home at night\n\n"
                    + "You don't need money, don't take fame\nDon't need no credit card to ride this train\nIt's strong and it's sudden and it's cruel sometimes\n"
                    + "But it might just save your life\nThat's the power of love\nThat's the power of love\n\nFirst time you feel it, it might make you sad\n"
                    + "Next time you feel it, it might make you mad\nBut do be glad baby when you've found\nThat's the power makes the world go 'round\n\n"
                    + "And it don't take money, don't take fame\nDon't need no credit card to ride this train\nIt's strong and it's sudden, it can be cruel sometimes\n"
                    + "But it might just save your life\n\nThey say that all in love is fair\nYeah, but you don't care\nBut you know what to do (to do)\n"
                    + "When it gets hold of you\nAnd with a little help from above\nYou feel the power of love\nYou feel the power of love\n"
                    + "Can you feel it\nMmm-hmmm\n\nIt don't take money and it don't take fame\nDon't need no credit card to ride this train\n"
                    + "Tougher than diamonds and stronger than steel\nYou won't feel nothin' till you feel\n\nYou feel the power\n"
                    + "Just feel the power of love\nThat's the power\nThat's the power of love\nYou feel the power of love\nYou feel the power of love\n"
                    + "Feel the power of love";
        }
        else if(input.equalsIgnoreCase("3"))
        {
            text = "DEVO - Growing Pains\n\nSo young, so strong\nIgnorance is bliss\nThin skin caught up again\n"
                    + "In a place like this\n\nBig people set the trap for you\n"
                    + "Using you know what for brains\n"
                    + "You're just another lab experiment\n"
                    + "And you're easy to replace\n\n"
                    + "Too much too soon\n"
                    + "Sensors overload\n"
                    + "Brought down, chased out of town\n"
                    + "Another dangerous road\n\n"
                    + "Simply a problem of biology\n"
                    + "It's a choice you never make\n"
                    + "The scene is set and you're subjected to\n"
                    + "A lethal dose of growing pains\n\n"
                    + "Think it through, logic must be made for fools\n"
                    + "Leave them now and be\n"
                    + "A has been who never was\n"
                    + "They'll set you up with pains that grow";
        }
        else if(input.equalsIgnoreCase("4"))
        {
            text = "The Police - Every Breath You Take\n\n"
                    + "Every breath you take\r\n"
                    + "And every move you make\r\n"
                    + "Every bond you break\r\n"
                    + "Every step you take\r\n"
                    + "I'll be watching you\n\n"
                    + "Every single day\r\n"
                    + "And every word you say\r\n"
                    + "Every game you play\r\n"
                    + "Every night you stay\r\n"
                    + "I'll be watching you\n\n"
                    + "Oh, can't you see\r\n"
                    + "You belong to me?\r\n"
                    + "How my poor heart aches\r\n"
                    + "With every step you take?\n\n"
                    + "Every move you make\r\n"
                    + "And every vow you break\r\n"
                    + "Every smile you fake\r\n"
                    + "Every claim you stake\r\n"
                    + "I'll be watching you\n\n"
                    + "Since you've gone, I've been lost without a trace\r\n"
                    + "I dream at night, I can only see your face\r\n"
                    + "I look around, but it's you I can't replace\r\n"
                    + "I feel so cold, and I long for your embrace\r\n"
                    + "I keep crying, baby, baby please\n\n"
                    + "Oh, can't you see\r\n"
                    + "You belong to me?\r\n"
                    + "How my poor heart aches\r\n"
                    + "With every step you take?\n\n"
                    + "Every move you make\r\n"
                    + "And every vow you break\r\n"
                    + "Every smile you fake\r\n"
                    + "Every claim you stake\r\n"
                    + "I'll be watching you\r\n"
                    + "Every move you make\r\n"
                    + "Every step you take\r\n"
                    + "I'll be watching you\n\n"
                    + "I'll be watching you\r\n"
                    + "(Every breath you take)\r\n"
                    + "(Every move you make)\r\n"
                    + "(Every bond you break)\r\n"
                    + "(Every step you take) I'll be watching you\n\n"
                    + "I'll be watching you\n\n"
                    + "I'll be watching you\n\n"
                    + "whoo, hoo\r\n"
                    + "(Every game you play)\r\n"
                    + "(Every night you stay) I'll be watching you\n\n"
                    + "I'll be watching you\n\n"
                    + "I'll be watching you\n\n"
                    + "I'll be watching you\r\n"
                    + "(Every single day)\r\n"
                    + "(Every word you say)\r\n"
                    + "(Every game you play)\r\n"
                    + "(Every night you stay) I'll be watching you";
        }
        else if(input.equalsIgnoreCase("5"))
        {
            text = "Dire Straits - Walk of Life\n\n"
                    + "Woo-hoo, woo-hoo\n\n"
                    + "Here come Johnny singing oldies, goldies\r\n"
                    + "Be-bop-a-lula, baby, what I say\r\n"
                    + "Here come Johnny singin' \"I got a woman\"\r\n"
                    + "Down in the tunnels, trying to make it pay\n\n"
                    + "He got the action, he got the motion\r\n"
                    + "Oh, yeah, the boy can play\r\n"
                    + "Dedication, devotion\r\n"
                    + "He turnin' all the nighttime into the day\n\n"
                    + "The song about the sweet ole lovin' woman\r\n"
                    + "He do the song about the knife\r\n"
                    + "And he do the walk, do the walk of life\r\n"
                    + "Yeah, he do the walk of life\n\n"
                    + "Here come Johnny, gonna tell you a story\r\n"
                    + "Hand me now my walkin' shoes\r\n"
                    + "Here come Johnny with the power and the glory\r\n"
                    + "Backbeat, the talkin' blues\n\n"
                    + "He got the action, he got the motion\r\n"
                    + "Oh, yeah, the boy can play\r\n"
                    + "Dedication, devotion\r\n"
                    + "He turnin' all the nighttime into the day\n\n"
                    + "The song about the sweet ole lovin' woman\r\n"
                    + "He do the song about the knife\r\n"
                    + "And he do the walk, do the walk of life\r\n"
                    + "Yeah, he do the walk of life\n\n"
                    + "Here come Johnny singing oldies, goldies\r\n"
                    + "Be-bop-a-lula, baby, what I say\r\n"
                    + "Here come Johnny singing \"I got a woman\"\r\n"
                    + "Down in the tunnels, trying to make it pay\n\n"
                    + "He got the action, he got the motion\r\n"
                    + "Oh, yeah, the boy can play\r\n"
                    + "Dedication, devotion\r\n"
                    + "He turnin' all the nighttime into the day\n\n"
                    + "And after all the violence and double-talk\r\n"
                    + "There's just a song in all the trouble and the strife\r\n"
                    + "You do the walk, yeah, you do the walk of life\r\n"
                    + "Hmm, you do the walk of life\n\n"
                    + "A-woo-hoo\n\n"
                    + "Woo-hoo-hoo\n\n"
                    + "Woo-hoo-hoo\r\n"
                    + "Woo-hoo\r\n"
                    + "Woo-hoo-hoo\r\n"
                    + "Yeah, do the walk of life";
        }
        else if(input.equalsIgnoreCase("6"))
        {
            text = "Jermy Budd - All That I Needed (Was You)\n\n"
                    + "I used to think I was so smart\r\n"
                    + "But I couldn't hide the hole in my heart\r\n"
                    + "Sad as it seems none of my dreams\r\n"
                    + "Ever came true\n\n"
                    + "I used to walk the avenue\r\n"
                    + "All by myself with nothin' to do\r\n"
                    + "Kickin' at cans, half of a man\r\n"
                    + "Till I met you, and I knew\n\n"
                    + "I've looked for you all of my life\r\n"
                    + "Round every corner\r\n"
                    + "Wishin' on stars\r\n"
                    + "Like some kind of fool, ooh ooh\n\n"
                    + "But now I see the stars in your eyes\r\n"
                    + "Those days are over\r\n"
                    + "I took one look and I was hooked\r\n"
                    + "I found heaven in you\n\n"
                    + "And though my dream was overdue\r\n"
                    + "My prayer was answered out of the blue\r\n"
                    + "And now I know, I know it's true\r\n"
                    + "All that I needed was you\n\n"
                    + "I was lost, anyone could tell\r\n"
                    + "Just tossing dimes in wishing wells\r\n"
                    + "Out of money and down on luck\r\n"
                    + "Was I surprised when lightnin' struck\r\n"
                    + "And suddenly, you were sent to me\n\n"
                    + "My destiny, it was meant to be\r\n"
                    + "I didn't know before\r\n"
                    + "What I was living for\r\n"
                    + "But now I know for sure\r\n"
                    + "I have been waiting for you\n\n"
                    + "I never knew what I had missed\r\n"
                    + "Until the moment that we kissed\r\n"
                    + "Angel divine, now you are mine\r\n"
                    + "I feel brand new\n\n"
                    + "And now at last my life's complete\r\n"
                    + "Baby, your love's the missing piece\r\n"
                    + "Here in my arms, here in my heart\r\n"
                    + "All that I needed was you\n\n"
                    + "I've looked for you all of my life\r\n"
                    + "Round every corner\r\n"
                    + "Wishin' on stars\r\n"
                    + "Like some kind of fool, ooh ooh\n\n"
                    + "But now I see the stars in your eyes\r\n"
                    + "Those days are over\r\n"
                    + "I took one look and I was hooked\r\n"
                    + "I found heaven in you\n\n"
                    + "And though my dream was overdue\r\n"
                    + "My prayer was answered out of the blue\r\n"
                    + "And now I know, I know it's true\r\n"
                    + "All that I needed was you";
        }


        System.out.println("UC = uppercase.\nLC = lowecase.\nCA = character at mode.");
        input = key.nextLine();
        if(input.equalsIgnoreCase("uc"))
        {
            text = text.toUpperCase();
        }
        else if(input.equalsIgnoreCase("lc"))
        {
            text = text.toLowerCase();
        }
        else if(input.equalsIgnoreCase("ca"))
        {
            System.out.println("Select a character from the song (starts at 0)");
            int input2 = key.nextInt();
            if(input2 > -1 && input2 < text.length()-1)
            {
                System.out.print(text.charAt(input2) + "\n\n");
            }
        }

        for(int i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);//0.5s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        key.close();

    }


}
