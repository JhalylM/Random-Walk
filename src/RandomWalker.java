public class RandomWalker
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0, distance = 0, steps = 0;

        System.out.println("(" + x + "," + y + ")");

        while (distance < r)
        {
            double i = Math.random();
            if (i < 0.25)
            {
                x++;
                System.out.println("(" + x + "," + y + ")");
                distance = Math.abs(x) + Math.abs(y);
                steps++;
            }
            if (i < 0.5)
            {
                x--;
                System.out.println("(" + x + "," + y + ")");
                distance = Math.abs(x) + Math.abs(y);
                steps++;
            }
            if (i < 0.75)
            {
                y++;
                System.out.println("(" + x + "," + y + ")");
                distance = Math.abs(x) + Math.abs(y);
                steps++;
            }
            if (i >= 0.75 && i < 1)
            {
                y--;
                System.out.println("(" + x + "," + y + ")");
                distance = Math.abs(x) + Math.abs(y);
                steps++;
            }
        }
        System.out.println("steps = " + steps);
    }
    }
