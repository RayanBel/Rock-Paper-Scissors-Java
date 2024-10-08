public class Kata {
    private static boolean validation(String element, String[] options){ 
      boolean isItCorrect=false;
      for (int i=0;i<options.length;i++)
        if(element==options[i])
          isItCorrect=true;
      
      return isItCorrect;
    }
    public static String rps(String p1, String p2) {
      // Declare the options
      String[] option = {"rock", "scissors", "paper"};
      // Check if the hands are valid
      if(!(validation(p1,option)||validation(p1,option))){
        System.out.println("Non valid hands");
        return "Non valid hands";
      }
      // Check if both have the same, if it's, print and return "Draw!"
      if(p1==p2){
        System.out.println("Draw!");
        return "Draw!";
      }
      // Assign the option to the players
      int hand1 = (p1==option[0])?0:(p1==option[1])?1:2;
      int hand2 = (p2==option[0])?0:(p2==option[1])?1:2;
      // Check if player 1 win, if isn't, player 2 win.
      String winner="Player "+(((hand1==0&&hand2==1)||(hand1==1&&hand2==2)||(hand1==2&&hand2==0))?1:2)+" won!";
      System.out.println(winner);
      return winner;
    }
  }