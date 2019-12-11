int x = 250;
int y = 250;
int elSize = 200;
//1. Create three integer variables to represent the x, y, and the size of the ellipse
       
    void setup() {
      size(500,500);
      // 2. Set the size of your sketch
    
    }
    
    void draw() {
      background(#CBCBCB);
      ellipse(x, y, elSize, elSize);
      // 3. Set the background color of your sketch
      
      // 4. Draw an ellipse. Make sure it fits in the window.
      // Use the variables created at the top of the sketch, 
      // for the location and size of your ellipse
    
    }
    
    void mousePressed() {
      int distance = 0;
      distance = getDistance(mouseX, mouseY, x, y);
      if (distance < elSize){
       x = (int)random(width);
       y = (int)random(height);
      }
      //5. Create an integer variable called distance
      
      //6. Set the value of the distance variable to the value returned by the getDistance method
      //   Pass the mouse's x and y (mouseX and mouseY) and the x and y of your ellipse to the method.
        
          
      //7.  Use an if statement to check if the distance variable is < the radius of the ellipse
      //    If it is, set a new x and y for the ellipse, using a random location on the window
      //    Hint: Use the Processing random() function
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
