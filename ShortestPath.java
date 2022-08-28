package String;

public class ShortestPath {
    /*
     * Time complexity O(n)
     */
    public static float findShortestRoute(String route) {
        int n = route.length();
        int x = 0, y = 0;
        for(int i=0; i<n; i++) {
            char dir = route.charAt(i);
            //For South
            if(dir == 'S') {
                y--;
            }
            //For North
            else if(dir == 'N') {
                y++;
            }
            //For West
            else if(dir == 'W') {
                x--;
            }
            //For East
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
            
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]) {
        String route = "WNEENESENNN";
        System.out.println("Shorest path of this route is: "+findShortestRoute(route));
    }
}
