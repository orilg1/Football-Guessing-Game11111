import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int score = 0;
    System.out.println("Would you like to start the game: ");
    String start = input.nextLine();
    if(start != "No")
    {

      System.out.println(" ");
      System.out.println("What was the first NFL team to win the superbowl?");
      System.out.println("1. Giants, 2. Falcons, 3. Packers, 4. Patriots");
      int answer1 = input.nextInt();
      if(answer1 == 3)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What does NFL stand for?");
      System.out.println("1. National Football League, 2. Nut Free Lemonade, 3. National Feet Length, 4. Natiowide Football Language");
      int answer2 = input.nextInt();
      if(answer2 == 1)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What year was the NFL created?");
      System.out.println("1. 1931, 2. 1949, 3. 1897, 4. 1920");
      int answer3 = input.nextInt();
      if(answer3 == 4)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("How many NFL teams are there?");
      System.out.println("1. 32, 2. 30, 3. 35, 4. 50");
      int answer4 = input.nextInt();
      if(answer4 == 1)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("How many games are there in the span of 17 weeks?");
      System.out.println("1. over 1000, 2. over 200, 3. over 100, 4. over 900");
      int answer5 = input.nextInt();
      if(answer5 == 2)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What is the NFL final game in the season called?");
      System.out.println("1. Wolrd Cup, 2. NFL Finals, 3. Last Game of the Season, 4. The Superbowl");
      int answer6 = input.nextInt();
      if(answer6 == 4)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("How much does the average NFL player make per year?");
      System.out.println("1. 900,000, 2. 2,000,000, 3. 10,000,000, 4. 8,000,000");
      int answer7 = input.nextInt();
      if(answer7 == 2)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What is the average height of an NFL player");
      System.out.println("1. 6'2, 2. 5'0, 3. 5'11, 4. 6'5");
      int answer8 = input.nextInt();
      if(answer8 == 1)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What is the average age of an NFL player?");
      System.out.println("1. 18, 2. 35, 3. 25, 4. 29");
      int answer9 = input.nextInt();
      if(answer9 == 3)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println("What is the rarest thing in football?");
      System.out.println("1. Touchdown, 2. Two point conversion, 3. Fumble, 4. One-point safety");
      int answer10 = input.nextInt();
      if(answer10 == 4)
      {
        System.out.println("Correct!");
        score++;
      }
      else
      {
        System.out.println("Sorry, you answered incorrectly");
      }

      System.out.println(" ");
      System.out.println(" ");
      System.out.println("You're total score is " + score);
    }
  }
}