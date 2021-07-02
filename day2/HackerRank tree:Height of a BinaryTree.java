public static int height(Node root) {
      	// Write your code here.
          int lefth=0;
          int righth=0;
          if(root.left!=null)
          {
              lefth=1+height(root.left);
          }
          if(root.right!=null)
          {
              righth=1+height(root.right);
          }
          return Math.max(lefth,righth);
    }
